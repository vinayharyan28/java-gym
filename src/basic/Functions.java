package basic;

public class Functions {
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static int binomialCoefficient(int n, int r){
        int nFactorial = factorial(n);
        int rFactorial = factorial(r);
        int nMinusR = factorial(n-r);
        return nFactorial/(rFactorial*nMinusR);
    }

    static boolean isPrime(int number){ // Enter greater than one
        if (number == 2){
            return true;
        }

        for (int i=2; i<number; i++){
            if (number % i == 0){
                return false;
            }
        }return true;

    }

    public static int binaryToDecimal(int number){
        int power = 0;
        int decimal=0;
        while (number != 0){
            int digit = number % 10;
            decimal += (int) (Math.pow(2, power)) * digit;
            number /= 10;
            power++;
        }
        return decimal;
    }

    public static int decimalToBinary(int number){
        int power = 0, binaryNumber = 0;
        while (number != 0){
            int remainder = number % 2;
            binaryNumber = binaryNumber + (remainder * (int) Math.pow(10, power));
            number /= 2;
            power++;
        }
        return binaryNumber;
    }
    public static void main(String[] args) {
        int number = 5;
        System.out.println(factorial(number));
        System.out.println(binomialCoefficient(5, 2));
        System.out.println(isPrime(number));
        System.out.println(binaryToDecimal(101));
        System.out.println(decimalToBinary(7));

        {
            System.out.println("Hi am a block");
        }
    }
}
