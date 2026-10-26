import java.util.Scanner;

public class mthodovrloading {
    static int  add (int a , int b ){
        return a*b ;

    }
    static int add ( int a , int b ,int c ){
        return a + b * c ;
    }
    static int add  ( int a ,int b ,int c ,int d ){
        return a *b*c*d ;

    }
    public static void main(String[] args) {
     /*  System.out.println(add(85, 450));
        System.out.println(add(85, 89, 14));
        System.out.println(add(788, 74, 15, 47));*/
        Scanner sc =new Scanner ( System.in);
        System.out.println("enter first numbr ");
        int  a =sc .nextInt();
        System.out.println("enter a second number ");
        int b = sc.nextInt();
        System.out.println("enter the third number ");
        int  c = sc.nextInt();
        System.out.println("Enter the fourth number ");
        int d =sc.nextInt();
          System.out.println("Sum of two numbers: " + add(a, b));
            System.out.println("Sum of three numbers: " + add(a, b,c));
              System.out.println("Sum of four  numbers: " + add(a, b,c,d));
sc.close();
    }
// That is called method Overloading 
// when in a one class the name of multiple  method is same and there parameters are diffrent .
}
