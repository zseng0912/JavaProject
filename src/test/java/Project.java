/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class Project extends javax.swing.JPanel {


    JLabel pic;
    Timer tm;
    int x = 0;
    String[] list = {
        "C:\\Users\\USER\\OneDrive - Asia Pacific University\\Desktop\\Java Programming\\JAVA_Assignment\\src\\main\\resources\\Images\\imageSlide1",
        "C:\\Users\\USER\\OneDrive - Asia Pacific University\\Desktop\\Java Programming\\JAVA_Assignment\\src\\main\\resources\\Images\\imageSlide2",
        "C:\\Users\\USER\\OneDrive - Asia Pacific University\\Desktop\\Java Programming\\JAVA_Assignment\\src\\main\\resources\\Images\\imageSlide3",
        "C:\\Users\\USER\\OneDrive - Asia Pacific University\\Desktop\\Java Programming\\JAVA_Assignment\\src\\main\\resources\\Images\\imageSlide4",
        "C:\\Users\\USER\\OneDrive - Asia Pacific University\\Desktop\\Java Programming\\JAVA_Assignment\\src\\main\\resources\\Images\\imageSlide5"
    };


    public Project() {
        setOpaque(false); // Make the panel transparent
        setLayout(null); // Use absolute positioning

        pic = new JLabel();
        pic.setBounds(0, 0, 460, 310);
        add(pic);

        SetImageSize(4);

        tm = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetImageSize(x);
                x += 1;
                if (x >= list.length) {
                    x = 0;
                }
            }
        });

        tm.start();
        setSize(460, 310);
        setVisible(true);
    }

    public void SetImageSize(int i) {
        ImageIcon icon = new ImageIcon(list[i]);
        Image img = icon.getImage();

        // Create a rounded rectangle version of the image
        int width = img.getWidth(null);
        int height = img.getHeight(null);
        int arcWidth = 20; // The width of the rounded corners
        int arcHeight = 20; // The height of the rounded corners
        Image roundedImg = createRoundedRectangleImage(img, width, height, arcWidth, arcHeight);

        // Set the rounded rectangle image as the label's icon
        ImageIcon roundedIcon = new ImageIcon(roundedImg);
        pic.setIcon(roundedIcon);
    }

    private Image createRoundedRectangleImage(Image img, int width, int height, int arcWidth, int arcHeight) {
        BufferedImage roundedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = roundedImage.createGraphics();

        // Set rendering hints for smoother edges
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

        // Create a rounded rectangle shape
        RoundRectangle2D roundedRect = new RoundRectangle2D.Double(0, 0, width, height, arcWidth, arcHeight);
        g.setClip(roundedRect);

        // Draw the image onto the rounded rectangle shape
        g.drawImage(img, 0, 0, width, height, null);
        g.dispose();

        return roundedImage;
    }
}
