import java.util.Scanner;

public class ifelseselfcode {
   
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To The DDU Results .in " );
          System.out.println("Please Enter your Password To Login ");
        for ( int attempt =1 ; attempt <=3; attempt++){
           
         int pwd  =sc. nextInt();
        if (pwd <= 1000) {

            System.out.println("Enter Your Marks In English ");
            float English = sc.nextFloat();
            
            System.out.println("Enter Your Marks In Maths ");
            float Maths  = sc.nextFloat();

            
            System.out.println("Enter Your Marks In Physics ");
            float Physics = sc.nextFloat();

            
            System.out.println("Enter Your Marks In Chemistry");
            float Chemistry = sc.nextFloat();
    
            
            System.out.println("Enter Your Marks In Computer");
            float Computer = sc.nextFloat();
              float Totalscore = English+Maths+ Chemistry +Physics+Computer;
            float Totalmarks = (Totalscore/500)*100;
            System.out.println(Totalmarks + "%");
                if( Totalmarks >= 33.00) {
                    System.out.println("You HAve Been Passed ");

                }    
                else {
                    System.out.println("Sorry'You Have Been Failed ");
                } 
           
        } 
        
        
        else {
            System.out.println("Wrong Password  ");
            if ( attempt ==3) {
                System.out.println("Sorry ,Yu HAve BEen Blocked ,Please Try After Sometime");

            } else {
                System.out.println("please Try Again ");
            }
        }


        }
       
       
      

    }
}
