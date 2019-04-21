package com.saiprithipa.lambda;

import com.saiprithipa.*;

import java.text.DecimalFormat;
import java.util.function.Function;

public class LambdaFunction {

    LambdaHelper lambdaHelper;
    Function<Order, String> receiptSlipLambda;
    Function<Order, String> packingSlipLambda;

    public LambdaFunction() {
        this.lambdaHelper = new LambdaHelper();
        createLambdas();
    }

    private void createLambdas() {
        receiptSlipLambda = (Order order) -> {
            StringBuilder builder = new StringBuilder();
            builder.append("          FIVE GUYS          \n");
            builder.append("     BURGERS AND FRIES          \n");
            builder.append("     STORE # CA-1294          \n");
            builder.append("     5353 ALMADEN EXPY N60          \n");
            builder.append("     SAN JOSE, CA 95118          \n");
            builder.append("     (P) 408-264-9300          \n\n");
            builder.append("     " + lambdaHelper.getDate() + " \n");
            builder.append("        FIVE GUYS        \n");
            builder.append("Order Number:     " + order.getOrderNo() + "        \n");
            Burger b = (Burger) lambdaHelper.getComponentsFromOrder(order, "burger");
            builder.append("1   " + b.getDescription() + "               " + b.getPrice() + "\n");
            builder.append(new Bacon().getDescription() +"                \n");
            builder.append(((Component)lambdaHelper.getComponentsFromOrder(order, "toppings")).getDescription());
            builder.append(((Component)lambdaHelper.getComponentsFromOrder(order, "onmeattoppings")).getDescription());
            Fries f = (Fries) lambdaHelper.getComponentsFromOrder(order, "fries");
            builder.append("1   " + f.getDescription() + "                      " + f.getPrice() + "\n\n");
            //builder.append(slip.getDescription() + "\n");
            double subTotal = lambdaHelper.getOrderPrice(order);
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
        } ;

        packingSlipLambda = (Order order) -> {
            StringBuilder builder = new StringBuilder();
            builder.append("Patties -      1 \n\n\n");
            builder.append("Order Number:  45\n");
            builder.append("          " + lambdaHelper.getDate() + "\n");
            builder.append("           FIVE GUYS\n\n");
            builder.append("Sandwich#  1\n");
            Burger b = (Burger) lambdaHelper.getComponentsFromOrder(order, "burger");
            builder.append("1   " + b.getDescription() + "\n");
            builder.append(((Component)lambdaHelper.getComponentsFromOrder(order, "toppings")).getDescription());
            builder.append(((Component)lambdaHelper.getComponentsFromOrder(order, "onmeattoppings")).getDescription());
            builder.append(new Bacon().getDescription() +"                \n");
            Fries f = (Fries) lambdaHelper.getComponentsFromOrder(order, "fries");
            builder.append("1   " + f.getDescription() + "\n");
            builder.append("Register: 1       Tran Seq No:        57845\n");
            builder.append("Cashier: John* M.             \n");
            return builder.toString();
        };
    }

    public Function<Order, String> getReceiptSlipLambda() {
        return receiptSlipLambda;
    }

    public Function<Order, String> getPackingSlipLambda() {
        return packingSlipLambda;
    }
}
