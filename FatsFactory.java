import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FatsFactory {
    private static FatsFactory instance = null;
    private Random random;
    
    private FatsFactory() {
        random = new Random();
    }
    
    public static FatsFactory getInstance() {
        if (instance == null) {
            instance = new FatsFactory();
        }
        return instance;
    }
    
    public Fats getFats(DietPlan dietPlan) {
        List<Fats> availableFats = new ArrayList<>();
        
        switch (dietPlan) {
            case NO_RESTRICTION:
                availableFats.add(new Avocado());
                availableFats.add(new SourCream());
                availableFats.add(new Tuna());
                availableFats.add(new Peanuts());
                break;
                
            case PALEO:
                availableFats.add(new Avocado());
                availableFats.add(new Tuna());
                availableFats.add(new Peanuts());
                break;
                
            case VEGAN:
                availableFats.add(new Avocado());
                availableFats.add(new Peanuts());
                break;
                
            case NUT_ALLERGY:
                availableFats.add(new Avocado());
                availableFats.add(new SourCream());
                availableFats.add(new Tuna());
                break;
        }
        
        if (availableFats.isEmpty()) {
            return null;
        }
        return availableFats.get(random.nextInt(availableFats.size()));
    }
}
