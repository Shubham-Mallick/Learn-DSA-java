import java.util.*;
public class SimpleExample{

    static void printNum(int n){

        //base condition (most important)
        if (n == 1){
            System.out.println(1);
        }else{
            System.out.println(n);
            printNum(n-1); // Function calls itself (Recursion)
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number you want to print: ");
        int n = scanner.nextInt();
        printNum(n);
    }
}