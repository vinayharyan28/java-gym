package basic;


public class TypeConversion {
    public static void main(String[] args) {
        int integerNumber=25;
        long longNumber = integerNumber;

        //long a = 25;  Not allowed
        //int b = a;
        System.out.println(longNumber);

        // Type casting
        float floatNumberTypeCasting = 25.12F;
        int integerNumberTypeCasting = (int) floatNumberTypeCasting;
        System.out.println(integerNumberTypeCasting);

        long longNumberTypeCasting = 2400000000000L; //
        System.out.println((int) longNumberTypeCasting);

        System.out.println((int) 'a');

        // System.out.println((int) "vinay");

        // Type promotion in expression

        char firstCharacter = 'a';
        char secondCharacter = 'b';
        System.out.println(firstCharacter);
        System.out.println(secondCharacter);
        System.out.println((int) firstCharacter);
        System.out.println((int) secondCharacter);
        System.out.println(secondCharacter - firstCharacter);

        // char thirdCharacterTest =  secondCharacter - firstCharacter; not working implicitly
        // String thirdCharacterTest1 = (String) (secondCharacter - firstCharacter);
        char thirdCharacter = (char) (secondCharacter - firstCharacter);
        System.out.println(thirdCharacter);

        int calculateVar1 = 10;
        float calculateVar2 = 20.25F;
        long calculateVar3 = 25;
        double calculateVar4 = 30;
        double calculateVar5 = calculateVar1 + calculateVar2 + calculateVar3 + calculateVar4;
        System.out.println(calculateVar1 + calculateVar2 + calculateVar3 + calculateVar4);
        System.out.println(calculateVar5);

        int $ = 24;
        System.out.println($);

        int binaryOperator1 = 0;
        int binaryOperator2 = 0;

        System.out.println(binaryOperator1++);
        System.out.println(++binaryOperator2);


    }
}
