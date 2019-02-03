import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class Picker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Picker extends Alien
{

    /**
     * Act - do whatever the Picker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private List<Picker> pickers= new ArrayList<Picker>() ;

    public void addPicker(List<Picker> obj)
    {
        pickers.addAll(obj);
    }

    public void removePicker(Picker obj)
    {
        pickers.remove(obj);
    }

    public void act() 
    {
        // Add your action code here.
    }    
}
