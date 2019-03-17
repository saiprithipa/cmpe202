package com.saiprithipa;

public enum ToppingsMenu {
    MAYO("mayo"),
    LETTUCE("lettuce"),
    PICKLES("pickles"),
    TOMATO("tomato"),
    GRILLED_ONION("grilled onion"),
    GRILLED_MUSHROOMS("grilled mushrooms"),
    KETCHUP("ketchup"),
    MUSTARD("mustard"),
    RELISH("relish"),
    ONION("onion"),
    JALAPENO_PEPPERS("jalapeno peppers"),
    GREEN_PEPPERS("green_peppers"),
    A_1_STEAK_SAUCE("A.1.Steak Sauce"),
    BBQ_SAUCE("Bar-B-Q Sauce"),
    HOT_SAUCE("hot sauce");

    private final String value;
    ToppingsMenu(String tp) {
        value = tp;
    }

    public String getValue() {
        return value;
    }

    public double getPrice() {return 0.0;}
}
