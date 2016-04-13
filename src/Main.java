import OOP.Car;
import OOP.CarShop;

import java.awt.Color;

public class Main {

    public static void main(String[] args) {


        CarShop carShop = new CarShop(3);
        String name = "Subaru Sport v";
       double year = 1985;
        for (int i = 0; i < 3; i++) {
            com.sun.prism.paint.Color color = new com.sun.prism.paint.Color(i,i,i,0);

             carShop.add(new Car(name+i,new Color(i,i,i).toString() ,year+i ));

        }

        carShop.add(new Car(name+19,new Color(1,1,1).toString() ,year+1 ));

        carShop.printAllCars();
//Car[] cars =  new Car[10];
//
//        String name = "Subaru Sport v";
//        double year = 1985;
//
//
//
//        for (int i = 0; i < cars.length; i++) {
//
//            com.sun.prism.paint.Color color = new com.sun.prism.paint.Color(i,i,i,0);
//
//             cars[i] = new Car(name+i,new Color(i,i,i).toString() ,year+i );
//            System.out.println(cars[i]);
//        }

        //System.out.println("\n");
       // System.out.println(Arrays.toString(cars));


    }

}
