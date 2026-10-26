import java.util.Scanner;

public class gptATM {
    public static void main(String[] args) {

        int Correctpin = 0000;
        int totalbalance = 1000;

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Welcome to ATM =====");

        for (int attempt = 1; attempt <= 3; attempt++) {

            System.out.println("ENTER YOUR PIN");
            int pin = sc.nextInt();

            if (pin == Correctpin) {

                System.out.println("Welcome here");
                System.out.println("1.Check Balance \n 2.Account info \n 3. Withdrawal   ");
                int choice =sc.nextInt();
                if (choice == 1){
                    System.out.println( "Balance :"+ totalbalance);

                }else if ( choice==2){
                    System.out.println("Account Holder = Vipin Singh ");
                    System.out.println("Acc : 36473***88");
                    System.out.println("Mobile no : 6387251091 \n Address : Ranidiha Khorabar Gorakhpur ");
                } else if (choice==3){
                    System.out.println("enter the amount to withdraw  ");
                    int withdraw = sc.nextInt();
                 if (withdraw <=totalbalance ) {
                        System.out.println("withdrawn "+ withdraw );}
                          else {

                    System.out.println("Insufficiant balance ");
                }
            }
                break;

            } else {

                System.out.println("Wrong PIN");

                if (attempt < 3) {
                    System.out.println("Try again");
                } else {
                    System.out.println("You have been locked");
                }
            }
        }

        sc.close();
    }
}