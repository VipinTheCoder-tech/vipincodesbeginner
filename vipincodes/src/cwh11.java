import java.util.Scanner;
public class cwh11 {
   public static void main(String[] args) {
    System.out.println("Welocome to the result .in ");
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the total marks of subject :");
    float totalmax =sc.nextFloat();
    System.out.println("Enter Total Marks in English ");
    float English = sc.nextFloat();
    System.out.println("Enter Total MArks in MAths ");
    float maths =sc.nextFloat();
    System.out.println("Enter TotalMarks in Physics ");
    float physics =sc.nextFloat();
    System.out.println("Enter Total Marks in Chemsitry ");
    float Chemistry =sc.nextFloat();
    System.out.println("Enter Total Marks in Computer ");
    float Computer =sc.nextFloat();
    float totalobtained = English  +physics + Chemistry + Computer  +maths ;

    float TotalMaximum =totalmax*5;
    float  percentage =(totalobtained  / TotalMaximum) * 100;
    System.out.println("Total Obtained Marks = "+totalobtained);
    System.out.println("The Percentage ="+ percentage );
     sc.close();


   }

  
}
