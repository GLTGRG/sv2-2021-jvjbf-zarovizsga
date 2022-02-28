package shipping;

public class InternationalPackage implements Transportable{

    private int weight;
    private boolean breakable;
    private String destination;
    private int distance;

    private static final int PRICE = 1200;
    private static final int PRICE_MULTIPLIER = 2;
    private static final int KM_PRICE = 10;

    public InternationalPackage(int weight, boolean breakable, String destination, int distance) {
        this.weight = weight;
        this.breakable = breakable;
        this.destination = destination;
        this.distance = distance;
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
            return PRICE * PRICE_MULTIPLIER + KM_PRICE * distance;
        } else {
            return PRICE + KM_PRICE * distance;
        }
    }

    @Override
    public String getDestinationCountry() {
        return destination;
    }

    public int getDistance() {
        return distance;
    }
}
