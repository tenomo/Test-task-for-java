/**
 * Created by user on 13.04.2016.
 */
package OOP;
public class Triangle
{
    private double aLenght;
    private double bLenght;
    private double cLenght;


    public Triangle(double aLenght, double bLenght, double cLenght) {
        this.aLenght = aLenght;
        this.bLenght = bLenght;
        this.cLenght = cLenght;
    }


    public void setaLenght(double aLenght) {
        this.aLenght = aLenght;
    }

    public void setbLenght(double bLenght) {
        this.bLenght = bLenght;
    }

    public void setcLenght(double cLenght) {
        this.cLenght = cLenght;
    }

    public double getcLenght() {

        return cLenght;
    }

    public double getaLenght() {
        return this.aLenght;
    }

    public double getbLenght() {
        return this.bLenght;
    }


    public double getSquare( ) {
        double semiperimeter = this.getPerimentr()/2;
        double Space = Math.sqrt(semiperimeter*(semiperimeter-this.aLenght)*(semiperimeter-this.bLenght)*(semiperimeter-this.cLenght));
        return Space;
    }

    public double getPerimentr ( )
    {
        double perimetr = this.aLenght+this.bLenght+this.cLenght;

        return perimetr;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "aLenght=" + aLenght +
                ", bLenght=" + bLenght +
                ", cLenght=" + cLenght +
                '}';
    }


//
//    public static double getSquare(double aLenght, double bLenght, double cLenght) {
//        double perimetr = getPerimentr(aLenght,bLenght,cLenght);
//        double Space = Math.sqrt(perimetr*(perimetr-aLenght)*(perimetr-bLenght)*(perimetr-cLenght));
//        return Space;
//    }
//
//    public static double getSquare(Triangle triangle) {
//        return  getSquare(triangle.aLenght,triangle.bLenght,triangle.cLenght);
//    }
//
//   public static double getPerimentr (double aLenght, double bLenght, double cLenght)
//   {
//       double perimetr = aLenght+bLenght+cLenght;
//       return perimetr;
//   }
//
//
//    public static double getPerimentr (Triangle triangle)
//    {
//        double perimetr = triangle.aLenght+triangle.bLenght+triangle.cLenght;
//        return perimetr;
//    }

}
