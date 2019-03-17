package com.saiprithipa;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSlip implements ISlip {

    Application application;
    Burger burger;
    Toppings toppings;
    OnMeatToppings onMeatToppings;
    Bacon bacon;
    Fries fries;

    List<Component> composites = new ArrayList<Component>();

    protected void getComponentsFromOrder() {
        bacon = new Bacon();
        for (Component component : this.application.getOrder().getOrderComponent()) {
            if (component.getClass().isAssignableFrom(Burger.class))
                burger = (Burger) component;
            else if (component.getClass().isAssignableFrom(Toppings.class))
                toppings = (Toppings) component;
            else if (component.getClass().isAssignableFrom(OnMeatToppings.class))
                onMeatToppings = (OnMeatToppings) component;
            else if (component.getClass().isAssignableFrom(Fries.class))
                fries = (Fries) component;
        }
    }


    protected String doGetDescription() {
        StringBuilder builder = new StringBuilder();
        for (Component obj: composites) {
            builder.append(obj.getDescription());
        }
        return builder.toString();
    }

    protected void addComposites(Component component) {
        composites.add(component);
    }

}

