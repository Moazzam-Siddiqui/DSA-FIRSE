package Loops;

import java.util.Scanner;

public class multiple {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Your Number");
        int a = sc.nextInt();

        for(int i =1; i <=10;i++){
            int result = a * i;
            System.out.println(a + "x" + i +"=" + result);
        }

    }
}
