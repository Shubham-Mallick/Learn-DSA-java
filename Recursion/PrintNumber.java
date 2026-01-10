public class PrintNumber{

    // Print Number from 1 to 10 using Recursion
    public static void  printNumbers(int n){
        if (n==1){
            System.out.println(1);
        }else{
        System.out.print(n + "\t");
        printNumbers(n-1);
        }
    }
    // Print Number from 1 to 10 using Recursion
    public static void  printNumbers1(int n){
        if (n==10){
            System.out.println(10);
        }else{
        System.out.print(n + "\t");
        printNumbers1(n+1);
        }
    }



    public static void main(String[] args) {
        System.out.println("Numbers from 10 to 1 are: ");
        printNumbers(10); // Function Calling
        System.out.println("Numbers from 1 to 10 are: ");
        printNumbers1(1); // Function Calling

    }

}