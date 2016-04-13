
public class ActionUnderTheConditions
{

    public static double sumif (double [] array)
    {
        double result = 0;
        for (int i = 0; i <array.length ; i++) {
            result += array[i];
        }
        return result;
    }

    public static double sumif (double [] array, String param)
    {
        double result = 0;
        for (int i = 0; i <array.length ; i++) {
            switch (param)
            {
                case  "e<0":
                    result += array[i];
                case "e>0":
                    result += array[i];
                case "e=>1000":
                    result += array[i];
                case "e<=1000":
                    result += array[i];
                    default:
            }
        }
        return result;
    }

}