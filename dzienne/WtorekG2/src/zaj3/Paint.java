package zaj3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Paint {
    private JButton redBtn;
    private JButton greenBtn;
    private JPanel mainPanel;
    private JPanel drawingPanel;

    public Paint() {
        redBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DrawingPanel dp = (DrawingPanel) drawingPanel;
                dp.setColor("RED");
            }
        });

        greenBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DrawingPanel dp = (DrawingPanel) drawingPanel;
                dp.setColor("GREEN");
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
