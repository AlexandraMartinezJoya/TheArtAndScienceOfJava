/**
 * File: DragFace.Java
 * --------------------------
 * This program creates a GFace object and allows the user to drag it around the canvas
 */

import acm.graphics.GObject;
import acm.program.GraphicsProgram;
import java.awt.event.*;


public class DragFace extends GraphicsProgram {

    public void run() {
        GFace face = new GFace(FACE_WIDTH, FACE_HEIGHT);
        double x = (getWidth() - FACE_WIDTH) / 2;
        double y = (getHeight() - FACE_HEIGHT) / 2;
        add (face, x, y);
        addMouseListeners();
    }

    /*
    Called on mouse press to record the coordinates of the click
     */

    public void mousePressed(MouseEvent e){
        lastX = e.getX();
        lastY = e.getY();
        gobj = getElementAt(lastX, lastY);
    }

    /*
    Called on mouse press to record the coordinates of the click
     */
    public void mouseDragged( MouseEvent e) {
        if (gobj != null) {
            gobj.move(e.getX() - lastX, e.getY() - lastY);
            lastX = e.getX();
            lastY = e.getY();
        }
    }

    /** Called on mouse click to move this object to the front */
    public void mouseClicked(MouseEvent e) {
        if(gobj != null){
            gobj.sendToFront();
        }
    }

    /**
     * Private variables
     */
    private GObject gobj;
    private double lastX;
    private double lastY;

    private  final double FACE_WIDTH = 200;
    private final double FACE_HEIGHT = 300;
}
