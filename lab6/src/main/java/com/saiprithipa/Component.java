package com.saiprithipa;

public interface Component {

    String getDescription() ;
    void addChild(Component c);
    void removeChild(Component c);
    Component getChild(int i);
    double getPrice();

}
