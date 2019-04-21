package com.saiprithipa;

import java.util.ArrayList;
import java.util.List;

public class OnMeatToppings implements Component {

    protected ArrayList<Component> components = new ArrayList<Component>()  ;
    protected String description ;
    List<String> toppings = new ArrayList<String>();

    public OnMeatToppings(String description) {
        this.description = "";
    }

    @Override
    public String getDescription() {
        StringBuilder builder = new StringBuilder();
        for (String topping  : toppings)
        {
            builder.append("     ->|" + topping + "             \n");
        }
        return builder.toString();
    }

    @Override
    public void addChild(Component c) {
        components.add( c ) ;
    }

    @Override
    public void removeChild(Component c) {
        components.remove(c) ;
    }

    @Override
    public Component getChild(int i) {
        return components.get( i ) ;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }
}
