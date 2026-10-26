
import java.util.Scanner;

public class cwh13strings {
 public static void main(String[] args) {

  //String are immutable 
  // String  name = "vipin";

   //System.out.println( "My name is : " +name);//  we use ln to change the line after the output 
  // System.out.print("My name is :");
// System.out.print(name);
int a =4;
float b=5.8778f;         // %d we use for  int and double both
//% f for float  
//%c for char 
//%s for String  
//System.out.printf("The Value of a is %d and  The Value of b is %f",a,b  );
//System.out.println();
//The Value of a is 4 and value of b is 5.877800  because it comes like it 
// because of( printf )we can also write like System.out.format Same will  be print 
//System.out.format("The VAlue of a is %d and The Value of b is %f",a,b);
System.out.printf("The Value Of a Is %d And The Value Of b is %8.2f",a,b);
//Thats Taking Sapce of 8 index by entering 8.2 before and taking 2 value only aafter decimal 
System.out.println();
Scanner sc =new Scanner (System.in);
//String st = sc.next(); //only next will print first word
String st =sc.nextLine(); //It will Print Complte Words 

System.out.println(st);

}   

}
