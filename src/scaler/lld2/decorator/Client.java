package scaler.lld2.decorator;

public class Client {

    public static void main(String[] args) {
        IceCream iceCream =
                new ChocoChips(
                        new VanillaScoop(
                                new StrawberryScoop(
                                        new ChocoChips(
                                                new ChocolateCone(
                                                        new ChocolateCone(
                                                                new OrangeCone()
                                                        )
                                                )
                                        )
                                )
                        )
                );

        System.out.println(iceCream.getDescription());
        System.out.println(iceCream.getCost());
    }
}
