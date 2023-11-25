package basic;
import java.util.Scanner;


public class Input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //String input = scanner.next(); // Single word

        //System.out.println("Input: " + input);

        String fullName = scanner.nextLine(); // Multiple word
        System.out.println(fullName);

        int number = scanner.nextInt();
        System.out.println(number);

        float price = scanner.nextFloat();
        System.out.println("price: " + price);


    }
}
