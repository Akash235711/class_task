import java.util.Scanner;

public class p33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long targetSale = sc.nextLong();
        long Attendence = sc.nextLong();
        long n = sc.nextLong();
        for(int i = 1; i <= n; i++){
            long sale = sc.nextLong();
            long atten = sc.nextLong();
            long percentsale = (sale*100)/(targetSale);
            long percentatten = atten*100/(Attendence);
            if(percentsale >= 95 && percentatten >= 100){
                System.out.println("60 percent Bonus");
            }
            else if(percentsale >= 95 && percentatten >= 90){
                System.out.println("40 percent Bonus");
            }
            else if(percentsale >= 80 && percentatten >= 100){
                System.out.println("40 percent Bonus");
            }
            else if(percentsale >= 80 && percentatten >= 90){
                System.out.println("20 percent Bonus");
            }
            else{
                System.out.println("5% percent Bonus");
            }

        }
    }
}
