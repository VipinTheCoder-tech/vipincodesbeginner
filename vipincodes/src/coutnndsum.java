public class coutnndsum {
    public static void main(String[] args) {
        //suppose that i have this array
        int []number = {7,7,2,9};
        //find that howmany number is greater than 5 And sum ot that numbers 
        int count =0;
        int sum =0;
        for ( int i =0; i < number.length ; i++){ // 
            if (number[i] >5  ){
                count++;
                sum = sum+number[i];
            }
        }System.out.println("count"+count);
        System.out.println("sum"+sum);
    }
}
