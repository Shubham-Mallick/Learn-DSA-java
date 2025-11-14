import java.util.*;

public class BinarySearch {
    public static int binarySearch(int[] array, int targetElement) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == targetElement) {
                return mid;
            } else if (targetElement < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input for size.");
            scanner.close();
            return;
        }
        int size = scanner.nextInt();

        if (size < 0) {
            System.out.println("Array size cannot be negative.");
            scanner.close();
            return;
        }

        int[] array = new int[size];

        System.out.println("Enter the " + size + " elements into the array (must be **Sorted**): ");
        for (int i = 0; i < size; i++) {
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input for element.");
                scanner.close();
                return;
            }
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to be searched in array: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input for target element.");
            scanner.close();
            return;
        }
        int targetElement = scanner.nextInt();

        int result = binarySearch(array, targetElement);
        if (result == -1) {
            System.out.println("Element not found in the array!!");
        } else {
            System.out.println("Element found at index: " + result);
        }
        scanner.close();
    }
}