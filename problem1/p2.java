import java.util.Scanner;
public class p2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double area = (4/3)*3.1416*r*r*r;
        System.out.println(area);
        sc.close();
    }
}
