import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverRestart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverRestart extends MainMenuText
{
    public GameOverRestart()
    {
        GreenfootImage RestartButton = new GreenfootImage(200,70);
        Font adjustedFont = new Font(true, false, 30);
        RestartButton.setFont(adjustedFont);
        RestartButton.setColor(Color.WHITE);
        RestartButton.drawString("Start Over",0,50);
        setImage(RestartButton);
    }
    
    public void act()
    {
        checkMouse();
        checkClick(new MainMenu());
    }
}
