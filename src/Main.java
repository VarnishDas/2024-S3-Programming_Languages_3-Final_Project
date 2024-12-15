import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            //Display menu
            System.out.println("Menu of Searching and Sorting Testbed.\n");
            System.out.println("1) Linear searching");
            System.out.println("2) Binary searching");
            System.out.println("3) O(n^2) type of sorting");
            System.out.println("4) O(n*log(n)) type of sorting");
            System.out.println("5) Sorting performance\n");
            System.out.println("q/Q) Quit\n");
            System.out.print("Your choice: ");

            //Get user input
            choice = scanner.nextLine().toUpperCase();

            switch (choice) {
                case "1":
                    LinearSearch.linearSearch(scanner);
                    break;
                case "2":
                    BinarySearch.binarySearchInitiator(scanner);
                    break;
                case "3":
                    System.out.println("Data set before insertion sorting: ");
                    Integer[] insertionSortArray = randomArray(10);
                    displayArray(insertionSortArray);

                    System.out.println("Data set after insertion sorting: ");
                    displayArray(InsertionSort.insertionSort(insertionSortArray));
                    break;
                case "4":
                    System.out.println("Data set before quicksort: ");
                    Integer[] quicksortArray = randomArray(10);
                    displayArray(quicksortArray);

                    System.out.println("Data set after insertion sorting: ");
                    displayArray(QuickSort.quickSortInitiator(quicksortArray));
                    break;
                case "5":
                    System.out.println("Sorting performance");
                    break;
                case "Q":
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        while (!choice.equals("Q"));

        scanner.close();
    }

    private static Integer[] randomArray(int size) {
        Random random = new Random();
        Integer[] randomNumbersArray = new Integer[size];

        for (int i = 0; i < size; i++) {
            randomNumbersArray[i] = random.nextInt(201) - 100;
        }

        return randomNumbersArray;
    }

    private static <T> void displayArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
    }
}