package PlaneGame07.PlaneGame05;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class GameUtil {
    // ��������ý�������˽�л���
    private GameUtil() {
    } 
 
    
    /**
     * ����ָ��·���ļ���ͼƬ����
     * @param path
     * @return
     */
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
}