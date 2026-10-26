
import java.util.Scanner;

public class gptday2logicalopert {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       /* System.out.println("Enter you Age ");
        int age = sc.nextInt();
        //Taking id card status 
        System.out.println("Do you Have an ud card ? Enter true or false : ");
       boolean hasId = sc.nextBoolean();
       // if yu enter true , then hasId Stores true . if you enter false ,it stores false 
   // now check  the age by usig if else
    if (age >=18 && hasId)
{
    System.out.println("Age requirement met ");
}else {
    System.out.println("too young ");
}
*/
System.out.println("do you have a vaild id pass ");
boolean hasId =sc.nextBoolean();
System.out.println("is your account not blocked ");
boolean accountnotblocked =sc.nextBoolean();
if ( hasId && accountnotblocked){
    System.out.println("Login Successful");

}else {
    System.out.println("login failed");
}

    }
}
