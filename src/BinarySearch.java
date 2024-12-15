import java.util.Scanner;
import java.util.InputMismatchException;

public class BinarySearch {
    public static void binarySearchInitiator(Scanner scanner) {
        Integer[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean validInput = false;
        int numberToSearch = -1;
        int min = 0;
        int max = 9;

        while (!validInput) {
            try {
                System.out.print("In the list are values 0, ..., 9; which value would you like to search with binary search? ");
                numberToSearch = scanner.nextInt();
                validInput = true;
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                scanner.nextLine();
            }
        }

        boolean found = binarySearch(numbers, min, max, numberToSearch);

        if (found) {
            System.out.println("\nFound\n");
        }
        else {
            System.out.println("\nNot found\n");
        }
    }

    private static <T extends Comparable<T>>
    boolean binarySearch(T[] data, int min, int max, T target)
    {
        boolean found = false;
        int midpoint = (min + max) / 2;  // determine the midpoint

        if (data[midpoint].compareTo(target) == 0)
            found = true;

        else if (data[midpoint].compareTo(target) > 0)
        {
            if (min <= midpoint - 1)
                found = binarySearch(data, min, midpoint - 1, target);
        }

        else if (midpoint + 1 <= max)
            found = binarySearch(data, midpoint + 1, max, target);

        return found;
    }
}