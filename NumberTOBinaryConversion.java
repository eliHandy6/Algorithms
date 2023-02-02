public class NumberTOBinaryConversion {


    public static void main(String args[]) {

        System.out.println(numberToBinary(15));
    }

    public static int numberToBinary(int number) {
        if (number == 0) {
            return 0;
        }
        return number % 2 + 10 * numberToBinary(number / 2);
    }
}
