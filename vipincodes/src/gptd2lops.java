public class gptd2lops {
    public static void main(String[] args) {
        int i =1 ;
        /* 
        while (i<=10){
            System.out.println("helllo");
            i++;// if will print hello many tims unless it reaches to 10 
            // output will be 10times of hello
            // if i remove i++ theen  java starts with i =1. THE condition 1 <=10 is true so it prints 1 . But i never changes 
            //so  the condition stays true forever thats called  infinite loop .
            */
           int sum =0;
           while(i <=3 ){
            sum = sum+i;
            i++;
           System.out.println(sum);
    } 
        }
}
