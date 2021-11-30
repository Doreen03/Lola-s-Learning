import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenuText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenuText extends Actor
{
    public MainMenuText()
    {
        GreenfootImage mainMenuText = new GreenfootImage(1200,70);
        Font adjustedFont = new Font(true, false, 50);
        mainMenuText.setFont(adjustedFont);
        mainMenuText.setColor(Color.BLACK);
        mainMenuText.drawString("Lola's Learning",0,50);
        setImage(mainMenuText);
    }

    public void act()
    {
        // Add your action code here.
    }
}
