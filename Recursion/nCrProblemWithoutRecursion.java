import java.util.Scanner;

public class nCrProblemWithoutRecursion {

    public static int Fact(int n){
        if(n==0 || n==1) return 1;
        else return n*Fact(n-1);
    }

    public static int nCr(int n , int r){
        if (r>n) return 0;
        int FactN = Fact(n);
        int FactR = Fact(r);
        int FactNR = Fact(n-r);
        
        return FactN / (FactR*(FactNR));

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.println("Enter the value of r: ");
        int r = scanner.nextInt();

        System.out.println("The Value of nCr is: " + nCr(n, r));
    }
}