import java . util.Scanner;
public class gptques {
    public static void main(String[] args) {
        System.out.println("=====Welcome to My Website =====");
          
        Scanner sc = new Scanner (System.in );
      
        String correctUsername = "vipin";
         String correctPassword = "vipin@6985";
     
     for ( int attempt =1 ;  attempt<=3 ;  attempt ++ ){
       System.out.println("Enter username :");
     String username = sc.nextLine();
     System.out.println("Enter password ");
     String password = sc.nextLine();

      
     if (username.equals(correctUsername) &&  password.equals(correctPassword) ){
      System.out.println("login Successful");
      break;
     }  
     else {
        System.out.println(" Username or Password is Wrong ");
        if ( attempt <3 ){
            System.out.println("Enter again  ");
        }else {
            System.out.println("yu have been locked ");
        }
     }

    }
    sc.close();
    }
}
