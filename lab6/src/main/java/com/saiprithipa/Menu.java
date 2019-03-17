package com.saiprithipa;

public enum Menu {
    LITTLE_BACON_BURGER("LBB", 5.59),
    HAM_BURGER("HB", 5.40),
    CHEESE_BURGER("CB", 5.00),
    LITTLE_FRIES("little", 2.29),
    REGULAR_FRIES("regular", 3.15),
    LARGE_FRIES("large", 3.99);

    private final String value;
    private final double price;

    Menu(String cb, double prc) {
        value = cb;
        price = prc;
    }

    public String getValue() {
        return value;
    }

    public double getPrice() {return price;}
}
