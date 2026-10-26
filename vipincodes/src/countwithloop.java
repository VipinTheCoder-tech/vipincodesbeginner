public class countwithloop {
    public static void main(String[] args) {
        int count =0;
        int i =1 ;
      /*   while (i<=5){
            if  (i>3){
                count++;
            }
 i++;
            } 
           
             System.out.println(count);   
             
             */
          /*   while(i<=5){
                if ( i%2 !=0){
                    count++;
                    
                }i++;
            }System.out.println(count);
            */

         /*    while (i <=10){
                if  (i >= 4 && i <= 9){
                    count++;
            }
            i++;
        }
        System.out.println(count);
*/
  /*while (i<=10){
if (i%3==0){
    count++;
}  
i++;
}
System.out.println(count);*/
/* 
while (i<=10){
    if(i%2==0|| i %3==0){
        count++;
//in this ||| OR operator used so one codntioin must be true so its output will be 7 
    }i++;
}System.out.println(count);
*/
while(i<=10){
    if(i%2==0 &&i%3==0){
        count++;
        
    }i++;
}System.out.println(count);
   //outpur will be1 because i used AND && operatorin it so both condition must be true 
//in boh condition must be true so only 6 is dvisible by 2and 3
    }
}