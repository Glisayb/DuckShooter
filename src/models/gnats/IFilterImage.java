package models.gnats;

import com.company.StaticClasses;

import javax.swing.*;
import java.awt.*;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageFilter;
import java.awt.image.ImageProducer;

public interface IFilterImage {

    static Image filterImage(String path) {
        Image image = new ImageIcon(path).getImage();
        ImageFilter bgFilter = new StaticClasses.BackgroundFilter();
        ImageProducer ip = new FilteredImageSource(image.getSource(), bgFilter);
        image = Toolkit.getDefaultToolkit().createImage(ip);
        return image;
    }
}
