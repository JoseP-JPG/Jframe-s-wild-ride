import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FrameTest extends JFrame {

    FrameTest(String windowTitle, String absolutePath){

        this.setSize(999,340);

        ImageIcon imageHP = new ImageIcon(absolutePath+"\\HP.png");
        ImageIcon imageStrength = new ImageIcon(absolutePath+"\\Strength.png");
        ImageIcon imageAgility = new ImageIcon(absolutePath+"\\Agility.png");
        ImageIcon image = new ImageIcon(absolutePath+"\\image.png");
        ImageIcon imageGIF = new ImageIcon(absolutePath+"\\imageGIF.gif");

        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.RED);
        redpanel.setBounds(0, 40, 333, 300);
        redpanel.setLayout(new BorderLayout());
        JLabel HPlabel = new JLabel();
        HPlabel.setIcon(imageHP);
        HPlabel.setText("HP");
        HPlabel.setHorizontalTextPosition(JLabel.CENTER);
        HPlabel.setVerticalTextPosition(JLabel.BOTTOM);
        //HPlabel.setHorizontalAlignment(JLabel.CENTER);
        //HPlabel.setVerticalAlignment(JLabel.TOP);
        HPlabel.setFont(new Font("Comic Sans MS", Font.PLAIN,16));
        HPlabel.setIconTextGap(0);
        JLabel HPbutton = new JLabel();
        HPbutton.setText("button");
        //HPbutton.setHorizontalAlignment(JLabel.CENTER);
        //HPbutton.setVerticalAlignment(JLabel.BOTTOM);
        HPbutton.setFont(new Font("Comic Sans MS", Font.PLAIN,20));
        HPbutton.setIconTextGap(0);
        JPanel northpanel = new JPanel();
        northpanel.setBackground(Color.RED);
        northpanel.add(HPlabel);
        JPanel centrepanel = new JPanel();
        centrepanel.setBackground(Color.RED);
        centrepanel.add(HPbutton);
        redpanel.add(northpanel, BorderLayout.NORTH);
        redpanel.add(centrepanel, BorderLayout.SOUTH);

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.BLUE);
        bluepanel.setBounds(333, 40, 333, 300);
        JLabel STRENGTHlabel = new JLabel();
        STRENGTHlabel.setIcon(imageStrength);
        STRENGTHlabel.setText("Strength");
        STRENGTHlabel.setHorizontalTextPosition(JLabel.CENTER);
        STRENGTHlabel.setVerticalTextPosition(JLabel.BOTTOM);
        STRENGTHlabel.setFont(new Font("Comic Sans MS", Font.PLAIN,16));
        STRENGTHlabel.setIconTextGap(0);


        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.GREEN);
        greenpanel.setBounds(666, 40, 333, 300);
        JLabel AGILITYlabel = new JLabel();
        AGILITYlabel.setIcon(imageAgility);
        AGILITYlabel.setText("Agility");
        AGILITYlabel.setHorizontalTextPosition(JLabel.CENTER);
        AGILITYlabel.setVerticalTextPosition(JLabel.BOTTOM);
        AGILITYlabel.setFont(new Font("Comic Sans MS", Font.PLAIN,16));
        AGILITYlabel.setIconTextGap(0);

        Border border = BorderFactory.createLineBorder(Color.BLACK,3);
        this.setTitle(windowTitle);
        this.setResizable(false);
        //frame.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(image.getImage());

        JLabel pointTextLabel = new JLabel();
        pointTextLabel.setBounds(41,0,250,40);
        pointTextLabel.setFont(new Font("Comic Sans MS", Font.PLAIN,20));
        pointTextLabel.setHorizontalTextPosition(JLabel.CENTER);
        pointTextLabel.setVerticalTextPosition(JLabel.BOTTOM);
        pointTextLabel.setOpaque(true);
        //label.setBackground(Color.BLACK);
        //label.setIcon(imageGIF);
        pointTextLabel.setText("Allocate your points!");
        pointTextLabel.setBorder(border);
        pointTextLabel.setVerticalAlignment(JLabel.TOP);
        pointTextLabel.setHorizontalAlignment(JLabel.CENTER);

        JLabel pointLabel = new JLabel();
        pointLabel.setBounds(375,0,250,40);
        pointLabel.setFont(new Font("Comic Sans MS", Font.PLAIN,20));
        pointLabel.setHorizontalTextPosition(JLabel.CENTER);
        pointLabel.setVerticalTextPosition(JLabel.BOTTOM);
        pointLabel.setOpaque(true);
        //label.setBackground(Color.BLACK);
        //label.setIcon(imageGIF);
        pointLabel.setText("3 points left");
        pointLabel.setVerticalAlignment(JLabel.TOP);
        pointLabel.setHorizontalAlignment(JLabel.CENTER);

        bluepanel.add(STRENGTHlabel);

        greenpanel.add(AGILITYlabel);

        this.setLayout(null);
        this.setBackground(Color.WHITE);
        this.add(pointTextLabel);
        this.add(pointLabel);
        this.add(redpanel);
        this.add(bluepanel);
        this.add(greenpanel);
        this.setVisible(true);
    }

}
