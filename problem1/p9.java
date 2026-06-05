import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(0 <= n && n <= 39){
            System.out.println("F");
        }
        else if(40 <= n && n <= 59){
            System.out.println("C+");
        }
        else if(60 <= n && n <= 69){
            System.out.println("B");
        }
        else if(70 <= n && n <= 79){
            System.out.println("A-");
        }
        else if(80 <= n && n <= 89){
            System.out.println("A");
        }
        else{
            System.out.println("A+");
        }

    }
}
