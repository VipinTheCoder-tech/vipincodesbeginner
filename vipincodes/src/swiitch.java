import java.util.Scanner;
public class swiitch {
    public static void main(String[] args) {
       // switch is used to execute different code depending 
       // on the value of a variable or expression.
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  The Day ");
        int day = sc.nextInt();
switch (day) {
    case 1:
        System.out.println("Monday");
        
      break ;
    case 2:
        System.out.println("Tuesday");
        break;

    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
            System.out.println("thursday ");
            break;
    case 5: 
          System.out.println("friday ");
break;
    default:
        System.out.println("Invalid day");
}
    }
    
}
/* . Difference between if-else and switch
     if-else                                	switch
Checks conditions	                      Matches values against cases
Supports ranges, e.g. marks >= 90	      Best for specific choices
Can use complex logical conditions	       Uses case labels*/