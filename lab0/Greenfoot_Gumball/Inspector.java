import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Inspector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inspector extends Alien
{
    /**
     * Act - do whatever the Inspector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {

    }

    public void choosingPicker(Actor coin)

    {
        int mx = getX();
        int my = getY();
        World world = getWorld();
        List<Message> messageList = world.getObjects(Message.class);
        Message m = messageList.get(0);

        List<Picker> pickerList = world.getObjects(Picker.class);
        try {
            m.setMessage("Choosing a Picker", mx, my);
            world.repaint();
            Thread.sleep(2000);
        } catch (InterruptedException ex) {}
        
        m.setMessage(coin.getClass().getName());
        int pickertype = Greenfoot.getRandomNumber(pickerList.size());
        Picker chosenpicker = pickerList.get(pickertype);
        if(coin.getClass() == Quarter.class) {
            if (chosenpicker instanceof GreenPicker) {
                ((GreenPicker)chosenpicker).pick();
            }
            else if (chosenpicker instanceof RandomPicker) {
                ((RandomPicker)chosenpicker).pick();
            }
        }
    }
}
