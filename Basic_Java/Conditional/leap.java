package Conditional;
import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Year: ");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + "leap year.");
                } else {
                    System.out.println(year + "not leap year.");
                }
            } else {
                System.out.println(year + " leap year.");
            }
        } else {
            System.out.println(year + "not leap year.");
        }
    }
}
