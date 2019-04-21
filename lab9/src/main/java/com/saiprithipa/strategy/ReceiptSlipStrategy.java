package com.saiprithipa.strategy;

import com.saiprithipa.*;

import java.text.DecimalFormat;

public class ReceiptSlipStrategy extends AbstractSlipStrategy {

    public ReceiptSlipStrategy() {

    }

    public String screenContents(Order order) {
        StringBuilder builder = new StringBuilder();
        builder.append("          FIVE GUYS          \n");
        builder.append("     BURGERS AND FRIES          \n");
        builder.append("     STORE # CA-1294          \n");
        builder.append("     5353 ALMADEN EXPY N60          \n");
        builder.append("     SAN JOSE, CA 95118          \n");
        builder.append("     (P) 408-264-9300          \n\n");
        builder.append("     " + getDate() + " \n");
        builder.append("        FIVE GUYS        \n");
        builder.append("Order Number:     " + order.getOrderNo() + "        \n");
//        for(Component component : order.getOrderComponent()) {
//            builder.append(component.getDescription());
//        }
        Burger b = (Burger) getComponentsFromOrder(order, "burger");
        builder.append("1   " + b.getDescription() + "               " + b.getPrice() + "\n");
        builder.append(new Bacon().getDescription() +"                \n");
        builder.append(((Component)getComponentsFromOrder(order, "toppings")).getDescription());
        builder.append(((Component)getComponentsFromOrder(order, "onmeattoppings")).getDescription());
        Fries f = (Fries) getComponentsFromOrder(order, "fries");
        builder.append("1   " + f.getDescription() + "                      " + f.getPrice() + "\n\n");
        //builder.append(slip.getDescription() + "\n");
        double subTotal = getOrderPrice(order);
        DecimalFormat formatter = new DecimalFormat("0.00");
        double tax = subTotal * 0.09;
        double total = subTotal + tax;
        builder.append("Sub. Total :                          $" + formatter.format(subTotal) + "\n");
        builder.append("Tax :                                 $" + formatter.format(tax) + "\n");
        builder.append("Total :                               $" + formatter.format(total) + "\n\n");
        builder.append("Cash $20                              $20.00\n");
        double change = 20.00 - total;
        builder.append("Change                                $" + formatter.format(change) + "\n");
        builder.append("Register: 1       Tran Seq No:        57845\n");
        builder.append("Cashier: John* M.             \n");
        builder.append("********************************************\n");
        builder.append("Don't throw away your receipt!!!\n");
        builder.append("Help Five Guys and you could win!\n");
        return builder.toString();
    }

    private double getOrderPrice(Order order) {
        double subtotal = 0.0;

        for (Component component: order.getOrderComponent()) {
            subtotal += component.getPrice();
        }
        return subtotal;
    }


}
