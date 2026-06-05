import java.util.Scanner;

public class p35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i = 2; i*i <= num; i++){
            if(num%i==0) {
                System.out.println("NOT PRIME");
                return;
            }
        }
        System.out.println("PRIME");
    }
}
