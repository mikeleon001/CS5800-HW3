public class Meal {
    private Carbs carbs;
    private Protein protein;
    private Fats fats;
    
    public Meal(Carbs carbs, Protein protein, Fats fats) {
        this.carbs = carbs;
        this.protein = protein;
        this.fats = fats;
    }
    
    public void displayMeal() {
        System.out.println("  Carbs: " + (carbs != null ? carbs : "None available"));
        System.out.println("  Protein: " + (protein != null ? protein : "None available"));
        System.out.println("  Fats: " + (fats != null ? fats : "None available"));
    }
}
