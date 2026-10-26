import java.util.Scanner;
public class retrninjva {
   /*  static int addnumber (int a ,int b){
        return a +b;//same work as any arithmetic progression 
        
    }public static void main(String []args){
       int  result = addnumber(45,58);
        System.out.println(result);
    }
}// thats called a return  methods in java 
/*- static int addNumbers(int a, int b) — method do integers leta hai aur ek 
integer return karega.
- return a + b; — dono numbers add karke answer caller ko wapas deta hai.
- int result = addNumbers(15, 25); — returned answer 40 ko result variable
 mein store karta hai.
- System.out.println(result); — stored answer print karta hai.
Difference yaad rakho:
void method	int method
Value return nahi karta	Integer value return karta hai
System.out.println(a+b);	return a+b;



Yehi pattern shopping apps, billing systems aur
 backend applications mein kaam aata hai.
 //               Why we use return becuse void didnt return value and void only 
 // can print mssge on the screen .

 //practical exmple 
 Yehi pattern shopping apps, billing systems aurbackend applications mein kaam aata hai
 */   static  int calculate(int price,int quantity ){
   return price * quantity;
   }
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter price ");
    int price = sc.nextInt();
    System.out.println("enter quantity ");
    int quantity   =sc.nextInt();
int total= calculate(price,quantity );
    //int total = calculate(47, 48);
    System.out.println("Total price "+total);
}

}

