package Conditional;
import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("X: ");
        int x = sc.nextInt();
        System.out.print("Y: ");
        int y = sc.nextInt();

        int max = (x > y) ? x : y;
        System.out.println("MAX is " + max);
}
}