import acm.graphics.GLine;
import acm.program.GraphicsProgram;
import java.awt.event.*;

/** This class allows users to draw lines on the canvas **/
public class DrawLines extends GraphicsProgram {

    /** Initializes the program by enableing the mouse listeners */
    public void init(){
        addMouseListeners();
    }

    /* Called on mouse press to create a new line */
    public void mousePressed(MouseEvent e) {
        line = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
        add(line);
    }

    /* Called on mouse drag to reset the endpoint  */
    public void mouseDragged(MouseEvent e) {
        line.setEndPoint(e.getX(), e.getY());
    }

    /* Private instance variables */
    private GLine line;
}
