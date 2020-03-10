package zaj3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DrawingPanel extends JPanel {

    int x=200, y=200;
    private Color color = Color.BLACK;

    public DrawingPanel(){
        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });
    }
    @Override
    public void paint(Graphics g) {
        //super.paint(g);
        //g.drawArc(200,200,20,20,0,298);
        g.setColor(this.color);
        g.fillOval(x,y,15,15);
    }

    public void setColor(String color){
        if (color == "RED") {
            this.color = Color.RED;
        }
        if (color == "BLUE"){
            this.color= Color.BLUE;
        }
    }
}
