
import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

/**
 * This class extends JFrame and contains the main entry point for the program.
 * 
 * @author CS2334. Modified by: Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class DrawFrame extends JFrame
{
    /**
     * Serial ID
     */
    private static final long serialVersionUID = 1L;
    
    /** Contains and draws all the shapes */
    private static DrawPanel drawPanel;

    /**
     * Creates an invisible window, the objects to be drawn and adds them to the panel.
     * 
     * @param title String title of the drawing window
     */
    public DrawFrame(String title)
    {
        super(title);
        
        int width = 800;
        int height = 600;
        
        // TODO: draw a dog:
        
        // Base head:
        Circle base = new Circle(new Point(400, 300), 400, Color.DARK_GRAY, true);
        Circle outline2 = new Circle(new Point(400,300),710, Color.BLACK, false);
        // Ears:
        RightTriangle backEar1 = new RightTriangle(new Point(250,200), 25, 150 , Color.DARK_GRAY, true);
        RightTriangle backEar2 = new RightTriangle(new Point(550,200), -25, 150 , Color.DARK_GRAY, true);
        
        RightTriangle frontEar1 = new RightTriangle(new Point(255,200), 15, 100 , Color.PINK, true);
        RightTriangle frontEar2 = new RightTriangle(new Point(545,200), -15, 100 , Color.PINK, true);
        
        // Eyes:
        Oval backEye1 = new Oval(new Point(300,225),40 ,75, Color.WHITE, true);
        Oval backEye2 = new Oval(new Point(500,225),40 ,75, Color.WHITE, true);
        Oval frontEye1 = new Oval(new Point(300,225),25 ,55, Color.BLACK, true);
        Oval frontEye2 = new Oval(new Point(500,225),25 ,55, Color.BLACK, true);
        // Nose and Whiskers:
        
        Circle nose = new Circle(new Point(400,300),45, Color.BLACK ,true);
        PolyLine whiskers1 = new PolyLine(new Point(300,350), new Point(400,375),50, Color.BLACK, true);
        PolyLine whiskers2 = new PolyLine(new Point(400,375), new Point(500,350),50, Color.BLACK, true);
        
        //Tounge:
        Oval tounge = new Oval(new Point(425,420),40 ,60, Color.RED, true);
        
        // Collar:
        Oval collar = new Oval(new Point(400, 500), 400, 50, Color.BLUE, true);
        Circle idTag1 = new Circle(new Point(400,500), 75, Color.RED, true);
        Circle idTag2 = new Circle(new Point(400,500), 65, Color.GREEN, false);

        
        
        // Square around the dog:
        Square squareBoarder = new Square(new Point(400,300), 500, Color.MAGENTA, false);
        
        
        // initialize the panel and add the shapes to it
        drawPanel = new DrawPanel();
        
        // TODO: add shapes to the panel:
        
        drawPanel.addShape(base);
        drawPanel.addShape(backEar1);
        drawPanel.addShape(backEar2);
        drawPanel.addShape(frontEar1);
        drawPanel.addShape(frontEar2);
        drawPanel.addShape(backEye1);
        drawPanel.addShape(backEye2);
        drawPanel.addShape(frontEye1);
        drawPanel.addShape(frontEye2);
        drawPanel.addShape(nose);
        drawPanel.addShape(whiskers1);
        drawPanel.addShape(whiskers2);
        drawPanel.addShape(tounge);
        drawPanel.addShape(collar);
        drawPanel.addShape(idTag1);
        drawPanel.addShape(idTag2);
        drawPanel.addShape(outline2);
        drawPanel.addShape(squareBoarder);

        
        
        // set background color
        drawPanel.setBackground(Color.CYAN);
        
        // add panel to frame
        this.add(drawPanel);
        
        // finish setting up the frame
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * The main method, initializes the frame to draw the images.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args)
    {
        DrawFrame frame = new DrawFrame("Woof :3");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
