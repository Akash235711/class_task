import java.util.ArrayList;
import java.util.Scanner;

public class p31 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <Integer> list = new ArrayList<>();
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            list.add(sc.nextInt());
        }
        for(Integer a : list){
            sum += a;

        }
        double avrg = sum/n;
        System.out.print(avrg);

    }
}
