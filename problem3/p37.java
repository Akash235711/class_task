import java.util.ArrayList;
import java.util.Scanner;

public class p37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= num; i++) {
            list.add(i);
        }
        int odd = 0;
        int even = 0;
        for (int i = 1; i <= num; i++) {
            if (list.get(i % 2) == 1) {
                odd++;
            }
            else{
                even++;
            }
        }
        System.out.println(odd + " " + even);
    }
}
