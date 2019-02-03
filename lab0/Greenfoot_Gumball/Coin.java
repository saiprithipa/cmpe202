import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Actor
{
    int originalX, originalY;
    public void act() 
    {
        int mouseX, mouseY ;

        if(Greenfoot.mouseDragged(this)) {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();  
            setLocation(mouseX, mouseY);  
        } 
    }    

    public void resetPosition() {
        if (this instanceof Quarter && !(this instanceof FakeQuarter)) {
            getWorld().addObject(new Quarter(),originalX, originalY);
        }
        else if (this instanceof FakeQuarter) {
            getWorld().addObject(new FakeQuarter(),originalX, originalY);
        }
        else if (this instanceof Penny) {
            getWorld().addObject(new Penny(),originalX, originalY);
        }
        getWorld().removeObject(this);
    }

    @Override
    protected void addedToWorld(World world) {
        originalX = this.getX();
        originalY = this.getY();
    }

    //TODO - create getter
}
