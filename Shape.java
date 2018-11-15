import java.awt.Color;
import java.awt.Point;

public abstract class Shape extends DrawPanel implements Drawable
{
    protected Point[] location; 
    private Color color; 
    private boolean filled; 

    public Shape(Color color, boolean filled)
    {
        
    }
    
    public Color getColor()
    {
        return color; 
    }
    
    public boolean isFilled()
    {
        return filled;
    }
    
    public Point[] getLocation()
    {
        return location; 
    }

}
