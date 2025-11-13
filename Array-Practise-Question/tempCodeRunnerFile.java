import java.util.Scanner;

public class MoveZeroesToEnd {
    public static void movezeroes(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[index] = array[i];
                index++;
            }
        }
        while (index < array.length) {
            array[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the " + size + " elements into the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        movezeroes(array);

        System.out.print("Array after moving zeroes to the end: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
