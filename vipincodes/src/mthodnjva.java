public class mthodnjva {
 /*    static void sayhello(){
        System.out.println("hello");
        }
    public static void main(String[] args) {
        sayhello();
    }*/
  /*  static void addNumbers(){
    int a =10;
    int b =39;
    System.out.println(a + b );
   }public static void main(String[] args) {
    addNumbers(); // jitne bar ye likhenge utne bar print krega ye 
    addNumbers();
    addNumbers();
   }// ye teen baar likha toh output same 3 baar ayega 
*/

//                        Now the topic is parameter . 
 
// that code is without parameter it will add same value all time 

/*  static void addNumbers(){
    int a =10;
    int b =39;
    System.out.println(a + b );
   }public static void main(String[] args) {
    addNumbers(); // jitne bar ye likhenge utne bar print krega ye 
    addNumbers();
    addNumbers();
   }// ye teen baar likha toh output same 3 baar ayega 
*/

//               With Paramter
static void addnumbers(int a, int b ){ //methds ko 2 integer value recieve krne ke liye variables
    System.out.println(a+b);//koi bhi number diya jaega use ye add krke print krdega 

}  
public static void main(String[] args) {
    addnumbers(45, 58);
    addnumbers(78, 487);
}
}
