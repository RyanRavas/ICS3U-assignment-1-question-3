import java.util.Scanner;

public class Main {

//  Ryan Ravas
//  4/4/2024

    public static void main(String[] args) {
//      initialize Scanner class
        Scanner input = new Scanner(System.in);
        String loop;
        do {
//          get an integer from the uer
            System.out.print("Enter an integer number: ");
            int integer = input.nextInt();
//          get a character from the user
            System.out.print("Enter a letter or symbol: ");
            char symbol = input.next().charAt(0);
//          display menu
            System.out.println("Select an option: ");
            System.out.println("a) Display Grid");
            System.out.println("b) For the integer value above, return the square, cube and fourth power value");
            System.out.println("c) return the unicode for the character symbol above");
//          get user input for menu
            char menuInput = input.next().charAt(0);
            switch (menuInput) {
                case 'a':
                    printGrid(symbol, integer);
                    break;
                case 'b':
                    printPowers(integer);
                    break;
                case 'c':
                    printUnicode(symbol);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
//          ask user if they wish to restart
            System.out.print("Do you want to restart? (yes or no) ");
            loop = input.next();

        } while(!loop.equalsIgnoreCase("no"));
    }
    public static void printGrid(char symbol, int length) {
//      loop for number of rows
        for (int i = 0; i < length; i++) {
//          loop for number of columns
            for (int j = 0; j < length; j++) {
                System.out.printf("%c",symbol);
            }
            System.out.println();
        }
    }
    public static void printPowers(int i) {
        System.out.printf("Powers for %d:\n", i);
        System.out.printf("Second Power: %.0f\n", Math.pow(i, 2));
        System.out.printf("Third power: %.0f\n", Math.pow(i, 3));
        System.out.printf("Fourth power: %.0f\n", Math.pow(i, 4));
    }
    public static void printUnicode(char ch) {
        System.out.printf("Unicode for '%c' is \\u%04x\n", ch, (int) ch);
    }
}