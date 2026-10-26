public class arraywthmthod {


    static int calculateSum(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
          if (numbers[i]> 4 ){
            sum = sum + numbers[i];
          }
            
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {7, 7, 3,4, 9,9};

        int result = calculateSum(numbers);

        System.out.println("Sum: " + result);
    }
}


