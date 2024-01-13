import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameTest extends JFrame implements ActionListener{


    int points=3;
    int pointsHP=0;
    int pointsStr=0;
    int pointsAgl=0;

    JLabel HPbutton;
    JButton HPdown;
    JButton HPup;

    JLabel STRENGTHbutton;
    JButton STRENGTHdown;
    JButton STRENGTHup;

    JLabel AGILITYbutton;
    JButton AGILITYdown;
    JButton AGILITYup;

    JLabel pointLabel;

    FrameTest(String windowTitle, String absolutePath){

        //this.setSize(999,340);
        this.getContentPane().setPreferredSize(new Dimension(999,340));
        this.setLayout(null);

        Border border = BorderFactory.createLineBorder(Color.BLACK,3);

        ImageIcon imageHP = new ImageIcon(absolutePath+"\\HP.png");
        ImageIcon imageStrength = new ImageIcon(absolutePath+"\\Strength.png");
        ImageIcon imageAgility = new ImageIcon(absolutePath+"\\Agility.png");
        ImageIcon image = new ImageIcon(absolutePath+"\\image.png");
        ImageIcon imageGIF = new ImageIcon(absolutePath+"\\imageGIF.gif");

        JPanel redpanel = new JPanel();
        //redpanel.setBackground(Color.RED);
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
        HPbutton = new JLabel();
        //HPbutton.setBounds(333/2-7,150-34,14,22);
        HPbutton.setText(String.valueOf(pointsHP));
        HPbutton.setFont(new Font("Comic Sans MS", Font.PLAIN,50));
        HPbutton.setHorizontalAlignment(JLabel.CENTER);
        HPbutton.setIconTextGap(0);

        JPanel redbutton1 = new JPanel();
        redbutton1.setLayout(new BorderLayout());
        HPdown = new JButton();
        HPdown.addActionListener(this);
        HPdown.setSize(20, 20);
        HPdown.setText("«");
        HPdown.setFont(new Font("Comic Sans MS", Font.PLAIN,20));
        redbutton1.add(HPdown, BorderLayout.CENTER);
        redbutton1.add(Box.createRigidArea(new Dimension(0, imageHP.getIconHeight())),BorderLayout.SOUTH);
        redbutton1.add(Box.createRigidArea(new Dimension(0, imageHP.getIconHeight())),BorderLayout.NORTH);
        redbutton1.add(Box.createRigidArea(new Dimension(40, 0)),BorderLayout.WEST);
        redbutton1.add(Box.createRigidArea(new Dimension(5, 0)),BorderLayout.EAST);


        JPanel redbutton2 = new JPanel();
        redbutton2.setLayout(new BorderLayout());
        HPup = new JButton();
        HPup.addActionListener(this);
        HPup.setSize(20, 20);
        HPup.setText("»");
        HPup.setFont(new Font("Comic Sans MS", Font.PLAIN,20));
        redbutton2.add(HPup, BorderLayout.CENTER);
        redbutton2.add(Box.createRigidArea(new Dimension(0, imageHP.getIconHeight())),BorderLayout.SOUTH);
        redbutton2.add(Box.createRigidArea(new Dimension(0, imageHP.getIconHeight())),BorderLayout.NORTH);
        redbutton2.add(Box.createRigidArea(new Dimension(5, 0)),BorderLayout.WEST);
        redbutton2.add(Box.createRigidArea(new Dimension(40, 0)),BorderLayout.EAST);

        redpanel.add(HPlabel, BorderLayout.NORTH);
        redpanel.add(redbutton1, BorderLayout.WEST);
        redpanel.add(HPbutton, BorderLayout.CENTER);
        redpanel.add(redbutton2, BorderLayout.EAST);
        redpanel.add(Box.createRigidArea(new Dimension(0, imageHP.getIconHeight()+HPlabel.getFont().getSize())),BorderLayout.SOUTH);

        JPanel bluepanel = new JPanel();
        //bluepanel.setBackground(Color.BLUE);
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
        STRENGTHbutton = new JLabel();
        //STRENGTHbutton.setBounds(333/2-7,150-34,14,22);
        STRENGTHbutton.setText(String.valueOf(pointsStr));
        STRENGTHbutton.setHorizontalAlignment(JLabel.CENTER);
        STRENGTHbutton.setFont(new Font("Comic Sans MS", Font.PLAIN,50));
        STRENGTHbutton.setIconTextGap(0);

        JPanel bluebutton1 = new JPanel();
        bluebutton1.setLayout(new BorderLayout());
        STRENGTHdown = new JButton();
        STRENGTHdown.addActionListener(this);
        STRENGTHdown.setSize(20, 20);
        STRENGTHdown.setText("«");
        STRENGTHdown.setFont(new Font("Comic Sans MS", Font.PLAIN,20));
        bluebutton1.add(STRENGTHdown, BorderLayout.CENTER);
        bluebutton1.add(Box.createRigidArea(new Dimension(0, imageHP.getIconHeight())),BorderLayout.SOUTH);
        bluebutton1.add(Box.createRigidArea(new Dimension(0, imageHP.getIconHeight())),BorderLayout.NORTH);
        bluebutton1.add(Box.createRigidArea(new Dimension(40, 0)),BorderLayout.WEST);
        bluebutton1.add(Box.createRigidArea(new Dimension(5, 0)),BorderLayout.EAST);


        JPanel bluebutton2 = new JPanel();
        bluebutton2.setLayout(new BorderLayout());
        STRENGTHup = new JButton();
        STRENGTHup.addActionListener(this);
        STRENGTHup.setSize(20, 20);
        STRENGTHup.setText("»");
        STRENGTHup.setFont(new Font("Comic Sans MS", Font.PLAIN,20));
        bluebutton2.add(STRENGTHup, BorderLayout.CENTER);
        bluebutton2.add(Box.createRigidArea(new Dimension(0, imageHP.getIconHeight())),BorderLayout.SOUTH);
        bluebutton2.add(Box.createRigidArea(new Dimension(0, imageHP.getIconHeight())),BorderLayout.NORTH);
        bluebutton2.add(Box.createRigidArea(new Dimension(5, 0)),BorderLayout.WEST);
        bluebutton2.add(Box.createRigidArea(new Dimension(40, 0)),BorderLayout.EAST);


        bluepanel.add(STRENGTHlabel, BorderLayout.NORTH);
        bluepanel.add(STRENGTHbutton, BorderLayout.CENTER);
        bluepanel.add(bluebutton1, BorderLayout.WEST);
        bluepanel.add(bluebutton2, BorderLayout.EAST);
        bluepanel.add(Box.createRigidArea(new Dimension(0, imageStrength.getIconHeight()+STRENGTHlabel.getFont().getSize())),BorderLayout.SOUTH);

        JPanel greenpanel = new JPanel();
        //greenpanel.setBackground(Color.GREEN);
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
        AGILITYbutton = new JLabel();
        //AGILITYbutton.setBounds(333/2-7,150-34,14,22);
        AGILITYbutton.setText(String.valueOf(pointsAgl));
        AGILITYbutton.setFont(new Font("Comic Sans MS", Font.PLAIN,50));
        AGILITYbutton.setHorizontalAlignment(JLabel.CENTER);
        AGILITYbutton.setIconTextGap(0);

        JPanel greenbutton1 = new JPanel();
        greenbutton1.setLayout(new BorderLayout());
        AGILITYdown = new JButton();
        AGILITYdown.addActionListener(this);
        AGILITYdown.setSize(20, 20);
        AGILITYdown.setText("«");
        AGILITYdown.setFont(new Font("Comic Sans MS", Font.PLAIN,20));
        greenbutton1.add(AGILITYdown, BorderLayout.CENTER);
        greenbutton1.add(Box.createRigidArea(new Dimension(0, imageHP.getIconHeight())),BorderLayout.SOUTH);
        greenbutton1.add(Box.createRigidArea(new Dimension(0, imageHP.getIconHeight())),BorderLayout.NORTH);
        greenbutton1.add(Box.createRigidArea(new Dimension(40, 0)),BorderLayout.WEST);
        greenbutton1.add(Box.createRigidArea(new Dimension(5, 0)),BorderLayout.EAST);

        JPanel greenbutton2 = new JPanel();
        greenbutton2.setLayout(new BorderLayout());
        AGILITYup = new JButton();
        AGILITYup.addActionListener(this);
        AGILITYup.setSize(20, 20);
        AGILITYup.setText("»");
        AGILITYup.setFont(new Font("Comic Sans MS", Font.PLAIN,20));
        greenbutton2.add(AGILITYup, BorderLayout.CENTER);
        greenbutton2.add(Box.createRigidArea(new Dimension(0, imageHP.getIconHeight())),BorderLayout.SOUTH);
        greenbutton2.add(Box.createRigidArea(new Dimension(0, imageHP.getIconHeight())),BorderLayout.NORTH);
        greenbutton2.add(Box.createRigidArea(new Dimension(5, 0)),BorderLayout.WEST);
        greenbutton2.add(Box.createRigidArea(new Dimension(40, 0)),BorderLayout.EAST);

        greenpanel.add(AGILITYlabel, BorderLayout.NORTH);
        greenpanel.add(AGILITYbutton, BorderLayout.CENTER);
        greenpanel.add(greenbutton1, BorderLayout.WEST);
        greenpanel.add(greenbutton2, BorderLayout.EAST);
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
        pointTextLabel.setText("Allocate your points!");
        pointTextLabel.setBorder(border);
        pointTextLabel.setVerticalAlignment(JLabel.TOP);
        pointTextLabel.setHorizontalAlignment(JLabel.CENTER);

        pointLabel = new JLabel();
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
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==HPdown){
            if(pointsHP>0){
                points++;
                pointsHP--;
                HPbutton.setText(String.valueOf(pointsHP));
                pointLabel.setText(points+" points left");
            }
        }
        if(e.getSource()==HPup){
            if(points>0){
                points--;
                pointsHP++;
                HPbutton.setText(String.valueOf(pointsHP));
                pointLabel.setText(points+" points left");
            }
        }
        if(e.getSource()==STRENGTHdown){
            if(pointsStr>0){
                points++;
                pointsStr--;
                STRENGTHbutton.setText(String.valueOf(pointsStr));
                pointLabel.setText(points+" points left");
            }
        }
        if(e.getSource()==STRENGTHup){
            if(points>0){
                points--;
                pointsStr++;
                STRENGTHbutton.setText(String.valueOf(pointsStr));
                pointLabel.setText(points+" points left");
            }
        }
        if(e.getSource()==AGILITYdown){
            if(pointsStr>0){
                points++;
                pointsAgl--;
                AGILITYbutton.setText(String.valueOf(pointsAgl));
                pointLabel.setText(points+" points left");
            }
        }
        if(e.getSource()==AGILITYup){
            if(points>0){
                points--;
                pointsAgl++;
                AGILITYbutton.setText(String.valueOf(pointsAgl));
                pointLabel.setText(points+" points left");
            }
        }
    }

}
