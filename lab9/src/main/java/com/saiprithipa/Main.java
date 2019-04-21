package com.saiprithipa;

import com.saiprithipa.lambda.Application;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static Application application;

    public static void main(String[] args) throws IOException {
        application = new Application();
        Console c = System.console();
        for (;;) {
            System.out.println("Enter your item: ");
            String ch = readInput(c);
            Menu item = getMenuItem(ch);
            if (item != null && item.name().contains("BURGER")) {
                Burger burger = new Burger(item.name(), item.getPrice());
                //application.getOrder().addBurger(item);
                Toppings toppings = new Toppings("");
                OnMeatToppings onMeatToppings = new OnMeatToppings("");
                for (; ; ) {
                    System.out.println("Enter the toppings: ");
                    ch = readInput(c);
                    if (ch.startsWith("onmeat")) {
                        ch = ch.replace("onmeat", "").replace("(", "").replace(")", "");
                        ToppingsMenu tmenu = getToppingMenuItem(ch);
                        //application.getOrder().addOnMeatToppings(tmenu);
                        onMeatToppings.addTopping(tmenu.name());

                    } else {
                        ToppingsMenu tmenu = getToppingMenuItem(ch);
                        //application.getOrder().addToppings(tmenu);
                        toppings.addTopping(tmenu.name());

                    }
                    System.out.println("More Toppings ? (Y/N)");
                    ch = readInput(c);
                    if (ch.toLowerCase().equals("y"))
                        continue;
                    else
                        break;
                }
                burger.addChild(toppings);
                burger.addChild(onMeatToppings);
//                application.getOrder().addOrderComponents(toppings);
//                application.getOrder().addOrderComponents(onMeatToppings);
                application.getOrder().addOrderComponents(burger);
            } else if (item != null && item.name().contains("FRIES")) {
                Fries fries = new Fries(item.name(), item.getPrice());
                application.getOrder().addOrderComponents(fries);
                //application.getOrder().addFries(item);
            }
            System.out.println("More Items ? (Y/N)");
            ch = readInput(c);
            if (ch.toLowerCase().equals("y"))
                continue;
            else
                break;
        }
        application.completeOrder();
    }

    private static String readInput(Console c) throws IOException {
        if (c != null) {
            return c.readLine();       // get user command
        }
        else {
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    System.in, "UTF-8"));
            return reader.readLine();
        }
    }

    private static Menu getMenuItem(String ch) {
        for(Menu v : Menu.values()){
            if( v.getValue().toLowerCase().equals(ch.toLowerCase())){
                return v;
            }
        }
        return null;
    }

    private static ToppingsMenu getToppingMenuItem(String ch) {
        for(ToppingsMenu v : ToppingsMenu.values()){
            if( v.getValue().toLowerCase().equals(ch.toLowerCase())){
                return v;
            }
        }
        return null;
    }

    public void automate() {

    }

}
