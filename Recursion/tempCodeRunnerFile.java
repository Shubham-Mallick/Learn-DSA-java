import java.util.Scanner;
public class FibonacciSeries {

    public static int Fibo(int n){
        if (n==0) return 0;
        if (n==1) return 1;
        else return Fibo(n-1) + Fibo(n-2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = scanner.nextInt();
        System.out.println("The result is: ");
        int result = Fibo(n);