import javax.swing.*;
import java.awt.*;

public class FrameTest extends JFrame {

    FrameTest(String windowTitle, String absolutePath){
        JFrame frame = new JFrame();
        ImageIcon image = new ImageIcon(absolutePath+"\\image.png");
        ImageIcon imageGIF = new ImageIcon(absolutePath+"\\imageGIF.gif");
        frame.setSize(1000,700);
        frame.setTitle(windowTitle);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(image.getImage());

        JLabel label = new JLabel();
        label.setFont(new Font("Comic Sans MS", Font.PLAIN,20));
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setIcon(imageGIF);
        label.setText("Allocate your points!");
        frame.add(label);

        frame.setVisible(true);
    }

}
