public class sumofnowithloop {
    public static void main(String[] args) {
       /*  int i = 1;
        int sum =0;
        while (i<=5){
            sum = sum+i;
            i++;
          
        
            
            
        }System.out.println(sum);
        */
      // write a program that checks all numbers from 1 to50  and (()displays )
     /*int count =0;

     int sum =0;
      for (int i =1 ; i <=20; i++ ){
        if(i % 3 == 0 && i%2 !=0  ){
          count++;
          sum =sum +i;
        }

      }System.out.println("totalNo divisible by 3 is :"+count);
      System.out.println("Sum:"+ sum);*/
    /*int []numbers ={1,9,2,14,7}; //this is an arry where i had stored many number to check which is gretater 
int largest = numbers[0];// we put index 0 here  to start checking with index o 
for (int i =0; i <numbers.length; i++){ // i = to check from index 0  if i is less than total numer keep chenging one by one soi++
    if (numbers[i]>largest ){
        largest = numbers[i];


    }
}
System.out.println(largest );
*/
int [] number = {9,8,89,34,23};
int largest =number[0];
for ( int i =1; i<number.length; i++){
    if( number[i]>largest){
        largest=number[i];
    }
}System.out.println(largest);



    }
}
