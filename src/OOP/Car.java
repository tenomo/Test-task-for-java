/**
 * Created by user on 13.04.2016.
 */
package OOP;
public class Car
{
    private String name;
    private String Color;
    private double Year;

    public Car(String name, String color, double year) {
        this.name = name;
        Color = color;
        Year = year;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return Color;
    }

    public double getYear() {
        return Year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setYear(double year) {
        Year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", Color='" + Color + '\'' +
                ", Year=" + Year +
                '}';
    }
}
