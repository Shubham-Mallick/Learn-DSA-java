import java.util.Scanner;
public class SumofArrayElements {
    
    public static int sumArray(int[]num , int n){
        if (n<=0) return 0;
        else  return num[n-1] + sumArray(num, n-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int size = scanner.nextInt();
        int [] num = new int[size];
        System.out.println("Enter the Elements into the Array: ");
        //Input the elements
        for (int i =0;i<=size-1;i++){
            num[i]= scanner.nextInt();
        }
        int result = sumArray(num, size);
        System.out.println("The sum of Array Elements is : 1" + result );
    }

}
