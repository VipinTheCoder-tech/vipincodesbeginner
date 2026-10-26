import java.util.Scanner;

public class gpt4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        double d =a/b;
    
        System.out.println("when we divide a by b is : "+ d);

       System.out.println("And when we do addition of "+a+b);
        // write your code here

        sc.close();
    }
}