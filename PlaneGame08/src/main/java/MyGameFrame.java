import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MyGameFrame  extends  Frame {
	
	Image   planeImg  = GameUtil.getImage("images/plane.png");
	Image   bg  = GameUtil.getImage("images/bg.jpg");

	Plane plane = new Plane(planeImg,250,250);
	Shell shell = new Shell();
	Shell[] shells = new Shell[50];
	
	@Override
	public void paint(Graphics g) {		//自动被调用。  g相当于一只画笔
		
		g.drawImage(bg, 0, 0, null);
		
		plane.drawSelf(g);  //画飞机

		//shell.draw(g);//画炮弹

        //画所有炮弹
        for(int i =0 ;i<shells.length;i++){
            shells[i].draw(g);

            //飞机和炮弹的碰撞检测
			boolean peng = shells[i].getRect().intersects(plane.getRect());
			if(peng){
				System.out.println("相撞了");
				if(peng){
					plane.live = false;
				}
			}
        }
	}


	//帮助我们反复的重画窗口
	class  PaintThread  extends  Thread  {
		@Override
		public void run() {
			while(true){
				repaint();	//重画
				
				try {
					Thread.sleep(40);   	//1s=1000ms
				} catch (InterruptedException e) {
					e.printStackTrace();
				}		
			}
		}
		
	}

	//定义键盘监听的内部类
	class   KeyMonitor extends  KeyAdapter  {

		@Override
		public void keyPressed(KeyEvent e) {
			plane.addDirection(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			plane.minusDirection(e);
		}


	}


	/**
	 * 初始化窗口
	 */
	public  void  launchFrame(){
		this.setTitle("尚学堂学员_海海");
		this.setVisible(true);
		this.setSize(Constant.GAME_WIDH, Constant.GAME_HEIGHT);
		this.setLocation(300, 300);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		new PaintThread().start();	//启动重画窗口的线程
		addKeyListener(new KeyMonitor());  //给窗口增加键盘的监听

		//初始化50个炮弹
		for(int i = 0; i < shells.length;i++){
			shells[i] = new Shell();
		}
	}
	
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}

	//应为会闪烁加入双缓冲
	private Image offScreenImage = null;

	public void update(Graphics g){
		if(offScreenImage == null)
			offScreenImage = this.createImage(Constant.GAME_WIDH,Constant.GAME_HEIGHT);//游戏的宽和高度

		Graphics gOff = offScreenImage.getGraphics();
		paint(gOff);
		g.drawImage(offScreenImage,0,0,null);
	}
	
}
