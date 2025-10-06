public class MealDriver {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("Macronutrient Balanced Diet Plan Meal");
        System.out.println("========================================\n");
        
        Customer customer1 = new Customer("Sergiu Cepurneac", DietPlan.NO_RESTRICTION);
        Customer customer2 = new Customer("Valeriu Toncu", DietPlan.PALEO);
        Customer customer3 = new Customer("Victor Rotaru", DietPlan.VEGAN);
        Customer customer4 = new Customer("Lucia Stoica", DietPlan.NUT_ALLERGY);
        Customer customer5 = new Customer("Mihaela Chitoroaga", DietPlan.NO_RESTRICTION);
        Customer customer6 = new Customer("Natalia Nebunu", DietPlan.PALEO);
        
        Customer[] customers = {customer1, customer2, customer3, customer4, customer5, customer6};
        
        for (int i = 0; i < customers.length; i++) {
            System.out.println("Customer #" + (i + 1));
            customers[i].displayCustomerInfo();
            System.out.println("Curated Meal:");
            
            Meal meal = customers[i].generateMeal();
            meal.displayMeal();
            
            System.out.println();
        }
        
        System.out.println("========================================");
        System.out.println("All meals curated successfully!");
        System.out.println("========================================");
    }
}