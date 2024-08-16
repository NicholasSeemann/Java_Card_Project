import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.JTextField;

public class GUI{

    JFrame frame = new JFrame();
    JButton button = new JButton("Click me");
    JTextField userText = new JTextField("Type Here");
    JLabel label = new JLabel("Number of clicks: 0");
    JPanel panel = new JPanel();

    public GUI(){
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(userText);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("IST Flashcards");
        frame.pack();
        frame.setVisible(true);
    }

    public void changeLabel(String newLabel){
        label.setText(newLabel);
    }
}
