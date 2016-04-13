 package Syntax2.Variant_B;


 public class Task6 {

  private static int factorial(int n) {
   if (n == 0) return 1;
   return n * factorial(n - 1);
  }

 public int[][] AllPermutation(int[] array) {
   int[][] permutationResult = new int[factorial(array.length)][array.length];
   int[] bufferArray = array;
   permutationResult[0] = array;
  System.out.println("count " + factorial(array.length));

   for (int i = 1; i < factorial(array.length); i++) {

    bufferArray = permutationResult[i - 1].clone();
    int tmp;


    if (i != 1) {
     tmp = bufferArray[0];
     bufferArray[0] = bufferArray[bufferArray.length - 1];
     bufferArray[bufferArray.length - 1] = tmp;
    }


    for (int j = 0; j < array.length; j++) {

     tmp = bufferArray[0];
     bufferArray[0] = bufferArray[j];
     bufferArray[j] = tmp;
    }
    permutationResult[i] = bufferArray;

   }

   return permutationResult;
  }


 }
