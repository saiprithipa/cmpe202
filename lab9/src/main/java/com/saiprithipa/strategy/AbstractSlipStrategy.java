package com.saiprithipa.strategy;

import com.saiprithipa.Burger;
import com.saiprithipa.Component;
import com.saiprithipa.Order;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class AbstractSlipStrategy implements IDisplayStrategy {

    public Date getDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
        Date date = new Date();
        //System.out.println(dateFormat.format(date));
        return date;
    }

    protected Component getComponentsFromOrder(Order order, String component) {
        if (component.equals("toppings") || component.equals("onmeattoppings")) {
            Burger burger = (Burger) order.getOrderComponent().stream().filter(c -> c.getClass().isAssignableFrom(Burger.class)).findFirst().get();
            for (int i = 0; i < burger.components.size(); i++) {
                if (burger.getChild(i).getClass().getSimpleName().toLowerCase().equals(component))
                    return burger.getChild(i);
            }
        }
        for (Component c : order.getOrderComponent()) {
            if (c.getClass().getSimpleName().toLowerCase().equals(component))
                return c;
        }
        throw new RuntimeException("Not a valid component");
    }
}