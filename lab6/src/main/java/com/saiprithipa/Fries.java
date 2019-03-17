package com.saiprithipa;

import java.util.ArrayList;

public class Fries implements Component {

    protected ArrayList<Component> components = new ArrayList<Component>()  ;
    protected String description ;
    protected double price;

    public Fries(String description, double price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public String getDescription() {
//        StringBuilder builder = new StringBuilder();
//        builder.append("1   " + this.description + "                      " + this.price + "\n");
//        for (Component obj  : components)
//        {
//            builder.append(obj.getDescription());
//        }
//        return builder.toString();
        return this.description;
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
        return this.price;
    }
}
