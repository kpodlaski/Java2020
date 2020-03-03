package zaj2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Komunikator {
    private JTextArea mainText;
    private JPanel panel1;
    private JTextField shortText;
    private JButton sendButton;

    public Komunikator() {

        ActionListener aL = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = shortText.getText();
                mainText.append("[Me]: "+text+"\n");
                shortText.setText("");
            }
        };

        sendButton.addActionListener(aL);
        shortText.addActionListener(aL);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Komunikator");
        frame.setContentPane(new Komunikator().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
