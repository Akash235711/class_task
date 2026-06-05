import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int num1 = input.nextInt();
        char ch1 = input.next().charAt(0);
        if(ch1=='+'){
            int res = num+num1;
            System.out.println(res);
        }
        else if(ch1=='-'){
            int res = num-num1;
            System.out.println(res);
        }
        else if(ch1=='*'){
            int res = num*num1;
            System.out.println(res);
        }
        else if(ch1=='/'){
            int res = num/num1;
            System.out.println(res);
        }
    }
}
