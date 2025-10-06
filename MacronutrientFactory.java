public class MacronutrientFactory {
    private static MacronutrientFactory instance = null;
    
    private MacronutrientFactory() {
    }
    
    public static MacronutrientFactory getInstance() {
        if (instance == null) {
            instance = new MacronutrientFactory();
        }
        return instance;
    }
    
    public CarbsFactory getCarbsFactory() {
        return CarbsFactory.getInstance();
    }
    
    public ProteinFactory getProteinFactory() {
        return ProteinFactory.getInstance();
    }
    
    public FatsFactory getFatsFactory() {
        return FatsFactory.getInstance();
    }
}
