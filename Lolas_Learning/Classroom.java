import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Classroom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Classroom extends World
{
    private int levelCounter = 0;
    private int questionCounter = 1;

    private GreenfootImage backgroundLevel0 = new GreenfootImage("level0classroom.png");
    private GreenfootImage backgroundLevel1 = new GreenfootImage("level1sample.png");
    private GreenfootImage backgroundLevel2 = new GreenfootImage("level2sample.png");
    private GreenfootImage backgroundLevel3 = new GreenfootImage("level3sample.png");
    private GreenfootImage backgroundLevel4 = new GreenfootImage("level4sample.png");
    private GreenfootImage backgroundLevel5 = new GreenfootImage("level5sample.png");

    /**
     * Constructor for objects of class Classroom.
     * 
     */
    public Classroom()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1152, 648, 1); 
        setBackground(backgroundLevel0);
        levelCounter = 0;
        questionCounter = 1;
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        StudentDesk studentDesk = new StudentDesk();
        addObject(studentDesk, 350, 225);
        StudentDesk studentDesk2 = new StudentDesk();
        addObject(studentDesk2, 550, 225);
        StudentDesk studentDesk3 = new StudentDesk();
        addObject(studentDesk3, 350, 500);
        StudentDesk studentDesk4 = new StudentDesk();
        addObject(studentDesk4, 550, 500);
        TeacherDesk teacherDesk = new TeacherDesk();
        addObject(teacherDesk, 811, 376);
    //{
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
}
