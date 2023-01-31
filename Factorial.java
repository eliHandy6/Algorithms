public class Factorial {

    public static void main(String args[]) {
        //x*factorial(x-1);

        System.out.println(factorial(4));

    }

    public static int factorial(int x) {
        if (x < 0) {
            return -1;
        }
        if (x == 0 || x == 1) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }
}
