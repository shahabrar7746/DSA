import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JForms extends JFrame implements ActionListener {

    private JTextField textField;
    private JButton button;
    private JLabel messageLabel;

    private Image image;

    public JForms() {
        super("JForm");

    

        // Create the message label
        messageLabel = new JLabel("Enter your text here:");

        // Create the text field
        textField = new JTextField(20);

        // Create the button
        button = new JButton("Submit");
        button.addActionListener(this);

        // Create a panel to hold the image
        JPanel imagePanel = new JPanel();
        imagePanel.setOpaque(false);
        imagePanel.add(new JLabel(new ImageIcon(image)));

        // Add the image panel and the text field to the form
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(imagePanel);
        container.add(messageLabel);
        container.add(textField);
        container.add(button);

        // Set the form's size and make it visible
        setSize(300, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Get the text from the text field
        String text = textField.getText();

        // Do something with the text
        System.out.println("You entered: " + text);
    }

    public static void main(String[] args) {
        JForms form = new JForms();
    }
}
