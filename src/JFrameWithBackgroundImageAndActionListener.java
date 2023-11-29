import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrameWithBackgroundImageAndActionListener {

    private JFrame frame;
    private JTextField textField;
    private JButton button;
    private JLabel label;

    public JFrameWithBackgroundImageAndActionListener() {
        frame = new JFrame("JFrame with Background Image and ActionListener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the background image
        ImageIcon imageIcon = new ImageIcon("background.jpg");
        JLabel backgroundLabel = new JLabel(imageIcon);
        backgroundLabel.setOpaque(true);
        frame.setContentPane(backgroundLabel);

        // Create the other components
        textField = new JTextField();
        button = new JButton("Click Me!");
        label = new JLabel("");

        // Set the button's action listener
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                label.setText(text);
            }
        });

        // Add the components to the frame
        frame.add(textField, BorderLayout.NORTH);
        frame.add(button, BorderLayout.CENTER);
        frame.add(label, BorderLayout.SOUTH);

        // Set the frame's size and make it visible
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new JFrameWithBackgroundImageAndActionListener();
    }
}
