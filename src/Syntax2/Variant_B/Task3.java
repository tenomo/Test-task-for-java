package Syntax2.Variant_B;

/**
 * Created by tenom on 09.04.2016.
 */

//        Перевести заданное в десятичной системе число a в восьмеричную
//        систему, используя функцию перевода .
public class Task3
{

    public  static  int DecimalTiOctal (int other)
    {
        // переводит полученое число сначала в строку а потом в инт.
        return  Integer.parseInt(Integer.toOctalString(other));
    }
}
