package Loops;

import java.util.Scanner;

public class inputloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 5;
        System.out.println("Enter 5 numbers");
        while(a !=0){
            int result = sc.nextInt();
            System.out.println("ur number" + result);
            a--;
            if(result % 2 == 0){
                System.out.println("Even");
            }else{
                System.out.println("Odd");
            }
        }

        

    }
}
