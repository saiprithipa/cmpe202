package com.saiprithipa;

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
