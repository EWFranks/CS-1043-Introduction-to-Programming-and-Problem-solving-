import java.util.Scanner;

public class ModifyArray {

  public Static void swapArrayEnds(int[] array){
     int temp = array[0];
     array[0]=array[array.length-1];
     array[array.length-1]=tmp;
  }

   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int numElem = 4;
      int[] sortArray = new int[numElem];
      int i;
      int userNum;

      for (i = 0; i < sortArray.length; ++i) {
         sortArray[i] = scnr.nextInt();
      }

      swapArrayEnds(sortArray);

      for (i = 0; i < sortArray.length; ++i) {
         System.out.print(sortArray[i]);
         System.out.print(" ");
      }
      System.out.println("");
   }
}