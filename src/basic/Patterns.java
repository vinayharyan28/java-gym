package basic;

public class Patterns {
    static void printStar(int number){
        for(int i=1; i<=number; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void invertedStar(int number){
        for (int i=number; i>0; i--){
            for (int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void halfPyramidPattern(int number){
        for (int i=1; i<=number; i++){
            for (int j=1; j<=i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }

    static void printCharacterPattern(int number){
        char ch = 'A';
        for (int i=1; i<=number; i++){
            for (int j=1; j<=i; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    static void printHallowRectangle(int totalRows, int totalColumns){
        for (int row=1; row<=totalRows; row++){
            for (int column=1; column<=totalColumns; column++){
                if (row == 1 || row == totalRows || column == 1 || column == totalColumns){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void printInvertedRotatedHalfPyramid(int number){
        for (int i=1; i<=number; i++){
            for(int j=1; j<=number-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printInvertedHalfPyramidWithNumber(int number){
        for (int i=number; i>0; i--){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void printFloydTriangle(int number){
        int temp = 0;
        for(int i=1; i<=number; i++){
            for (int j=1; j<=i; j++){
                temp++;
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }

    static void printZeroOneTriangle(int number){
        for (int i=1; i<=number; i++){
            for (int j=1; j<=i; j++){
                if((i+j) % 2 == 0){
                    System.out.print(1);
                }else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    static void printSolidRhombus(int number){
        for(int i=1; i<=number; i++){
            for(int space=i; space<number; space++){
                System.out.print(" ");
            }
            for(int star=1; star<=number; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printHollowRhombus(int number){
        for (int i = 1; i<= number; i++){
            for (int j=i; j<number; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<= number; j++){
                if (i==1 || i == number || j == number || j==1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void buildButterFlyPart1(int number){
        for (int i=1; i<=number; i++){
            for (int star=1; star<=i; star++){
                System.out.print("*");
            }

            for (int space=1; space<=(number * 2)-(i*2); space++){
                System.out.print(" ");
            }

            for (int star=1; star<=i; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void buildButterFlyPart2(int number){
        for (int i=number; i>0; i--){
            for (int star=i; star>0; star--){
                System.out.print("*");
            }

            for (int space=1; space<=(number * 2)-(i*2); space++){
                System.out.print(" ");
            }

            for (int star=i; star>0; star--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printButterflyPattern(int number){
        buildButterFlyPart1(number);
        buildButterFlyPart2(number);
    }

    private static void buildDiamondPatternPart1(int number){
        for (int i=1; i<=number; i++){
            for (int space=i; space<=number-1; space++){
                System.out.print(" ");
            }

            for (int star=1; star<=1+(i-1)*2; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void buildDiamondPatternPart2(int number){
        for (int i=number; i>0; i--){
            for (int space=i; space<=number-1; space++){
                System.out.print(" ");
            }

            for (int star=1; star<=1+(i-1)*2; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printDiamondPattern(int number){
        buildDiamondPatternPart1(number);
        buildDiamondPatternPart2(number);
    }

    static void printPyramidPattern(int number){
        for (int i=1; i<=number; i++){
            for (int space=i; space<=number-1; space++){
                System.out.print(" ");
            }

            for (int star=1; star<=1+(i-1)*2; star++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void printPalindromicPattern(int number){
        for (int i=1; i<=number; i++){
            for (int space=1; space<=number-i; space++){
                System.out.print(" ");;
            }
            for (int j=i; j>1; j--){
                System.out.print(j);
            }
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int number = 5;
        printStar(number);
        System.out.println();
        invertedStar(number);
        System.out.println();
        halfPyramidPattern(number);
        System.out.println();
        printCharacterPattern(number);
        System.out.println();
        printHallowRectangle(number, number);
        System.out.println();
        printInvertedRotatedHalfPyramid(number);
        System.out.println();
        printInvertedHalfPyramidWithNumber(number);
        System.out.println();
        printFloydTriangle(number);
        System.out.println();
        printZeroOneTriangle(number);
        System.out.println();
        printSolidRhombus(number);
        System.out.println();
        printHollowRhombus(number);
        System.out.println();
        printButterflyPattern(number);
        System.out.println();
        printDiamondPattern(number);
        System.out.println();
        printPyramidPattern(number);
        System.out.println();
        printPalindromicPattern(number);
    }
}
