import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VictoryText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VictoryText extends MainMenuText
{
    GifImage victory = new GifImage("Victory.gif");
    public void act()
    {
        setImage(victory.getCurrentImage());
    }
}
