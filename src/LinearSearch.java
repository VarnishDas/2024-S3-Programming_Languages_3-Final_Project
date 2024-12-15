import java.util.Scanner;
import java.util.InputMismatchException;

public class LinearSearch {
    public static void linearSearch(Scanner scanner) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean validInput = false;
        int numberToSearch = -1;

        while (!validInput) {
            try {
                System.out.print("In the list are values 0, ..., 9; which value would you like to search with linear search? ");
                numberToSearch = scanner.nextInt();
                validInput = true;
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                scanner.nextLine();
            }
        }


        boolean found = false;
        for (int number : numbers) {
            if (number == numberToSearch) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("\nFound\n");
        }
        else {
            System.out.println("\nNot found\n");
        }
    }
}