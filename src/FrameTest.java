import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FrameTest extends JFrame {

    FrameTest(String windowTitle, String absolutePath){

        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.RED);
        Rectangle rectangle = new Rectangle(0, 40, 333, 300);
        redpanel.setBounds(rectangle);
        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.BLUE);
        bluepanel.setBounds(333, 40, 333, 300);
        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.GREEN);
        greenpanel.setBounds(666, 40, 333, 300);

        JFrame frame = new JFrame();
        frame.setSize(999,340);
        Border border = BorderFactory.createLineBorder(Color.BLACK,3);
        ImageIcon image = new ImageIcon(absolutePath+"\\image.png");
        ImageIcon imageGIF = new ImageIcon(absolutePath+"\\imageGIF.gif");
        frame.setTitle(windowTitle);
        frame.setResizable(false);
        //frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(image.getImage());
        frame.setLayout(null);

        JLabel label = new JLabel();
        label.setBounds(375,0,250,40);
        label.setFont(new Font("Comic Sans MS", Font.PLAIN,20));
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setOpaque(true);
        //label.setBackground(Color.BLACK);
        //label.setIcon(imageGIF);
        label.setText("Allocate your points!");
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);
        frame.add(redpanel);
        frame.add(bluepanel);
        frame.add(greenpanel);
        //frame.pack();
        frame.setVisible(true);
    }

}
