import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Message here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Message extends Actor
{
    GreenfootImage gl;
    public Message()
    {
        gl = new GreenfootImage(200,50);
        setImage(gl);
    }
    
    public void setMessage(String msg)
    {
        int mX, mY;
        //MouseInfo mouse= Greenfoot.getMouseInfo();
        //System.out.println("Mouse = " + mouse);
        mX=getX();
        mY=getY();
        World world = getWorld();
        if (this.getWorld()!=null)
        {
            world.removeObject(this);
        }
        world.addObject(this,mX,mY);
        this.setText(msg);
    }
    
    public void setMessage(String msg, int x, int y)
    {
        World world = getWorld();
        if (this.getWorld()!=null)
        {
            world.removeObject(this);
        }
        world.addObject(this,x,y);
        this.setText(msg);
    }
    
    public void setText(String msg)
    {
        gl.clear();
        gl.setColor(Color.YELLOW);
        gl.fill();
        gl.setColor(Color.BLACK);
        gl.drawString(msg,0,25);
        
        
    }
    /**
     * Act - do whatever the Message wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mousePressed(this))
        {
            World world = getWorld();
            world.removeObject(this);
        }
    }    
}
