package Syntax2.Variant_B;

/**
 * Created by tenom on 11.04.2016.
 */
public class Task6
{

   private static int factorial(int n)
    {
        if (n == 0) return 1;
        return n * factorial(n-1);
    }

    int [][] AllPermutation (int [] array )
    {
        int [][] permutationResult = new int[factorial(array.length)][array.length];
        int [] bufferArray = array;
        permutationResult[0] = array;
        int idfrom = 0; int idto = 0;
        for (int i=1; i < factorial(array.length);i++)
        {
            for (int j = 0; j < array.length; j++) {
                idto++;
               bufferArray =
            }
            idfrom++;
        }

        return  permutationResult;
    }


}
