/**
 * Created by user on 13.04.2016.
 */
package OOP;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Calendar;

public class CarShop
{
   private Car[] cars;
    private int index;



    public CarShop(int size) {
        this.cars = new Car[size];
        index = -1;

    }



    public  void add(Car car) {


        if (index+1 < cars.length) {

            this.cars[++index] = car;
        }
        else{
            int newLenght = cars.length+1;
            System.out.println("new lenght " + newLenght);
            Car[] buf = new Car[newLenght];
            buf = Arrays.copyOf(cars,newLenght);
            cars = buf;
            this.add(car);
        }
    }



    public  Car getCarForID (int ID)
    {
        if (ID<cars.length) {
            return cars[ID];
        }
        return null;
    }


    public  void  remove(int ID)
    {
        if (ID<cars.length) {
            cars[ID] = cars[index];
            cars[index] = null;
            index--;
        }

    }

    public  void printAllCars ()
    {
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
