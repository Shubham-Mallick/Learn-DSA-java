import java.util.Scanner;
public class Factorial {

    public static int Fact(int n){
        if (n==1){
            return 1;
        }else{
            return n * Fact(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        System.out.println("The result of Factorial" + n +"is: ");
        int result = Fact(n);
        System.out.println(result);
    
    }
}