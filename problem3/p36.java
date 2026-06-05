import java.util.ArrayList;
import java.util.Scanner;

public class p36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            int num1 = input.nextInt();
            list.add(num1);
        }
        for(int i = list.size() - 1; i >= 0; i--){
            System.out.print(list.get(i) + " ");
        }
    }
}
