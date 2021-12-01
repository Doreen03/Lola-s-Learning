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
        GreenfootImage image = new GreenfootImage("Untitled.png");
        image = getImage();
        image.scale(3000,1000);
        setImage(image);
    }
    
    /**
     * Act - do whatever the Scrolling wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (this != null) {
            setLocation(getX() - 2, getY());
            if (getX() == -350)
            {
                getWorld().removeObject(this);
            }
        }
    }
}
