import java.util.HashMap;
import java.util.Scanner;

public class p45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s =  input.nextLine();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else {
                map.put(c, 1);
            }
        }
        for(char key : map.keySet()){
            System.out.println(key + " " + map.get(key)) ;
        }
    }
}
