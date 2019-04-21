package com.saiprithipa;

import com.saiprithipa.strategy.Application;

public class ReceiptSlip extends AbstractSlip {


    public ReceiptSlip(Application application) {
        this.application = application;
    }

    @Override
    public String getDescription() {
        getComponentsFromOrder();
        this.addComposites(burger);
        this.addComposites(bacon);
        this.addComposites(toppings);
        this.addComposites(onMeatToppings);
        this.addComposites(fries);
        return doGetDescription();
    }


}
