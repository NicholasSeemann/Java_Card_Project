import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI{

    JFrame frame = new JFrame();
    JTextField userText = new JTextField("");
    JLabel label = new JLabel("Number of clicks: 0");
    JLabel secondLabel = new JLabel();
    JLabel thirdLabel = new JLabel();
    JPanel panel = new JPanel();

    public GUI(){
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(label);
        panel.add(secondLabel);
        panel.add(thirdLabel);
        panel.add(userText);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("IST Flashcards");
        frame.pack();
        frame.setVisible(true);
        frame.setSize(800, 600);
    }

    public void changeLabel(String newLabel){
        label.setText(newLabel);
    }

    public void changeSecondLabel(String newLabelText){
        secondLabel.setText(newLabelText);
    }

    public void changeThirdLabel(String newLabel){
        thirdLabel.setText(newLabel);
    }

    public void clearTextField(){
        userText.setText("");
    }

    public String returnUserText(){
        String userInput = userText.getText();
        return userInput;
    }
}
