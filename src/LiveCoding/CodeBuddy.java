package LiveCoding;

public class CodeBuddy {
    public static void main ( String[] args ) {
        int[] numbers = {10, 20, 30};

        numbers = resize(numbers);

        numbers[3] = 40;
        numbers[4] = 50;

        int result = sum(numbers);

        System.out.println("The sum is " + result);

    }

    public static int[] resize(int[] numbers){
        int[] newNumbers = new int[numbers.length * 2];

        for ( int i = 0; i < numbers.length; i++ ) {
            newNumbers[i] = numbers[i];
        }
        return newNumbers;

    }

    public static int sum(int[] numbers){
        int sum = 0;
        for ( int i = 0; i < numbers.length; i++ ) {
            sum += numbers[i];
        }
        return sum;
    }
}
