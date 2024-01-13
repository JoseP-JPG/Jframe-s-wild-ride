import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FrameTest extends JFrame {

    FrameTest(String windowTitle, String absolutePath){

        //this.setSize(999,340);
        this.getContentPane().setPreferredSize(new Dimension(999,340));
        this.setLayout(null);
        int points=3;
        int pointsHP=0;
        int pointsStr=1;
        int pointsAgl=2;
        Border border = BorderFactory.createLineBorder(Color.BLACK,3);

        ImageIcon imageHP = new ImageIcon(absolutePath+"\\HP.png");
        ImageIcon imageStrength = new ImageIcon(absolutePath+"\\Strength.png");
        ImageIcon imageAgility = new ImageIcon(absolutePath+"\\Agility.png");
        ImageIcon image = new ImageIcon(absolutePath+"\\image.png");
        ImageIcon imageGIF = new ImageIcon(absolutePath+"\\imageGIF.gif");

        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.RED);
        redpanel.setBounds(0, 40, 333, 300);
        //redpanel.setLayout(null);
        redpanel.setLayout(new BorderLayout());
        JLabel HPlabel = new JLabel();
        //HPlabel.setBounds(333/2-imageHP.getIconWidth()/2,0,imageHP.getIconWidth(),imageHP.getIconHeight()+20);
        HPlabel.setIcon(imageHP);
        HPlabel.setText("HP");
        HPlabel.setHorizontalTextPosition(JLabel.CENTER);
        HPlabel.setVerticalTextPosition(JLabel.BOTTOM);
        HPlabel.setHorizontalAlignment(JLabel.CENTER);
        HPlabel.setFont(new Font("Comic Sans MS", Font.PLAIN,16));
        HPlabel.setIconTextGap(0);
        JLabel HPbutton = new JLabel();
        //HPbutton.setBounds(333/2-7,150-34,14,22);
        HPbutton.setText(String.valueOf(pointsHP));
        HPbutton.setFont(new Font("Comic Sans MS", Font.PLAIN,20));
        HPbutton.setHorizontalAlignment(JLabel.CENTER);
        HPbutton.setIconTextGap(0);
        redpanel.add(HPlabel, BorderLayout.NORTH);
        redpanel.add(HPbutton, BorderLayout.CENTER);
        redpanel.add(Box.createRigidArea(new Dimension(0, imageHP.getIconHeight()+HPlabel.getFont().getSize())),BorderLayout.SOUTH);

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.BLUE);
        bluepanel.setBounds(333, 40, 333, 300);
        //bluepanel.setLayout(null);
        bluepanel.setLayout(new BorderLayout());
        JLabel STRENGTHlabel = new JLabel();
        //STRENGTHlabel.setBounds(333/2-(imageStrength.getIconWidth()+20)/2,0,imageStrength.getIconWidth()+20,imageStrength.getIconHeight()+20);
        STRENGTHlabel.setIcon(imageStrength);
        STRENGTHlabel.setText("Strength");
        STRENGTHlabel.setHorizontalTextPosition(JLabel.CENTER);
        STRENGTHlabel.setVerticalTextPosition(JLabel.BOTTOM);
        STRENGTHlabel.setHorizontalAlignment(JLabel.CENTER);
        STRENGTHlabel.setFont(new Font("Comic Sans MS", Font.PLAIN,16));
        STRENGTHlabel.setIconTextGap(0);
        JLabel STRENGTHbutton = new JLabel();
        //STRENGTHbutton.setBounds(333/2-7,150-34,14,22);
        STRENGTHbutton.setText(String.valueOf(pointsStr));
        STRENGTHbutton.setHorizontalAlignment(JLabel.CENTER);
        STRENGTHbutton.setFont(new Font("Comic Sans MS", Font.PLAIN,20));
        STRENGTHbutton.setIconTextGap(0);
        bluepanel.add(STRENGTHlabel, BorderLayout.NORTH);
        bluepanel.add(STRENGTHbutton, BorderLayout.CENTER);
        bluepanel.add(Box.createRigidArea(new Dimension(0, imageStrength.getIconHeight()+STRENGTHlabel.getFont().getSize())),BorderLayout.SOUTH);

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.GREEN);
        greenpanel.setBounds(666, 40, 333, 300);
        //greenpanel.setLayout(null);
        greenpanel.setLayout(new BorderLayout());
        JLabel AGILITYlabel = new JLabel();
        //AGILITYlabel.setBounds(333/2-imageAgility.getIconWidth()/2,0,imageAgility.getIconWidth(),imageAgility.getIconHeight()+20);
        AGILITYlabel.setIcon(imageAgility);
        AGILITYlabel.setText("Agility");
        AGILITYlabel.setHorizontalTextPosition(JLabel.CENTER);
        AGILITYlabel.setVerticalTextPosition(JLabel.BOTTOM);
        AGILITYlabel.setHorizontalAlignment(JLabel.CENTER);
        AGILITYlabel.setFont(new Font("Comic Sans MS", Font.PLAIN,16));
        AGILITYlabel.setIconTextGap(0);
        JLabel AGILITYbutton = new JLabel();
        //AGILITYbutton.setBounds(333/2-7,150-34,14,22);
        AGILITYbutton.setText(String.valueOf(pointsAgl));
        AGILITYbutton.setFont(new Font("Comic Sans MS", Font.PLAIN,20));
        AGILITYbutton.setHorizontalAlignment(JLabel.CENTER);
        AGILITYbutton.setIconTextGap(0);
        greenpanel.add(AGILITYlabel, BorderLayout.NORTH);
        greenpanel.add(AGILITYbutton, BorderLayout.CENTER);
        greenpanel.add(Box.createRigidArea(new Dimension(0, imageAgility.getIconHeight()+AGILITYlabel.getFont().getSize())),BorderLayout.SOUTH);

        this.setTitle(windowTitle);
        this.setResizable(false);
        //this.setResizable(true);
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
        pointLabel.setText(points+" points left");
        pointLabel.setVerticalAlignment(JLabel.TOP);
        pointLabel.setHorizontalAlignment(JLabel.CENTER);

        this.setBackground(Color.WHITE);
        this.add(pointTextLabel);
        this.add(pointLabel);
        this.add(redpanel);
        this.add(bluepanel);
        this.add(greenpanel);
        this.setVisible(true);
        this.pack();
        //System.out.println(STRENGTHlabel.getBounds());
        //bluesouth.setBounds(STRENGTHlabel.getBounds());
    }

}
