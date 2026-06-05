import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        double f = ((c/5)*9)+32;
        System.out.printf("%.3f",f);
    }
}
