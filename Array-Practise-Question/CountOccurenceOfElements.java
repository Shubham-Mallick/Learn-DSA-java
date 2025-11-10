import java.util.Scanner;

public class CountOccurenceOfElements {
    
    public static int CountOccurence(int array[] , int targetElement){
        int count = 0;
        for (int i = 0 ; i<array.length ; i++){
            if (array[i]==targetElement){
                count++;
            }
        }
        return count ;
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

        System.out.print("Enter the targetElemrnt of an array: ");
        int targetElement = scanner.nextInt();

        int result = CountOccurence(array , targetElement);
        
        System.out.println("The Occurence of targetElement in the array is: " + result);

        scanner.close();
    }
}