package problem2;
public  class Restaurant {
        protected String name;
        public Restaurant(String name) {
            this.name = name;
        }
        public double calculateTotalBill(double foodPrice) {
            double tax = foodPrice * 0.10;
            return foodPrice + tax;
        }
        public int estimateDeliveryTime() {
            return 40;
        }
        @Override
        public String toString() {
            return "bMain.Restaurant: " + name;
        }
    }
