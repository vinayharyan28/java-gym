package numbers;

import java.math.BigDecimal;
import java.math.BigInteger;

public class LargeInteger {
    public static void main(String[] args) {
        int a = 30, b=67;

        BigInteger num1 = new BigInteger("123456789012345678901234567890");
        BigInteger num2 = new BigInteger("987654321098765432109876543210");

        BigInteger sum = num1.add(num2);
        BigInteger product = num1.multiply(num2);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        if (num2.compareTo(num1) < 0){
            System.out.println("Yes");
        }

        BigInteger remainder = num2.remainder(num1);
        System.out.println(remainder);


        BigDecimal x = new BigDecimal("0.03");
        BigDecimal y = new BigDecimal("0.04");
        BigDecimal ans = y.subtract(x);
        System.out.println("big decimal: " + ans);
        System.out.println(x.pow(3));


    }



}
