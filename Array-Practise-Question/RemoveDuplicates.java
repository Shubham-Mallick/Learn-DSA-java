import java.util.*;

public class RemoveDuplicates {

    public static int removeDuplicate(int[] array) {
        // Handle the edge case of an empty array
        if (array.length == 0) {
            return 0;
        }
        int x = 0; 

        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[x]) {
                x = x + 1; 
                array[x] = array[i];
            }
        }
        return x + 1;
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

        System.out.println("Enter the " + size + " elements into the array (must be Sorted): ");
        for (int i = 0; i < size; i++) {
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input for element.");
                scanner.close();
                return;
            }
            array[i] = scanner.nextInt();
        }

        int newLength = removeDuplicate(array);

        System.out.print("Array after removing duplicate elements (Unique Elements): ");
        
        for (int i = 0; i < newLength; i++) {
            System.out.print(array[i] + " ");
        }
        
        System.out.println();
        System.out.println("New length of the array with unique elements is: " + newLength);

        scanner.close();
    }
}