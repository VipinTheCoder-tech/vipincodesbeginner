import java.util.Scanner;

public class gpt6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("enteryour age here  to check whether yo're eligible tovote or not :------ ");
        int age =sc.nextInt();
        
        if (age >=18){
            System.out.println("you are eligible to vote ");

        } else {
            System.out.println("you are not eligible to vote ");
        }
        sc.close();
    }
}
