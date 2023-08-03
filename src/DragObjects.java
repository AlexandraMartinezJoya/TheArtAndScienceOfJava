import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.*;

/** This class displays a mouse dragable rectangle and oval **/

public class DragObjects extends GraphicsProgram {

    /* Initializes the program  */
    public void init() {
        GRect rect = new GRect(100, 100., 150, 100);
        rect.setFilled(true);
        rect.setColor(Color.RED);
        add(rect);
        GOval oval = new GOval(300, 115, 100, 70);
        oval.setFilled(true);
        oval.setColor(Color.GREEN);
        add(oval);
        addMouseListeners();
    }

    /* Called on mouse press to record the coordinates of the click */
    public void mousePressed(MouseEvent e) {
        last = new GPoint(e.getPoint());
        gobj = getElementAt(last);
    }

    /* Called on mouse drag to reposition the object */
    public void mouseDragged(MouseEvent e) {
        if(gobj != null){
            double thisX = e.getX() - last.getX();
            double thisY = e.getY() - last.getY();
            gobj.move(thisX, thisY);
            last = new GPoint(e.getPoint());
        }
    }

    /** Called on mouse click to move this object to the front */
    public void mouseClicked(MouseEvent e) {
        if (gobj != null) gobj.sendToFront();
    }

    /** Private instance variables **/
    private GObject gobj;
    private GPoint last;
}
