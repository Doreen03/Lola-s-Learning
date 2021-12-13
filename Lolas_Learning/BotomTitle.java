import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BotomTitle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BotomTitle extends MainMenuText
{
    GifImage bottomTitle = new GifImage("title3.gif");
    public void act()
    {
        setImage(bottomTitle.getCurrentImage());
    }
}
