public class PizzaHutBuilder extends PizzaBuilder {
    
    @Override
    public String getChainName() {
        return "Pizza Hut";
    }
    
    @Override
    public PizzaBuilder setSize(String size) {
        pizza.setSize(size);
        return this;
    }
    
    @Override
    public PizzaBuilder addPepperoni() {
        pizza.addTopping("Pepperoni");
        return this;
    }
    
    @Override
    public PizzaBuilder addSausage() {
        pizza.addTopping("Sausage");
        return this;
    }
    
    @Override
    public PizzaBuilder addMushrooms() {
        pizza.addTopping("Mushrooms");
        return this;
    }
    
    @Override
    public PizzaBuilder addBacon() {
        pizza.addTopping("Bacon");
        return this;
    }
    
    @Override
    public PizzaBuilder addOnions() {
        pizza.addTopping("Onions");
        return this;
    }
    
    @Override
    public PizzaBuilder addExtraCheese() {
        pizza.addTopping("Extra Cheese");
        return this;
    }
    
    @Override
    public PizzaBuilder addPeppers() {
        pizza.addTopping("Peppers");
        return this;
    }
    
    @Override
    public PizzaBuilder addChicken() {
        pizza.addTopping("Chicken");
        return this;
    }
    
    @Override
    public PizzaBuilder addOlives() {
        pizza.addTopping("Olives");
        return this;
    }
    
    @Override
    public PizzaBuilder addSpinach() {
        pizza.addTopping("Spinach");
        return this;
    }
    
    @Override
    public PizzaBuilder addTomatoAndBasil() {
        pizza.addTopping("Tomato and Basil");
        return this;
    }
    
    @Override
    public PizzaBuilder addBeef() {
        pizza.addTopping("Beef");
        return this;
    }
    
    @Override
    public PizzaBuilder addHam() {
        pizza.addTopping("Ham");
        return this;
    }
    
    @Override
    public PizzaBuilder addPesto() {
        pizza.addTopping("Pesto");
        return this;
    }
    
    @Override
    public PizzaBuilder addSpicyPork() {
        pizza.addTopping("Spicy Pork");
        return this;
    }
    
    @Override
    public PizzaBuilder addHamAndPineapple() {
        pizza.addTopping("Ham and Pineapple");
        return this;
    }
}
