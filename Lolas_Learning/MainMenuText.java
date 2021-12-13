import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenuText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenuText extends Actor
{
    GifImage title = new GifImage("title2.gif");
    public void act()
    {
        setImage(title.getCurrentImage());
    }
}
