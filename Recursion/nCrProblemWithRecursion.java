import java.util.Scanner;

// In this we use the concept of Pascal's Triangle

public class nCrProblemWithRecursion {


    public static long  nCrRecursive(int n , int r){
        if (r==0 || r==n) return 1;
        if (r>n) return 0;
        return nCrRecursive(n-1, r-1) + nCrRecursive(n-1, r);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.println("Enter the value of r: ");
        int r = scanner.nextInt();

        System.out.println("The Value of nCr is: " + (nCrRecursive(n, r)));
    }
}