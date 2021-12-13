import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends MainMenuButtons
{
    GifImage play = new GifImage("play2.gif");
    public void act()
    {
        setImage(play.getCurrentImage());
        checkMouse();
        checkClick(new Classroom());
    }
}
