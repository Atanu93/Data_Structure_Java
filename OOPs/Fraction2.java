package OOPs;

public class Fraction2 {

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static class InnerFraction {
        int num;
        int den;

        InnerFraction(int num, int den) {
            this.num = num;
            this.den = den;
        }

        void simplify() {
            int hcf = gcd(num, den);
            num /= hcf;
            den /= hcf;
        }
    }

    public static void main(String[] args) {
        InnerFraction f = new InnerFraction(35, 21);

        System.out.println("Before : " + f.num + "/" + f.den);

        f.simplify(); // modifies the same object

        System.out.println("After  : " + f.num + "/" + f.den);
    }
}