import java.util.*;

public class LinearSearch {
    public static int  linearSearch(int [] array ,int targetElement){
        int index = -1;
        for (int i = 0;i<array.length ; i++){
            if (array[i]==targetElement){
                index = i;
                break;
            }
        }
        return index;

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

        System.out.println("Enter the " + size + " elements into the array: ");
        for (int i = 0; i < size; i++) {
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input for element.");
                scanner.close();
                return;
            }
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the element to be searched in array: ");
        int targetElement = scanner.nextInt();

        int result = linearSearch(array , targetElement);
        if (result==-1){
            System.out.println("Element not found in the array!!");
        }else{
            System.out.println("Element found at index:"+result);
        }
        scanner.close();
    }
}