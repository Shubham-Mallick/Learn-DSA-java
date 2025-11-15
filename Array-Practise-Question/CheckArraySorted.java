import java.util.Scanner;

public class CheckArraySorted {
    public static boolean  arraysorted(int [] array){
        boolean isSorted = true; 
        for (int i = 0 ; i<array.length-1 ; i++){
            if (array[i+1]<array[i])
                isSorted = false;

        }
        return isSorted;

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


        boolean result = arraysorted(array);
        if (result==true){
            System.out.println("Elements in the array is Sorted");
        }else{
            System.out.println("Elements in the array is not sorted");
        }

        scanner.close();
    }
}