import java.util.Scanner;

public class cwh06 {
    public static void main(String[] args) {
        //write a program to calculate the percentage of a givem student in a cbse board exam 
        //his marks from 5 sub mst be taken as input from the keyboard (total marks out of 100
        Scanner sc =new Scanner(System.in);
     System.out.println("enter marks in maths ");
        float marks1 =sc.nextFloat();
       
       // double marks1 =sc.nextDouble();

        System.out.println("enter marks in english ");
        float marks2 =sc.nextFloat();
        float total= marks1 +marks2;
       // double marks2 =sc.nextDouble();
       // double total =marks1+marks2; //the result coming after using float and double like 
        //if we use float the percentage coming like 58.0 nd with double 57.9999999 thts the diffrence  so for 
        //percenatge type questionwe can use float for best 

        System.out.println("total Marks :"+total);
        System.out.println( "percentage is:"+ total/200*100 +"%");
        sc.close();
        
    }
}
