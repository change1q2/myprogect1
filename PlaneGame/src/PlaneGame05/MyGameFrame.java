package PlaneGame05;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * ??????????????
 * @author ???
 *
 */
public class MyGameFrame  extends  JFrame {
	
	Image   planeImg  = GameUtil.getImage("images/plane.png");
	Image   bg  = GameUtil.getImage("images/bg.jpg");
	
	Plane   plane = new Plane(planeImg,250,250);
	
	@Override
	public void paint(Graphics g) {		//???????????  g??????????
		
		g.drawImage(bg, 0, 0, null);
		
		plane.drawSelf(g);  //?????
		
	}
	
	
	//?????????????????????
	class  PaintThread  extends  Thread  {
		@Override
		public void run() {
			while(true){
				repaint();		//???
				
				try {
					Thread.sleep(40);   	//1s=1000ms
				} catch (InterruptedException e) {
					e.printStackTrace();
				}		
			}
		}
		
	}
	
	//?????????????????
	class   KeyMonitor extends  KeyAdapter  {

		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println("?????"+e.getKeyCode());
		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("???"+e.getKeyCode());
		}
		
		
	}
	
	
	/**
	 * ?????????
	 */
	public  void  launchFrame(){
		this.setTitle("???????_????????");
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocation(300, 300);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		new PaintThread().start();	//???????????????
		addKeyListener(new KeyMonitor());   //?????????????????
	}
	
	public static void main(String[] args) {
		MyGameFrame  f = new MyGameFrame();
		f.launchFrame();
	}
	
}
