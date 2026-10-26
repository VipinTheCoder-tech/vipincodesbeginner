import java.util.Scanner;

public class gptstringlooppmix {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Word :");
        String word = sc.nextLine().toLowerCase();
        int count =0;
        for (int i =0 ;i <word.length(); i++)
        {
            char ch =word.charAt(i);
             if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                count++;}
        }
        System.out.println("Total vowels is :"+count);
        sc.close();
    }
}
