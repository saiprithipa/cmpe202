import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class GreenPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenPicker extends Picker
{
    Message message;
    /**
     * Act - do whatever the GreenPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void pick()
    {
        World world = getWorld();
        List<Message> messages= world.getObjects(Message.class);
        message = messages.get(0);

        int mx = getX();
        int my = getY();
        Gumball gb = new GreenGumball();
        world.addObject(gb,500,500);
        message.setMessage( gb.getClass().getName(), mx, my);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
