package com.saiprithipa;

public class PackingSlipStrategy extends AbstractSlipStrategy {

    public PackingSlipStrategy() {

    }

    @Override
    public String screenContents(Order order) {
        StringBuilder builder = new StringBuilder();
        builder.append("Patties -      1 \n\n\n");
        builder.append("Order Number:  45\n");
        builder.append("          " + getDate() + "\n");
        builder.append("           FIVE GUYS\n\n");
        builder.append("Sandwich#  1\n");
        Burger b = (Burger) getComponentsFromOrder(order, "burger");
        builder.append("1   " + b.getDescription() + "\n");
        builder.append(((Component)getComponentsFromOrder(order, "toppings")).getDescription());
        builder.append(((Component)getComponentsFromOrder(order, "onmeattoppings")).getDescription());
        builder.append(new Bacon().getDescription() +"                \n");
        Fries f = (Fries) getComponentsFromOrder(order, "fries");
        builder.append("1   " + f.getDescription() + "\n");
        builder.append("Register: 1       Tran Seq No:        57845\n");
        builder.append("Cashier: John* M.             \n");
        return builder.toString();
    }
}
