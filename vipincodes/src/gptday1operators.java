import java .util.Scanner ;
public class gptday1operators {
    public static void main(String[] args) {
        

Scanner sc = new Scanner ( System.in);
   /*String username ="vipin";
    String password = "vip@19";
    System.out.println("Enter Username");
    String correctusername = sc.nextLine();
    System.out.println("Enter Password");
String correctpassword = sc.nextLine();

if (username.equals(correctusername) && password.equals(correctpassword)) {
    System.out.println("Login successful");
} else {
    System.out.println("Login failed");
}
sc.close();
*/
//or (||)

System.out.println("Enter Your Makrs ");
int Marks = sc.nextInt();
System.out.println("Do you have Scholarship (True/False) ");
boolean scholarship =sc.nextBoolean();
if ( Marks >=90 || scholarship)  {  // in OR At Least 1 condition must be true 
    System.out.println("Discount Availble "); 
}
else {
    System.out.println("No Discount");
} sc.close();


    }
}
