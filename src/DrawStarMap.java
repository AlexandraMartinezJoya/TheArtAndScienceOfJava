import acm.program.GraphicsProgram;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class DrawStarMap extends GraphicsProgram {

    public void init() {
        addMouseListeners();
        setBackground(Color.GRAY);
        ImageIcon iconClear = new ImageIcon("Clear.gif");
        JButton clear = new JButton(iconClear);
        clear.setActionCommand("Clear");
        clear.setText("Clear");
        add(clear, SOUTH);

        filledCheckbox  = new JCheckBox("Filled");
        filledCheckbox.setSelected(true);
        add(filledCheckbox, SOUTH);

        smallButton = new JRadioButton("Small");
        mediumButton = new JRadioButton("Medium");
        largeButton = new JRadioButton("Large");
        ButtonGroup sizeGroup = new ButtonGroup();
        sizeGroup.add(smallButton);
        sizeGroup.add(mediumButton);
        sizeGroup.add(largeButton);
        mediumButton.setSelected(true);
        add(smallButton, SOUTH);
        add(mediumButton, SOUTH);
        add(largeButton, SOUTH);

        initColorChooser();
        add(colorChooser, SOUTH);

        addActionListeners();
    }


    /*Called whenever the user clicks the mouse *?
     */
    public void mouseClicked(MouseEvent e) {
        GFivePointStar star = new GFivePointStar(getCurrentSize());
        star.setFilled(filledCheckbox.isSelected());
        star.setFillColor(getCurrentColor());
        add(star, e.getX(), e.getY());
    }

    /* Responds to a button action */
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Clear")){
            removeAll();
        }
    }

    private double getCurrentSize() {
        if(smallButton.isSelected()) {
            return SMALL_SIZE;
        }
        if(largeButton.isSelected()){
            return LARGE_SIZE;
        }
        return MEDIUM_SIZE;
    }

    private void initColorChooser(){
        colorChooser = new JComboBox();
        colorChooser.addItem("White");
        colorChooser.addItem("Red");
        colorChooser.addItem("Orange");
        colorChooser.addItem("Yellow");
        colorChooser.addItem("Green");
        colorChooser.addItem("Blue");
        colorChooser.addItem("Black");
        colorChooser.addItem("Pink");
        colorChooser.addItem("Purple");
        colorChooser.setEnabled(true);
        colorChooser.setSelectedItem("White");
    }

    private Color getCurrentColor() {
        String name = (String) colorChooser.getSelectedItem();
        if(name.equals("Red")){
            return Color.RED;
        }
        if(name.equals("Yellow")) {
            return Color.YELLOW;
        }
        if(name.equals("Orange")){
            return Color.ORANGE;
        }
        if(name.equals("Green")){
            return Color.GREEN;
        }
        if(name.equals("Blue")){
            return Color.BLUE;
        }
        if(name.equals("Black")){
            return Color.BLACK;
        }
        if(name.equals("Pink")){
            return Color.PINK;
        }
        if(name.equals("Purple")){
            return PURPLE_COLOR;
        }
        return Color.WHITE;
    }

    /**Private constants **/
    private JComboBox colorChooser;
    private JRadioButton smallButton;
    private JRadioButton mediumButton;
    private JRadioButton largeButton;
    private final double STAR_SIZE = 20;
    private JCheckBox filledCheckbox;
    private final double SMALL_SIZE = 30;
    private final double MEDIUM_SIZE =  45;
    private final double LARGE_SIZE =  60;
    private final Color PURPLE_COLOR = new Color(163, 73, 164);
}
