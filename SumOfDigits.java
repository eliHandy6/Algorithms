public class SumOfDigits {

    public static void main(String args[]) {
    //number % 10 + sumOfDigitsInANumber(number / 10);
        System.out.println(sumOfDigitsInANumber(1020));
    }

    public static int sumOfDigitsInANumber(int number) {
        if (number == 0 || number < 0) {
            return 0;
        }
        return number % 10 + sumOfDigitsInANumber(number / 10);
    }
}
