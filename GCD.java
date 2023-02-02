public class GCD {

    public static void main(String args[]) {

        System.out.println(gcd(8,4));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        if (a < 0 || b < 0) {
            return -1;
        }
        return gcd(b, a % b);
    }
}
