import java.util.Scanner;
import java.util.concurrent.atomic.LongAccumulator;

public class p22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         long sum1 = 0;
        long sum2 = 0;
        for (int i = 1; i <= n; i+= 2) {
            sum1 += i;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 2; i <= n; i+= 2) {
            sum2 += i;
            System.out.print(i + " 4");
        }
        System.out.println();
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
