package scaler.lld2.strategy;

public class GoogleMaps {
    public void findPath(String source, String destination, TransportationMode mode) {
//        if (mode == "car") {
//            ...
//        }
//        else if (mode == "bike") {
//            ...
//        }

        PathCalculator pcFromMode = PathCalculatorFactory.findPCFromMode(mode);
        pcFromMode.findPath(source, destination);

    }
}
