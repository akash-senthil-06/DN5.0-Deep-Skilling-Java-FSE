package Algorithms.Exercise07;
public class ForecastTest {
    public static void main(String[] args) {
        double presentValue = 1000.00; 
        double growthRate = 0.05;      
        int years = 10;                
        System.out.println("Present Value: $" + presentValue);
        System.out.println("Growth Rate: " + (growthRate * 100) + "%");
        System.out.println("Periods: " + years + " years");
        double futureValueBasic = Forecasting.calculateFutureValue(presentValue, growthRate, years);
        System.out.printf("\nFuture Value (Basic Recursion): $%.2f\n", futureValueBasic);
        double futureValueMemo = Forecasting.calculateFutureValueMemoized(presentValue, growthRate, years);
        System.out.printf("Future Value (Memoized Recursion): $%.2f\n", futureValueMemo);
    }
}
