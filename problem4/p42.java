class Search{
    public void filterProducts(String s){
        System.out.println("Searching By Category");

    }
    public void filterProducts(int price_mx,int price_mn){
        System.out.println("Searching By Price-Range");
    }
    public void filterProducts(String Brand,int quality){
        System.out.println("Searching By Brand & Quality");
    }
    public void filterProducts(String catagory, int price_mx, int price_mn){
        System.out.println("Searching By Categoty, & price_range");

    }
    public void filterProducts(String catagory, int price_mx, int price_mn,String brand){
        System.out.println("Searching By Categoty, price_range & brand");

    }

}
public class p42 {
    public static void main(String[] args) {
        Search s = new Search();
        s.filterProducts("electronics");
        s.filterProducts(500,300);
        s.filterProducts("Apple",500);
        s.filterProducts("Electronics",500,100);
        s.filterProducts("Electronics",500,100,"NIKE");

    }
}
