import java.util.Scanner;

public class p44 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                System.out.print("NOT Palimdrome");
                return;
            }
        }
        System.out.print("Palimdrome");
    }
}
