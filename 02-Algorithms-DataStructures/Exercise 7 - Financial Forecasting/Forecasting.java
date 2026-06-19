package Algorithms.Exercise07;
import java.util.HashMap;
import java.util.Map;
public class Forecasting {
    public static double calculateFutureValue(double currentValue, double growthRate, int periods) {
        if (periods == 0) {
            return currentValue;
        }
        return calculateFutureValue(currentValue, growthRate, periods - 1) * (1 + growthRate);
    }
    private static Map<Integer, Double> cache = new HashMap<>();
    public static double calculateFutureValueMemoized(double currentValue, double growthRate, int periods) {
        if (periods == 0) {
            return currentValue;
        }
        if (cache.containsKey(periods)) {
            return cache.get(periods);
        }
        double value = calculateFutureValueMemoized(currentValue, growthRate, periods - 1) * (1 + growthRate);
        cache.put(periods, value);
        return value;
    }
}
