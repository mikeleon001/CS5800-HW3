public abstract class PizzaBuilder {
    protected Pizza pizza;
    
    public Pizza getPizza() {
        return this.pizza;
    }
    
    public void createNewPizza() {
        pizza = new Pizza(getChainName());
    }
    
    public abstract String getChainName();
    
    public abstract PizzaBuilder setSize(String size);

    public abstract PizzaBuilder addPepperoni();
    public abstract PizzaBuilder addSausage();
    public abstract PizzaBuilder addMushrooms();
    public abstract PizzaBuilder addBacon();
    public abstract PizzaBuilder addOnions();
    public abstract PizzaBuilder addExtraCheese();
    public abstract PizzaBuilder addPeppers();
    public abstract PizzaBuilder addChicken();
    public abstract PizzaBuilder addOlives();
    public abstract PizzaBuilder addSpinach();
    public abstract PizzaBuilder addTomatoAndBasil();
    public abstract PizzaBuilder addBeef();
    public abstract PizzaBuilder addHam();
    public abstract PizzaBuilder addPesto();
    public abstract PizzaBuilder addSpicyPork();
    public abstract PizzaBuilder addHamAndPineapple();
}
