public abstract class Fats {
    protected String name;
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return name;
    }
}

class Avocado extends Fats {
    public Avocado() {
        this.name = "Avocado";
    }
}

class SourCream extends Fats {
    public SourCream() {
        this.name = "Sour cream";
    }
}

class Tuna extends Fats {
    public Tuna() {
        this.name = "Tuna";
    }
}

class Peanuts extends Fats {
    public Peanuts() {
        this.name = "Peanuts";
    }
}
