package zaj3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Paint {
    private JButton redButton;
    private JButton blueButton;
    private JPanel mainPanel;
    private JPanel drawingPanel;

    public Paint() {
        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DrawingPanel dp = (DrawingPanel) drawingPanel;
                dp.setColor("RED");
            }
        });


        blueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((DrawingPanel) drawingPanel).setColor("BLUE");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Paint");
        frame.setContentPane(new Paint().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        drawingPanel = new DrawingPanel();
    }
}
