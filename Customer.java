public class Customer {
    private String name;
    private DietPlan dietPlan;
    
    public Customer(String name, DietPlan dietPlan) {
        this.name = name;
        this.dietPlan = dietPlan;
    }
    
    public String getName() {
        return name;
    }
    
    public DietPlan getDietPlan() {
        return dietPlan;
    }
    
    public Meal generateMeal() {
        MacronutrientFactory abstractFactory = MacronutrientFactory.getInstance();
        
        CarbsFactory carbsFactory = abstractFactory.getCarbsFactory();
        ProteinFactory proteinFactory = abstractFactory.getProteinFactory();
        FatsFactory fatsFactory = abstractFactory.getFatsFactory();
        
        Carbs carbs = carbsFactory.getCarbs(dietPlan);
        Protein protein = proteinFactory.getProtein(dietPlan);
        Fats fats = fatsFactory.getFats(dietPlan);
        
        return new Meal(carbs, protein, fats);
    }
    
    public void displayCustomerInfo() {
        System.out.println("Customer: " + name);
        System.out.println("Diet Plan: " + formatDietPlan(dietPlan));
    }
    
    private String formatDietPlan(DietPlan plan) {
        switch (plan) {
            case NO_RESTRICTION:
                return "No Restriction";
            case PALEO:
                return "Paleo";
            case VEGAN:
                return "Vegan";
            case NUT_ALLERGY:
                return "Nut Allergy";
            default:
                return "Unknown";
        }
    }
}
