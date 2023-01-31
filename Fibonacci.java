public class Fibonacci {

    public static void main(String args[]) {
        System.out.println(fibonacci(6));
    }

    public static int fibonacci(int x) {
        if (x < 0) {
            return -1;
        }
        if (x == 0 || x == 1) {
            return x;
        } else {
            return fibonacci(x - 1) + fibonacci(x - 2);
        }

    }
}
