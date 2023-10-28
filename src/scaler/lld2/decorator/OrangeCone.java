package scaler.lld2.decorator;

public class OrangeCone implements IceCream {

    @Override
    public String getDescription() {
        return "Orange Cone";
    }

    @Override
    public int getCost() {
        return 20;
    }

    public void setVitaminCLevel(int newLevel) {}
}
