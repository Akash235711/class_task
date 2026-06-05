package problem2;

public class bMain {
    public static void main(String[] args) {
        double foodPrice = 100.0;

        Restaurant[] restaurants = {
                new Restaurant("Generic Diner"),
                new FastFoodRestaurant("Burger Barn"),
                new FineDiningRestaurant("Le Gourmet")
        };

        System.out.println("====== Online Food Ordering System ======");
        System.out.printf("%-25s %-15s %-20s%n", "Restaurant", "Delivery Time", "Total Bill ($100 order)");
        System.out.println("-".repeat(60));

        for (Restaurant r : restaurants) {
            System.out.printf("%-25s %-15s $%-20.2f%n",
                    r.name,
                    r.estimateDeliveryTime() + " mins",
                    r.calculateTotalBill(foodPrice));
        }
    }
}