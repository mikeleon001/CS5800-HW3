public abstract class Carbs {
    protected String name;
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return name;
    }
}

class Cheese extends Carbs {
    public Cheese() {
        this.name = "Cheese";
    }
}

class Bread extends Carbs {
    public Bread() {
        this.name = "Bread";
    }
}

class Lentils extends Carbs {
    public Lentils() {
        this.name = "Lentils";
    }
}

class Pistachio extends Carbs {
    public Pistachio() {
        this.name = "Pistachio";
    }
}
