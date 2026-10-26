public class cw14StrngMethod {
    public static void main(String[] args) {
      /*  String name ="ViPin";
       int value =name.length();
       System.out.println(value); 
       String  a  = name.toLowerCase();
        String b =name.toUpperCase();

         System.out.println(b);
    System.out.println(a); 

    */

   String name ="Vipin    ";
   //System.out.println(name);//wehn we do not use.trim() the space with String got print 
   System.out.println(name.trim());
    // when we use .trim thespaces before nd after the String got trimmed 
    
    String substring="vipin"; //the substing() we use to trim the String value
             //       01234 
    //ex vipin i wants to trim vi nd wants to print from pin show  i do substrin(2)
    System.out.println(substring.substring(2));
    //itwill start printing from index 2 (pin )
    //like print from 0 it will print same as 
   System.out.println(substring.substring(0));
   System.out.println(substring.substring(0,4));
   // it will print from index 0 and end before 4 lst 4 will not print 
   // soif we wants toprint complete index we have to end int 1 extra 
   System.out.println(substring.substring(0,5));
    // i have only 4 index we have to add 1 in last like 0 to 5 print complue of string 
System.out.println(substring.replace("vipin", "karan"));
// '' we use single quotes for char & Double Quotes for Strings 
// it replce the char like i printed v to p it replces v to p in  substring vipin 
System.out.println(substring.replace('v', 'p'));
System.out.println(substring.startsWith("vip"));
System.out.println(name.startsWith("pin"));
System.out.println(name.endsWith("  ")); 
System.out.println(substring.endsWith("pin"));
System.out.println(substring.endsWith("n"));
//object.startsWith("") check is string starting with selected string or not 
//it return true/false
System.out.println(name.charAt(2));
System.out.println(name.indexOf("p"));
System.out.println(name.indexOf("i",2));
System.out.println(name.lastIndexOf("i")); // it prints last index of i in name="vipin "
System.out.println(name.lastIndexOf("i",2));// it returns last index which occur before the given index 
System.out.println(name.equalsIgnoreCase("vipin    "));
System.out.println(name.equals("vipin")); //it returns false because in name vipin (V )is capital letter 

// Escape Sequences 
/*\t -insert a tab in the text at this point 
\b -insert a backspace in the text at this point 
\n -  insert anew line inthe text at this point 
\t - insert a tab in the line 
 */

//System.out.println("This is Escape Sequence " Character  " ); this will print error 
System.out.println("This is escape Sequence \" Character "); 
System.out.println("This is escape Sequence \\Character "); // we have to use  backslash before quotes in middle pf line toprint the quotes 
System.out.println("This is escape Sequence \' Character ");
System.out.println("How they're going .And \" why  ");
System.out.println("hell0 \nhow r you ");//we use backslash n for new line 

System.out.println( "Total charactr ="+name.length());
System.out.println( "UpperCase :"+name.toUpperCase());
System.out.println( "LowerCase:"+name.toLowerCase());



}

}
    
