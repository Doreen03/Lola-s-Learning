import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScrollingWall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScrollingWall extends Scrolling
{    public ScrollingWall()
    {
        GreenfootImage image = getImage();
        image.scale(2000,900);
        setImage(image);
    }
    
    /**
     * Act - do whatever the Scrolling wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX() - 2, getY());
        if (getX() == -150)
        {
            getWorld().removeObject(this);
        }
    }
}
