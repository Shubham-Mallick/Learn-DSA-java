import java.util.Scanner;

public class LargestElement {

    public static int largestElement(int array[]) {
        int largestElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (largestElement < array[i]) {
                largestElement = array[i];
            }
        }
        return largestElement;
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

        int result = largestElement(array);
        System.out.println("Largest Element in the array is: " + result);

        scanner.close();
    }
}
