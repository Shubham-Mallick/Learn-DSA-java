import java.util.Scanner;

public class ReverseArray {

    // 1. Change return type to 'void' since the array is reversed in-place.
    public static void reverseArray(int array[]) {
        // The loop correctly swaps elements from the beginning with elements from the end
        // until the middle of the array is reached.
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        // No return statement needed for a void method.
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = scanner.nextInt();

        int array[] = new int[size];

        System.out.println("Enter the " + size + " elements into the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // 2. Call the method, which modifies the original 'array' in place.
        reverseArray(array);
        
        // 3. Print the elements of the modified array using a loop or Arrays.toString().
        System.out.print("The reversed array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? ", " : ""));
        }
        System.out.println(); // For a final newline

        scanner.close();
    }
}