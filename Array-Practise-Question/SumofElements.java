import java.util.Scanner;

public class SumofElements {
    
    public static int SumElements(int array[]){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
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

        int result = SumElements(array);
        
        System.out.println("The Sum of all elements in the array is: " + result);

        scanner.close();
    }
}