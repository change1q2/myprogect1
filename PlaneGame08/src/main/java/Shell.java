import java.awt.*;

/**
 * 作者：seak
 * 内容：
 * 时间：2018/05/22 8:20
 * 命名规则
 * 常量：MAC_VALUE
 * 类名：class Man
 * 其他：驼峰
 */
public class Shell extends GameObject {
    double degree;

    public Shell(){
        x = 200;
        y = 200;
        width =10;
        height = 10;
        speed = 3;

        degree = Math.random()*Math.PI*2;
    }

    public void draw(Graphics g){
        Color c = g.getColor();
        g.setColor(Color.YELLOW);

        g.fillOval((int)x,(int)y,width,height);
//小球出现的轨迹
        //x = x+speed*Math.cos(degree);
        x += speed*Math.cos(degree);
       // y = y+speed*Math.sin(degree);
        y += speed*Math.sin(degree);
//把小球进行翻转
        if(x<0||x>Constant.GAME_WIDH-width){
            degree = Math.PI - degree;
        }
        if(y<30||y>Constant.GAME_HEIGHT-height){
            degree = -degree;

        }
        g.setColor(c);
    }
}
