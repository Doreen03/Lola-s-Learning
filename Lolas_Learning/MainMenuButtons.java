import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenuButtons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenuButtons extends Actor
{
    private boolean mouseOver = false;
    private static int MAX_TRANS = 225;
    
    /**
     * Checks if the mouse is hovering over this. If it is, make the image more transparent.
     */
    public void checkMouse()
    {
        if(Greenfoot.mouseMoved(null))
        {
            mouseOver = Greenfoot.mouseMoved(this);
        }
        
        if(mouseOver)
        {
            adjTrans(MAX_TRANS/2);
        }
        else
        {
            adjTrans(MAX_TRANS);
        }
    }
    
    /**
     * Checks to see if the icon is pressed. If it is, changes world to the indicated world.
     */
    public void checkClick(World world)
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(world);
        }
    }
    
    /**
     * Changes the transparency of the image if hovered over.
     */
    public void adjTrans(int adjust)
    {
        GreenfootImage tempImage = getImage();
        tempImage.setTransparency(adjust);
        setImage(tempImage);
    }
}
