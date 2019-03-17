package com.saiprithipa;

import java.util.ArrayList;
import java.util.List;

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
