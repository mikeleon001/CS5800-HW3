import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarbsFactory {
    private static CarbsFactory instance = null;
    private Random random;
    
    private CarbsFactory() {
        random = new Random();
    }

    public static CarbsFactory getInstance() {
        if (instance == null) {
            instance = new CarbsFactory();
        }
        return instance;
    }
    
    public Carbs getCarbs(DietPlan dietPlan) {
        List<Carbs> availableCarbs = new ArrayList<>();
        
        switch (dietPlan) {
            case NO_RESTRICTION:
                availableCarbs.add(new Cheese());
                availableCarbs.add(new Bread());
                availableCarbs.add(new Lentils());
                availableCarbs.add(new Pistachio());
                break;
                
            case PALEO:
                availableCarbs.add(new Pistachio());
                break;
                
            case VEGAN:
                availableCarbs.add(new Bread());
                availableCarbs.add(new Lentils());
                availableCarbs.add(new Pistachio());
                break;
                
            case NUT_ALLERGY:
                availableCarbs.add(new Cheese());
                availableCarbs.add(new Bread());
                availableCarbs.add(new Lentils());
                break;
        }
        
        if (availableCarbs.isEmpty()) {
            return null;
        }
        return availableCarbs.get(random.nextInt(availableCarbs.size()));
    }
}
