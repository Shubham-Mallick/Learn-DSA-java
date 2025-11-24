
import java.util.Scanner;

public class BinarySearch {
   public BinarySearch() {
   }

   public static int binarySearch(int[] var0, int var1) {
      int var2 = 0;
      int var3 = var0.length - 1;

      while(var2 <= var3) {
         int var4 = var2 + (var3 - var2) / 2;
         if (var0[var4] == var1) {
            return var4;
         }

         if (var1 < var0[var4]) {
            var3 = var4 - 1;
         } else {
            var2 = var4 + 1;
         }
      }

      return -1;
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter the size of the array: ");
      if (!var1.hasNextInt()) {
         System.out.println("Invalid input for size.");
         var1.close();
      } else {
         int var2 = var1.nextInt();
         if (var2 < 0) {
            System.out.println("Array size cannot be negative.");
            var1.close();
         } else {
            int[] var3 = new int[var2];
            System.out.println("Enter the " + var2 + " elements into the array (must be **Sorted**): ");

            int var4;
            for(var4 = 0; var4 < var2; ++var4) {
               if (!var1.hasNextInt()) {
                  System.out.println("Invalid input for element.");
                  var1.close();
                  return;
               }

               var3[var4] = var1.nextInt();
            }

            System.out.print("Enter the element to be searched in array: ");
            if (!var1.hasNextInt()) {
               System.out.println("Invalid input for target element.");
               var1.close();
            } else {
               var4 = var1.nextInt();
               int var5 = binarySearch(var3, var4);
               if (var5 == -1) {
                  System.out.println("Element not found in the array!!");
               } else {
                  System.out.println("Element found at index: " + var5);
               }

               var1.close();
            }
         }
      }
   }
}
