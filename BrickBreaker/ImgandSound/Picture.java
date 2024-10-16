package ImgandSound;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Picture {
    private static Map<String, BufferedImage> cache = new HashMap<String, BufferedImage>();

    public static void draw(Graphics g, String filepath, int x, int y) {
        try {
        BufferedImage img;
        if(cache.containsKey(filepath)) {
            img = cache.get(filepath);
        }else {

                img = ImageIO.read(new File(filepath));

            cache.put(filepath, img);
        }
        g.drawImage(img, x, y,  null);
         } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

    }

    public static void draw(Graphics g, String filepath, int x, int y, int width, int height, int subimage) {
        try {
            BufferedImage img;
            if (cache.containsKey(filepath)) {
                img = cache.get(filepath);
            } else {
                img = ImageIO.read(new File(filepath));
                cache.put(filepath, img);
            }
            g.drawImage(img.getSubimage(subimage * width, 0, width, height), x, y, null);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
