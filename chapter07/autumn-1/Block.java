import greenfoot.*;
// in order to use a list in Java, we must import it
import java.util.List;

/**
 * A block that bounces back and forth across the screen.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class Block extends Actor
{
    private int delta = 2;
    
    /**
     * Move across the screen, bounce off edges. Turn leaves, if we touch any.
     */
    public void act() 
    {
        move();
        checkEdge();
        checkMouseClick();
        
    }
    
    /**
     * Move sideways, either left or right.
     */
    private void move()
    {
        setLocation(getX()+delta, getY());
    }
    
    /**
     * Check whether we are at the edge of the screen. If we are, turn around.
     */
    private void checkEdge()
    {
        if (isAtEdge()) 
        {
            delta = -delta;  // reverse direction
            
            //add a new Leaf object to the world
            //1. add a reference to the world
            World myWorld = getWorld();
            //2. use the object reference to call, or use , a method on the World object
            myWorld.addObject(new Leaf(), 100, 100);
        }
    }
    
    /**
     * Check whether the mouse button was clicked. If it was, change all leaves.
     */
    private void checkMouseClick()
    {
        // when null is the argument, Greenfoot responds to a mouse click ANYWHERE on screen
        // When this is the argument, Greenfoot responds to a mouse click ONLY on the block object
        if (Greenfoot.mouseClicked(this)) 
        {
            // 1. Get an object reference to the world
            World myWorld = getWorld();
            
            //Make a message show on screen when the mouse is clicked
            myWorld.showText("mouse was clicked", 200, 200);
        }
    }
    
}
