// TOH stands for Tower of Hanoi
import java.util.Scanner;

public class TOHProblem {

    public static void  TOH(int n , char source , char helper , char destination){
        if(n==1){
            System.out.println("MOVE Disk "+source+" to "+destination);
            return;
        }

        TOH(n-1,source,destination,helper);
        System.out.println("MOVE Disk "+n+" from "+source+" to "+destination);
        TOH(n-1,helper,source,destination);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of disk: ");
        int n = scanner.nextInt();
        TOH(n,'A', 'B','C');

    }
}