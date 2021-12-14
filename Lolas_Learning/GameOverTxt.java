import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverTxt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverTxt extends MainMenuText
{
    GifImage gameOver = new GifImage("GameOver.gif");
    public void act()
    {
        setImage(gameOver.getCurrentImage());
    }
}
