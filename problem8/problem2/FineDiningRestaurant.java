package problem2;

public class FineDiningRestaurant extends Restaurant {
    public FineDiningRestaurant(String name) {
        super(name);
    }
    @Override
    public int estimateDeliveryTime() {
        return 60; // longer due to food prep
    }
}