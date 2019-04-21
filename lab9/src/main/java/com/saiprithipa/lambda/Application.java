package com.saiprithipa.lambda;

import com.saiprithipa.Order;

public class Application {
    Order order;
    LambdaFunction lambdaFunction;

    public Application() {
        order = new Order();
        lambdaFunction = new LambdaFunction();
    }

    public Order getOrder() {
        return order;
    }

    public void completeOrder() {
        String content = lambdaFunction.getReceiptSlipLambda().apply(order);
        System.out.println(content);
        System.out.println("\n\n\n");
        content = lambdaFunction.getPackingSlipLambda().apply(order);
        System.out.println(content);
    }
}
