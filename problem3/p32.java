import java.util.ArrayList;
import java.util.Scanner;

public class p32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Double> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            list.add(sc.nextDouble());
        }
        for(Double a : list){
            if(a >= 3.5f){
                System.out.println("GoT Medal");
            }
            else {
                System.out.println("Not GoT Medal");
            }
        }
    }
}
