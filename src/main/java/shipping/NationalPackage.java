package shipping;

public class NationalPackage implements Transportable {

   private int weight;
   private boolean breakable;

   private static final int PRICE = 1000;
   private static final int PRICE_MULTIPLIER = 2;

    public NationalPackage(int weight, boolean breakable) {
        this.weight = weight;
        this.breakable = breakable;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public boolean isBreakable() {
        return breakable;
    }

    @Override
    public int calculateShippingPrice() {
        if (breakable){
            return PRICE * PRICE_MULTIPLIER;
        } else {
            return PRICE;
        }
    }
}
