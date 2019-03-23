  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
       // order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        //order.addChild(new Leaf("The Purist", 8.00 ));

        CustomBurger customBurger1 = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b1 = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison*", "1/2lb.", "On A Bun" } ;
        b1.setOptions( bo ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c1 = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;
        c1.setOptions( co ) ;
        c1.wrapDecorator( b1 ) ;
        // premium cheese +1.50
        PremiumCheese pc1 = new PremiumCheese( "Premium Cheese Options" );
        String[] pco = { "Danish Blue Cheese" };
        pc1.setOptions( pco );
        pc1.wrapDecorator( c1 ) ;
        // unlimited toppings
        Toppings t1 = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles" } ;
        t1.setOptions( to ) ;
        t1.wrapDecorator( pc1 ) ;
        // premium topping +3.00
        Premium p1 = new Premium( "Premium Options" ) ;
        String[] po = { "Marinated Tomatoes" } ;
        p1.setOptions( po ) ;
        p1.wrapDecorator( t1 ) ;
        // 1 sauce free, extra +.50
        Sauce s1 = new Sauce( "Sauce Options" ) ;
        String[] so = { "Mayonnaise" , "Thai Peanut Sauce" } ;
        s1.setOptions( so ) ;
        s1.wrapDecorator( p1 ) ;
        //free
        Bun bun1 = new Bun( "Bun Options" ) ;
        String[] bunOption = { "Ciabatta(Vegan)" };
        bun1.setOptions( bunOption ) ;
        bun1.wrapDecorator( s1 ) ;
        //Side is +3.00
        Side si1 = new Side( "Side Options" ) ;
        String[] side = { "Shoestring Fries" } ;
        si1.setOptions( side ) ;
        si1.wrapDecorator( bun1 ) ;
        
        // Setup Custom Burger Ingredients
        customBurger1.setDecorator( si1 ) ;
        customBurger1.addChild( b1 ) ;
        customBurger1.addChild( c1 ) ;
        customBurger1.addChild( pc1 ) ;
        customBurger1.addChild( s1 ) ;
        customBurger1.addChild( t1 ) ;
        customBurger1.addChild( p1) ;
        customBurger1.addChild( bun1 ) ;
        customBurger1.addChild( si1 ) ;
        
        CustomBurger customBurger2 = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b2 = new Burger( "Burger Options" ) ;
        String[] bo2 = { "Hormone & Antibiotic Free Beef*", "1/3lb.", "On A Bun" } ;
        b2.setOptions( bo2 ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c2 = new Cheese( "Cheese Options" ) ;
        String[] co2 = {  "Smoked Gouda", "Greek Feta" } ;
        c2.setOptions( co2 ) ;
        c2.wrapDecorator( b2 ) ;
        // premium cheese +1.50
        PremiumCheese pc2 = new PremiumCheese( "Premium Cheese Options" );
        String[] pco1 = { "Fresh Mozzarella" };
        pc2.setOptions( pco1 );
        pc2.wrapDecorator( c2 ) ;
        // unlimited toppings
        Toppings t2 = new Toppings( "Toppings Options" ) ;
        String[] to2 = { "Crushed Peanuts" } ;
        t2.setOptions( to2 ) ;
        t2.wrapDecorator( pc2 ) ;
        // premium topping +3.00
        Premium p2 = new Premium( "Premium Options" ) ;
        String[] po2 = { "Sunny Side Up Egg*" , "Marinated Tomatoes" } ;
        p2.setOptions( po2 ) ;
        p2.wrapDecorator( t2 ) ;
        // 1 sauce free, extra +.50
        Sauce s2 = new Sauce( "Sauce Options" ) ;
        String[] so2 = { "Habanero Salsa" } ;
        s2.setOptions( so2 ) ;
        s2.wrapDecorator( p2 ) ;
        //free
        Bun bun2 = new Bun( "Bun Options" ) ;
        String[] bunOption2 = { "Gluten-Free Bun" };
        bun2.setOptions( bunOption2 ) ;
        bun2.wrapDecorator( s2 ) ;
        //Side is +3.00
        Side si2 = new Side( "Side Options" ) ;
        String[] side2 = { "Shoestring Fries " } ;
        si2.setOptions( side2 ) ;
        si2.wrapDecorator( bun2 ) ;
        
        // Setup Custom Burger Ingredients
        customBurger2.setDecorator( si2 ) ;
        customBurger2.addChild( b2 ) ;
        customBurger2.addChild( c2 ) ;
        customBurger2.addChild( pc2 ) ;
        customBurger2.addChild( s2 ) ;
        customBurger2.addChild( t2) ;
        customBurger2.addChild( p2 ) ;
        customBurger2.addChild( bun2 ) ;
        customBurger2.addChild( si2 ) ;
        // Add Custom Burger to the ORder
        order.addChild( customBurger1 );
        order.addChild( customBurger2 );
        return order;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/