package OOPs;

public class fraction {

    public static InnerFraction add(InnerFraction f1, InnerFraction f2) {
        int numerator = f1.num * f2.den + f1.den * f2.num;
        int denominator = f1.den * f2.den;
        InnerFraction f3 = new InnerFraction(numerator, denominator);
        f3.simplify();
        return f3;
    }

    public static InnerFraction mulFraction(InnerFraction f1, InnerFraction f2) {
        int numerator = f1.num * f2.num;
        int denominator = f1.den * f2.den;
        InnerFraction f3 = new InnerFraction(numerator, denominator);
        f3.simplify();
        return f3;
    }

    public static int gcd(int x, int y) {
        int min = Math.min(x, y);

        for (int i = min; i >= 1; i--) {
            if (x % i == 0 && y % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static class InnerFraction {
        int num;
        int den;

        public InnerFraction(int x, int y) {
            num = x;
            den = y;
        }

        public void simplify() {
            int hcf = gcd(num, den);
            num /= hcf;
            den /= hcf;
        }

        public void print() {
            System.out.println(num + "/" + den);
        }

    }

    public static void main(String[] args) {

        InnerFraction f1 = new InnerFraction(7, 21);
        System.out.print("Before: ");
        f1.print();

        f1.simplify();

        System.out.print("After : ");
        f1.print();

        System.out.println();

        InnerFraction f2 = new InnerFraction(35, 21);
        System.out.print("Before: ");
        f2.print();

        f2.simplify();

        System.out.print("After : ");
        f2.print();

        InnerFraction f3 = add(f1, f2);
        f3.print();

        InnerFraction f4 = mulFraction(f1, f2);
        f4.print();
    }
}