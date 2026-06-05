package problem2;
public class FastFoodRestaurant extends Restaurant {
    public FastFoodRestaurant(String name) {
        super(name);
    }
    @Override
    public double calculateTotalBill(double foodPrice) {
        double tax = foodPrice * 0.15; // 15% fast food tax
        return foodPrice + tax;
    }
    @Override
    public int estimateDeliveryTime() {
        return 20;
    }
}