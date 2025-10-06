import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProteinFactory {
    private static ProteinFactory instance = null;
    private Random random;
    
    private ProteinFactory() {
        random = new Random();
    }
    
    public static ProteinFactory getInstance() {
        if (instance == null) {
            instance = new ProteinFactory();
        }
        return instance;
    }
    
    public Protein getProtein(DietPlan dietPlan) {
        List<Protein> availableProtein = new ArrayList<>();
        
        switch (dietPlan) {
            case NO_RESTRICTION:
                availableProtein.add(new Fish());
                availableProtein.add(new Chicken());
                availableProtein.add(new Beef());
                availableProtein.add(new Tofu());
                break;
                
            case PALEO:
                availableProtein.add(new Fish());
                availableProtein.add(new Chicken());
                availableProtein.add(new Beef());
                break;
                
            case VEGAN:
                availableProtein.add(new Tofu());
                break;
                
            case NUT_ALLERGY:
                availableProtein.add(new Fish());
                availableProtein.add(new Chicken());
                availableProtein.add(new Beef());
                availableProtein.add(new Tofu());
                break;
        }
        
        if (availableProtein.isEmpty()) {
            return null;
        }
        return availableProtein.get(random.nextInt(availableProtein.size()));
    }
}
