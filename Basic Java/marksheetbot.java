import java.util.Scanner;

public class marksheetbot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = sc.nextInt();
        
        if (marks >= 90) {
            System.out.println("excellent");
        }
        else if(marks >= 80){
            System.out.println("Very Good");
        }
        else if (marks >= 60) {
            System.out.println("Good");
        }
        else if (marks >= 45) {
            System.out.println("Average");
        }
        else if(marks >= 33) {
            System.out.println("can do better");
        }
        else {
            System.out.println("Failure work hard");
        }
        sc.close();

    }
}
