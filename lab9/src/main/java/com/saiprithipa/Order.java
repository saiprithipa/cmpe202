package com.saiprithipa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {

    List<Component> orderComponent;
    int orderNo;

    public Order() {
        this.orderNo = new Random().nextInt(1000);
        this.orderComponent = new ArrayList<Component>();
    }

    public List<Component> getOrderComponent() {
        return orderComponent;
    }

    public void setOrderComponent(List<Component> orderComponent) {
        this.orderComponent = orderComponent;
    }

    public void addOrderComponents(Component component) {
        this.orderComponent.add(component);
    }

    public int getOrderNo() {
        return orderNo;
    }
}
