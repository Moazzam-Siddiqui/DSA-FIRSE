package Conditional;
import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your yearly salary");
        int aukat = sc.nextInt();
        

        if (aukat >= 30000000) {
            System.out.println("Wagon R is ur car");
        }
        else if(aukat >5000000){
            System.out.println("FORTUNER LE AAYO");
        }else if (aukat >= 100000) {
            System.out.println("Bike kharid gareeb");
        }
        else {
            System.out.println("saal ki salary bata");
        }
        sc.close();

    }
}
