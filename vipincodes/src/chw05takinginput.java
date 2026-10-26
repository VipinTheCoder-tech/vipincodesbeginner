import java.util.Scanner;

public class chw05takinginput {
    public static void main(String[] args) {

        System.out.println("Taking input from the user ");
   Scanner sc =new Scanner (System.in);
   /*  System.out.println("enter no 1 ");
   //int a =sc.nextInt();
    float a =sc.nextFloat();// using float for decimal inputs and output 

   System.out.println("Enter no 2");
   //int b =sc.nextInt();
   float b = sc.nextFloat();

   //int sum  =a+b;
   float sum =a+b;
   System.out.println("the summ of these numberis : "+sum);
   
  boolean b =sc.hasNextInt(); //if user input integer if will show true if not then false 
  System.out.println(b);
  */
  String str =sc.nextLine();// when we use only sc.next it will print only one word or if sc.nextLine it will print complte words 
  System.out.println(str);
   sc.close();

   
   
    }

}
