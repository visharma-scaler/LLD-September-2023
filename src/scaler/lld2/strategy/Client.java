package scaler.lld2.strategy;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPath("A", "B", TransportationMode.BIKE);
    }
}
