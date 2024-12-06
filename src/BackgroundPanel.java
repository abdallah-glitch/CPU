import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class BackgroundPanel extends JPanel {

    private Image backgroundImage;

    public BackgroundPanel(String filePath) {
        try {
         
            backgroundImage = ImageIO.read(new File("C:/Users/abdal/Downloads/OIP.PNG"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Background image file not found at: " + "C:/Users/abdal/Downloads/OIP.PNG");
        }
         setLayout(null);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
       
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
