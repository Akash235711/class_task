import java.util.Scanner;

public class p43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int sz = s.length();
        for(int i = sz-1; i >= 0; i--){
            System.out.print(s.charAt(i));
        }
        input.close();
        System.out.println();
    }
}
