package example7;

public class BankApplication {
    private static final double FIXED_MARGIN = 1.3;
    private MarginCalculationService marginCalculationService;

    public void setMarginCalculationService(MarginCalculationService marginCalculationService) {
        this.marginCalculationService = marginCalculationService;
    }


    public static double getFixedMargin() {
        return FIXED_MARGIN;
    }

    public double doComplicatedMarginCalculations(double input, double otherInput){
        return marginCalculationService.calculateMargin(input, otherInput);
    }

    public double smartCalculateMethod(double input,double otherInput){
        return marginCalculationService.calculateMargin(input,otherInput) + 4.0 * FIXED_MARGIN;
    }
}
