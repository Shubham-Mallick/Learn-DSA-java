import java.util.Scanner;

public class SecondLargestElement {
    public static int secondlargest(int []array){
        int largest = array[0];
        int secondlargest = array [1];

        for (int i = 0 ; i<array.length ; i++){
            if (array[i]>largest){
                secondlargest = largest;
                largest = array[i];
            }else if (array[i] > secondlargest && array[i] != largest){
                secondlargest = array[i];

             }


            }
            return secondlargest;

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


        int result = secondlargest(array);
        
        System.out.println("The Second Largest Element in the array is: " + result);

        scanner.close();
    }
}