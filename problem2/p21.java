import java.util.Scanner;

public class p21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n%400 == 0 ||(( n%4 == 0)&&(n%100 != 0))){
            System.out.println("LEAP YEAR");
        }
        else{
            System.out.println("NOT LEAP YEAR");
        }
    }
}
