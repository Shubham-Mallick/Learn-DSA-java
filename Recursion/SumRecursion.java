import java.util.*;
public class SumRecursion {

    public static int Sum(int n ){
        if (n==1){
            return 1;
        }else{
            return n + (Sum(n-1));
        }
    }

    public static void main(String[] args) { 
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("The Sum of 1 to "+ n +" is: ");
        int result = Sum(n);
        System.out.println(result);

    }
    
}
