package com.saiprithipa;

public class Bacon implements Component {
    @Override
    public String getDescription() {
        return "     {{{{ BACON }}}}";
    }

    @Override
    public void addChild(Component c) {

    }

    @Override
    public void removeChild(Component c) {

    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
