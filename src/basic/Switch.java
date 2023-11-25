package basic;
import java.util.Scanner;

public class Switch {
    public static void calculator(int firstValue, int secondValue, char operator){
        switch (operator){
            case '+':
                System.out.println(firstValue + secondValue);
                break;
            case '-':
                System.out.println(firstValue - secondValue);
                break;
            case '*':
                System.out.println(firstValue * secondValue);
                break;
            case '%':
                System.out.println(firstValue % secondValue);
                break;
            case '/':
                System.out.println(firstValue / secondValue);
                break;
            default:
                System.out.println("Please enter value proper arithmetic operator:");
                break;
        }
    }

    public static void switchTesting(){
        int variable = 2;
        switch (variable){
            case 1 :
                System.out.println("Test1");
                break;
            case 2 :
                System.out.println("Test2");
                break;
            case 3 :
                System.out.println("Test3");
                break;
            default :
                System.out.println("Default");
                break;
        }
    }

    public static void breakContinueTesting(){
        int counter = 0;
        do {
            System.out.println(counter);
            counter++;
        }while (counter <= 10);

        System.out.println("-------------------------");
        for (int i=1; i<=5; i++){
            if (i == 3){
                break;
            }
            System.out.println(i);
        }

        System.out.println("-------------------------");
        for (int i=1; i<=5; i++){
            if (i == 3){
                continue;
            }
            System.out.println(i);
        }
    }

    public static boolean primNumber(int number){
        if (number <= 1){
            return false;
        }

        for (int i=2; i< Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(primNumber(5));
        switchTesting();
        breakContinueTesting();
        Scanner scanner = new Scanner(System.in);
        calculator(scanner.nextInt(), scanner.nextInt(), scanner.next().charAt(0));

    }
}
