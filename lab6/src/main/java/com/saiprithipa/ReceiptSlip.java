package com.saiprithipa;

import java.util.ArrayList;
import java.util.List;

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
