import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{

    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1152, 648, 1); 
        prepare();
    }
    
    private void prepare()
    {
        Play play = new Play();
        addObject(play,580,315);
        MainMenuText mainMenuText = new MainMenuText();
        addObject(mainMenuText,1000,125);
        play.setLocation(600,330);
    }   
    //    TeacherDesk teacherDesk = new TeacherDesk();
    //    addObject(teacherDesk, 500, getHeight() / 2);
    //    Lola lola = new Lola();
    //    addObject(lola, 100, getHeight() / 2);
    //    for (int i = 1; i <= 6; i++) 
    //    {
    //        StudentDesk studentDesk = new StudentDesk();
    //        if (i <= 3) 
    //            addObject(studentDesk, i * 125, 100);
    //        else 
    //            addObject(studentDesk, (i - 3) * 125, 300);
    //    }
    //}
    
    
}
