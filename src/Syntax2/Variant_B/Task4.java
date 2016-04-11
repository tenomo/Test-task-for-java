package Syntax2.Variant_B;

import java.util.Random;

/**
 * Created by tenom on 09.04.2016.
 */

//        Дан массив целых чисел A. Найти суммы положительных и отрицатель-
//        ных элементов массива, используя функцию определения суммы
public class Task4
{
    int [] array = new int[1000];

    public Task4 ()
    {
        Random rnd= new Random(- (array.length/2));
        for (int i = 0; i < array.length; i++) {

            array[i] = rnd.nextInt(array.length/2);
        }
    }

    public int getSummNegativeElements ()
    {
        int summNegativeElements = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]<0)
                summNegativeElements++;
        }
        return  summNegativeElements;
    }
    public int getSummPositiveElements ()
    {
        int summPositiveElements= 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>0)
                summPositiveElements++;
        }
        return  summPositiveElements;
    }
}
