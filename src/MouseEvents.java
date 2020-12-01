import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseEvents extends JFrame implements MouseListener, MouseMotionListener {
    JPanel pnl = new JPanel();
    JTextArea txtArea = new JTextArea(12,48);
    int x,y;

    public MouseEvents(){
        super("Swing Window");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pnl);
        pnl.add(txtArea);
        txtArea.addMouseListener(this);
        txtArea.addMouseMotionListener(this);

        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        txtArea.append("\nMouse Pressed at X: " + x + " Y: " + y);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        txtArea.append(("\nMouse Released"));
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        txtArea.setText("\nMouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        x=e.getX();
        y=e.getY();

    }

    public static void main(String[] args) {
        MouseEvents gui = new MouseEvents();
    }
}
