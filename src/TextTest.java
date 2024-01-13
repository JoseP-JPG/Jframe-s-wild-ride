import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.CountDownLatch;

public class TextTest extends JFrame implements ActionListener {

    JButton button;
    CountDownLatch loginSignal;

    public TextTest(CountDownLatch loginSignal) {

        this.loginSignal=loginSignal;
        this.getContentPane().setPreferredSize(new Dimension(999,340));
        this.setLayout(null);
        button = new JButton();
        button.setBounds(200,100,100,50);
        button.addActionListener(this);
        this.add(button);
        this.setVisible(true);
        this.pack();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button)
            loginSignal.countDown();
    }
}
