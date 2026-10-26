import java .util.Scanner ;
public class gptques2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
       String Correctusername = "vipin";
       String Correctpassword = "vipin@65";
      // String password ="";   this is unnecessary we dont need this before the loop because yu re going to take the password inside the loop 
       for (int attempt =1 ;  attempt <=3 ; attempt ++){
         
        System.out.println("enter username ");
          String username =sc.nextLine();
          if ( username.equals(Correctusername)){
            System.out.println("enter password");
            String password =sc.nextLine();
            
            if (password.equals(Correctpassword)){
                System.out.println("login successful ");
                System.out.println("Welcome here ");
                break;
            } else {
                System.out.println("password  is wrong  ");
            }  
            }else {
                System.out.println("username is wrong ");
            } 
            } 
            sc.close();
          }
        
       }

     

