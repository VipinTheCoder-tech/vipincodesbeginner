import java .util.Scanner;


public class gptday1scannr {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   /*  System.out.println("Enter Your Age :");
    int Age = sc.nextInt();
    System.out.println("Your Age is :"+Age );
    sc.close();
*/ 
//buid a program that ask user for two numbers and prints thier sum difference,product,division and remainder .

System.out.println("Enter Number 1:");
int Number1 = sc.nextInt();
System.out.println("Enter Number 2:");
int NUmber2 =sc.nextInt();
 int sum = Number1 +NUmber2 ;
System.out.println("The Sum Of Two Numbers is : "+ sum);
float division = Number1/NUmber2;
System.out.println("Division  of Two Number is :  "+ division);
int difference= Number1-NUmber2;
System.out.println("Difference of these Two Number is :"+ difference);
float product = Number1*NUmber2;
System.out.println("Product  of These Two Number is "+ product);





    }

}
