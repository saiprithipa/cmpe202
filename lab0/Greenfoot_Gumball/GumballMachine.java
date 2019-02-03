import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class GumballMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballMachine extends Actor
{
    Message message;
    Actor haveCoin;
    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 );
    }

    public void act() 
    {
        World world = getWorld();
        List<Message> messages= world.getObjects(Message.class);
        message = messages.get(0);

        int mx = getX();
        int my = getY();

        if (Greenfoot.mousePressed(this))
        {
            if(haveCoin==null)
            {
                message.setMessage("No coin in slot", mx, my);
            }
            else {
                message.setMessage("Crank is turned");
                world.repaint();
                try{
                    Thread.sleep(2000);
                }catch(InterruptedException ex) {}
                List<Inspector> inspectors= world.getObjects(Inspector.class);
                Inspector myInspector = inspectors.get(0);
                myInspector.choosingPicker(haveCoin);
                haveCoin = null;
                return;
            }   
        }

        Actor coin = getOneObjectAtOffset(+20,+20,Coin.class);
        //Actor coin = getOneIntersectingObject(Coin.class);
        if (coin != null) 
        {
            if (haveCoin != null) {
                    ((Coin)coin).resetPosition();
                    message.setMessage("Already have a coin", mx, my);
                    return;
            }
            boolean result = inspect(coin);
            if (result == true) {
                message.setMessage("Have Coin", mx, my);
                getWorld().removeObject(coin);
                haveCoin = coin;
            }
            else {
                //coin.move(-300);
                ((Coin)coin).resetPosition();
            }
        }
    }

    public boolean inspect(Actor coin)
    {
        int mx = getX();
        int my = getY();
        World world = getWorld();
        List<Message> messageList = world.getObjects(Message.class);
        Message m = messageList.get(0);

        try {
            Thread.sleep(2000);
            world.repaint();
            m.setMessage("Inspecting...", mx, my);
            world.repaint();
            Thread.sleep(2000);
        } catch (InterruptedException ex) {}

        //Actor actor=getOneIntersectingObject(GumballMachine.class);

        if (( coin instanceof Coin) && ( coin!=null))
        {
            if  (coin instanceof Quarter) 
            {
                if ( coin instanceof FakeQuarter)
                {
                    m.setMessage ( "Fake quarter. Coin not accepted", mx, my );
                    return false;
                }
                else 
                {
                    try{
                        m.setMessage ( "Coin Accepted.", mx, my);
                        world.repaint();
                        Thread.sleep(2000);
                        return true;
                    }catch(InterruptedException ex) {}
                }
            }
            else  if ( coin instanceof Penny)
            {
                m.setMessage ( "Pennies are not accepted." , mx, my);
                return false;
            }

        }

        return false;
    }
}