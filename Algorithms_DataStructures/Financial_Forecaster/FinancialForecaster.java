
public class FinancialForecaster {
    public static double forecast(double presentValue,double growthRate,int years){
        if(years==0){
            return presentValue;
        }
        return forecast(presentValue*(1+growthRate), growthRate, years-1);
    }

    public static void main(String[] args) {
        double intialValue=500000;
        int years=5;
        double growthRate=0.15;
        double result=forecast(intialValue, growthRate, years);
        System.out.printf("Recurssive Financial Forecast: %.2f after %d years%n",result,years);

    }
    
}