import java.util.Scanner;

public class p38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int a = 0 ;
        int b = 1;
        for(int i = 2; i <= num; i++){
            int sum = a + b;
            System.out.print(sum + " ");
            a = b;
            b = sum;
        }
        System.out.println();

    }
}
