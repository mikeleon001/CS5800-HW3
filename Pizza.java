import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String chain;
    private String size;
    private List<String> toppings;
    
    public Pizza(String chain) {
        this.chain = chain;
        this.toppings = new ArrayList<>();
    }
    
    public void setSize(String size) {
        this.size = size;
    }
    
    public void addTopping(String topping) {
        this.toppings.add(topping);
    }
    
    public void eat() {
        System.out.println("Pizza Chain: " + chain);
        System.out.println("Size: " + size);
        System.out.print("Toppings: ");
        
        if (toppings.isEmpty()) {
            System.out.println("None (Plain pizza)");
        } else {
            for (int i = 0; i < toppings.size(); i++) {
                System.out.print(toppings.get(i));
                if (i < toppings.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        System.out.println("-----------------------------------");
    }
}
