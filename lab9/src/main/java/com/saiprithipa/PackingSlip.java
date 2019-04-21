package com.saiprithipa;

import com.saiprithipa.strategy.Application;

public class PackingSlip extends AbstractSlip  {



    public PackingSlip(Application application) {
        this.application = application;
    }

    @Override
    public String getDescription() {
        getComponentsFromOrder();
        this.addComposites(burger);
        this.addComposites(toppings);
        this.addComposites(onMeatToppings);
        this.addComposites(bacon);
        this.addComposites(fries);
        return doGetDescription();
    }


}
