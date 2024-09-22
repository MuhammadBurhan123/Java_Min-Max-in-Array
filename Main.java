public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        int min = numbers[0];
        int max = numbers[0];
        
        for(int i = 1; i < numbers.length; i++) {
            if(min > numbers[i]) {
                min = numbers[i];
            }

            if(max < numbers[i]) {
                max = numbers[i];
            }
        }

        System.out.println("The minimum number is " + min + " and the maximum number is " + max + ".");
    }
}