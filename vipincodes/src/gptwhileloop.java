public class gptwhileloop {
    public static void main(String[] args) {
       int i = 2 ;
        while ( i <=10 ){ // in while it checks condtion first then execute the loop 
          System.out.println(i);
            i=i +2;
        //i=i+2;
        // System.out.println(i);// 
        //Why does 12 print? Because when i is 10, the condition is true. Java enters the loop, changes i to 12, and prints it. Only afterward does it check the condition again.
//One correction to your comment: 12 isn't printed after the loop stops. It is printed during the last loop iteration, before Java checks the condition and stops.
  


/*3. One important rule to remember
- The while condition is checked at the beginning of each iteration.
- Statements inside the loop execute in the order you write them.
- The loop stops only when the condition is false at the next check.
  */


}
}
