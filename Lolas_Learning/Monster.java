import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster extends Actor
{
    /**
     * Act - do whatever the Monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     * It also moves the monster in the direction of Lola
     */
    public void act()
    {
        move(3);
        if (getWorld().getObjects(Lola.class).isEmpty())
        {
            return;
        }
        Actor lola = (Actor)getWorld().getObjects(Lola.class).get(0);
        turnTowards(lola.getX(), lola.getY());
    }
}
