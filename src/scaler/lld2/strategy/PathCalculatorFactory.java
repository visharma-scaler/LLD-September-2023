package scaler.lld2.strategy;

public class PathCalculatorFactory {
    public static PathCalculator findPCFromMode(TransportationMode mode) {
        return switch (mode) {
            case CAR -> new CarPathCalculator();
            case BIKE -> new BikePathCalculator();
            case WALK -> new WalkPathCalculator();
        };
    }
}
