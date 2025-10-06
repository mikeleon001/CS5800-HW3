public abstract class Protein {
    protected String name;
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return name;
    }
}

class Fish extends Protein {
    public Fish() {
        this.name = "Fish";
    }
}

class Chicken extends Protein {
    public Chicken() {
        this.name = "Chicken";
    }
}

class Beef extends Protein {
    public Beef() {
        this.name = "Beef";
    }
}

class Tofu extends Protein {
    public Tofu() {
        this.name = "Tofu";
    }
}
