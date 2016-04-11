package Syntax2.Variant_B;

import com.sun.corba.se.pept.protocol.ServerRequestDispatcher;
import com.sun.deploy.net.proxy.RemoveCommentReader;
import org.omg.PortableServer.ServantRetentionPolicy;

/**
 * Created by tenom on 09.04.2016.
 */
//        Описать функцию, которая удаляет из строки все лишние пробелы. Пробе-
//        лы считаются лишними, если их подряд идет более двух, если они стоят в
//        конце строки после последней точки, если стоят после открывающегося
public class Tesk5
{
    public static String    RemoveExtraSpaces  ( ) {

        String str=  "Описать   функцию,   которая   удаляет из строки все    лишние пробелы.  Пробе - " +
                "лы считаются   лишними, если  их подряд идет более двух,   если они стоят в " +
                "конце строки   после последней   точки, если  стоят после открывающегося " +
                "парного    знака препинания.   ";

      return  RemoveExtraSpaces(str);
    }
    public  static String RemoveExtraSpaces  (String inputStr) {

        String s =  inputStr;
        String[] a = s.split("\\s+");
        StringBuilder stringBuilder = new StringBuilder();
        for ( String n : a )
            stringBuilder.append(n+" ");
        return  stringBuilder.toString();
    }
}
