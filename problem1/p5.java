import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        double f = ((Math.sqrt(3))/4)*c*c;
        System.out.printf("%.3f",f);
    }

}
