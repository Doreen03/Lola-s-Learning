import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditsMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditsMenu extends MainMenuButtons
{
    GifImage credits = new GifImage("credits.gif");
    public void act()
    {
        setImage(credits.getCurrentImage());
        checkMouse();
        checkClick(new CreditsPage());
    }
}
