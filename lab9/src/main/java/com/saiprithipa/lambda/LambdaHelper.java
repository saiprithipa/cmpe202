package com.saiprithipa.lambda;

import com.saiprithipa.Burger;
import com.saiprithipa.Component;
import com.saiprithipa.Order;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import java.util.stream.Collectors;

public class LambdaHelper {

    public Component getComponentsFromOrder(Order order, String component) {
        if (component.equals("toppings") || component.equals("onmeattoppings")) {
            Burger burger = (Burger) order.getOrderComponent().stream().filter(c -> c.getClass().isAssignableFrom(Burger.class)).findFirst().get();

            for (int i = 0; i < burger.components.size(); i++) {
                if (burger.getChild(i).getClass().getSimpleName().toLowerCase().equals(component))
                    return burger.getChild(i);
            }
        }
        Optional<Component> component1 = order.getOrderComponent().stream().filter(c -> c.getClass().getSimpleName().toLowerCase().equals(component)).findFirst();
        if (component1.isPresent()) return component1.get();
        throw new RuntimeException("Not a valid component");
    }

    public double getOrderPrice(Order order) {
        return order.getOrderComponent().stream().map(item -> item.getPrice()).collect(Collectors.summingDouble(Double::doubleValue));
    }

    public Date getDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
        Date date = new Date();
        return date;
    }
}
