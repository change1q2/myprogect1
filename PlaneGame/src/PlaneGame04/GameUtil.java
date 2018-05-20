package PlaneGame04;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

/**
 * 作者：seak
 * 内容：工具了类的使用
 * 时间：2018/05/20 11:34
 */
public class GameUtil {
    //工具类最好都私有化
    private GameUtil(){

    }

    //返回指定路径的图片对象
    public static Image getImage(String path){
        BufferedImage bi = null;
        try{
            URL u = GameUtil.class.getClassLoader().getResource(path);
            bi = ImageIO.read(u);
        }catch (IOException e){
            e.printStackTrace();
        }
        return bi;
    }
}


/*
public class GameUtil {
    // 工具类最好将构造器私有化。
    private GameUtil() {
    }


    */
/**
     * 返回指定路径文件的图片对象
     * @param path
     * @return
     *//*

    public static Image getImage(String path) {
        BufferedImage bi = null;
        try {
            URL u = GameUtil.class.getClassLoader().getResource(path);
            bi = ImageIO.read(u);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bi;
    }
}*/
