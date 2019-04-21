package com.saiprithipa.strategy;

import com.saiprithipa.Order;
import com.saiprithipa.PackingSlip;
import com.saiprithipa.ReceiptSlip;

public class Application {
    Order order;
    ReceiptSlip recieptSlip;
    PackingSlip packingSlip;

    public Application() {
        order = new Order();
        recieptSlip = new ReceiptSlip(this);
        packingSlip = new PackingSlip(this);
    }

    public Order getOrder() {
        return order;
    }

    public void completeOrder() {
        ReceiptSlipStrategy receiptSlipStrategy = new ReceiptSlipStrategy();
        String content = receiptSlipStrategy.screenContents(order);
        System.out.println(content);
        System.out.println("\n\n\n");
        PackingSlipStrategy packingSlipStrategy = new PackingSlipStrategy();
        content = packingSlipStrategy.screenContents(order);
        System.out.println(content);
    }
}