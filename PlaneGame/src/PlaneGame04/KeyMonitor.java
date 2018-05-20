package PlaneGame04;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * 作者：seak
 * 内容：
 * 时间：2018/05/20 21:05
 * 命名规则
 * 常量：MAC_VALUE
 * 类名：class Man
 * 其他：驼峰
 */
/*public class KeyMonitor implements KeyListener {
    @Override//重写键盘上下键
    public void keyPressed(KeyEvent e){
        System.out.println("按下:"+e.getKeyCode());
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }



    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("抬起:"+e.getKeyCode());
    }
}*/


        //键盘控制

      public  class KeyMonitor extends KeyAdapter {
            @Override//重写键盘上下键
            public void keyPressed(KeyEvent e){
                System.out.println(e.getKeyCode());
            }

            @Override
            public void keyReleased(KeyEvent e){
                System.out.println(e.getKeyCode());
            }
        }
