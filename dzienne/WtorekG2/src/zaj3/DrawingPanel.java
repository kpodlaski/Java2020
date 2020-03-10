package zaj3;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DrawingPanel extends javax.swing.JPanel {

    private int x = 200, y=200;
    private Color color = Color.BLACK;

    public DrawingPanel(){
        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                x = e.getX();
                y= e.getY();
                repaint();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        //super.paint(g);
        //g.drawArc(100,100,20,40,0,338);
        //g.fillArc(212,212,20,20,0,292);
        g.setColor(color);
        g.fillOval(x,y,15,15);
    }

    public void setColor(String color){
        if (color == "RED"){
            this.color = Color.RED;
        }
        if (color == "GREEN"){
            this.color = Color.GREEN;
        }
    }
}
