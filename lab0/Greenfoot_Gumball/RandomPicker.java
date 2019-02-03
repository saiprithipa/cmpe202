import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class RandomPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomPicker extends Picker
{
    Message message;
    /**
     * Act - do whatever the RandomPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public void pick()
    {
        List<Gumball> gumballList = new ArrayList() {{
            add(new GreenGumball());
            add(new BlueGumball());
            add(new RedGumball());
        }};
        World world = getWorld();
        List<Message> messages= world.getObjects(Message.class);
        message = messages.get(0);

        int mx = getX();
        int my = getY();
       
        int ballType = Greenfoot.getRandomNumber(3);
        Gumball chosenGumball = gumballList.get(ballType);
        world.addObject(chosenGumball,500,500);
        message.setMessage ( chosenGumball.getClass().getName(), mx, my);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
