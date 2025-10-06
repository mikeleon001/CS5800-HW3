public class PizzaDriver {
    public static void main(String[] args) {
        
        System.out.println("==============================");
        System.out.println("1) Three pizzas from Pizza Hut");
        System.out.println("==============================\n");
        
        PizzaBuilder builder1 = new PizzaHutBuilder();
        builder1.createNewPizza();
        builder1.setSize("Small")
                .addPepperoni()
                .addMushrooms()
                .addOnions();
        Pizza pizza1 = builder1.getPizza();
        pizza1.eat();
        
        PizzaBuilder builder2 = new PizzaHutBuilder();
        builder2.createNewPizza();
        builder2.setSize("Medium")
                .addSausage()
                .addBacon()
                .addExtraCheese()
                .addPeppers()
                .addChicken()
                .addOlives();
        Pizza pizza2 = builder2.getPizza();
        pizza2.eat();

        PizzaBuilder builder3 = new PizzaHutBuilder();
        builder3.createNewPizza();
        builder3.setSize("Large")
                .addPepperoni()
                .addSausage()
                .addMushrooms()
                .addBacon()
                .addExtraCheese()
                .addChicken()
                .addSpinach()
                .addBeef()
                .addPesto();
        Pizza pizza3 = builder3.getPizza();
        pizza3.eat();
        

        System.out.println("\n===============================");
        System.out.println("2) Pizzas from all three chains");
        System.out.println("===============================\n");
        
        PizzaBuilder pizzaHutBuilder = new PizzaHutBuilder();
        pizzaHutBuilder.createNewPizza();
        pizzaHutBuilder.setSize("Large")
                       .addPepperoni()
                       .addSausage()
                       .addMushrooms();
        Pizza pizzaHutPizza = pizzaHutBuilder.getPizza();
        pizzaHutPizza.eat();

        PizzaBuilder pizzaHutBuilder2 = new PizzaHutBuilder();
        pizzaHutBuilder2.createNewPizza();
        pizzaHutBuilder2.setSize("Small")
                        .addBacon()
                        .addOnions();
        Pizza pizzaHutPizza2 = pizzaHutBuilder2.getPizza();
        pizzaHutPizza2.eat();
        
        
        PizzaBuilder littleCaesarsBuilder = new LittleCaesarsBuilder();
        littleCaesarsBuilder.createNewPizza();
        littleCaesarsBuilder.setSize("Medium")
                            .addPepperoni()
                            .addMushrooms()
                            .addBacon()
                            .addExtraCheese()
                            .addPeppers()
                            .addOlives()
                            .addTomatoAndBasil()
                            .addHam();
        Pizza littleCaesarsPizza = littleCaesarsBuilder.getPizza();
        littleCaesarsPizza.eat();
        
        PizzaBuilder littleCaesarsBuilder2 = new LittleCaesarsBuilder();
        littleCaesarsBuilder2.createNewPizza();
        littleCaesarsBuilder2.setSize("Small")
                             .addChicken()
                             .addSpinach()
                             .addBeef()
                             .addPesto()
                             .addSpicyPork()
                             .addHamAndPineapple();
        Pizza littleCaesarsPizza2 = littleCaesarsBuilder2.getPizza();
        littleCaesarsPizza2.eat();
        

        PizzaBuilder dominosBuilder = new DominosBuilder();
        dominosBuilder.createNewPizza();
        dominosBuilder.setSize("Small")
                      .addPepperoni();
        Pizza dominosPizza = dominosBuilder.getPizza();
        dominosPizza.eat();
        
        PizzaBuilder dominosBuilder2 = new DominosBuilder();
        dominosBuilder2.createNewPizza();
        dominosBuilder2.setSize("Large")
                       .addSausage()
                       .addMushrooms()
                       .addExtraCheese();
        Pizza dominosPizza2 = dominosBuilder2.getPizza();
        dominosPizza2.eat();
    }
}
