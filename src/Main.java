import OOP.Car;
import OOP.CarShop;
import Syntax2.Variant_B.Task6;

import java.awt.Color;

public class Main {

    public static void main(String[] args) {

//  = = = = = = = = = =  = TEST OOP: CAR AND CAR SHOP = = = =  = = = = = =  = =  = = =
//        CarShop carShop = new CarShop(3);
//        String name = "Subaru Sport v";
//       double year = 1985;
//        for (int i = 0; i < 3; i++) {
//            com.sun.prism.paint.Color color = new com.sun.prism.paint.Color(i,i,i,0);
//
//             carShop.add(new Car(name+i,new Color(i,i,i).toString() ,year+i ));
//
//        }
//
//        System.out.println("Список авто после добавления в цикле");
//        carShop.printAllCars();
//        System.out.println("\nСписок авто после динамического добавление 1-го авто");
//        carShop.add(new Car(name+19,new Color(1,1,1).toString() ,year+1 ));
//        carShop.printAllCars();
//        System.out.println("\nСписок авто после удаления кара с идексом 0");
//        carShop.remove(0);
//        carShop.printAllCars();
//
//
//        System.out.println("=======================");
//        System.out.println("Сравнение авто " +carShop.getCarForID(1) + " и " + carShop.getCarForID(2) +
//                "\nпо году выпуска: " + Car.compareYear(carShop.getCarForID(1),carShop.getCarForID(2)));
//
//        System.out.println(carShop.getCarForID(0).compareYearTo( new Car(name+19,new Color(1,1,1).toString() ,year+1 )));


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
// = = = = =  = == = END TEST OOP = = = = = = = =  ==  =


        Task6 task6 = new Task6();

        int [] aray = {1,2,3,4};

        int [] [] result = task6.AllPermutation(aray);


        for (int i = 0; i < result[0].length ; i++) {
            for (int j = 0; j < result[1].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println(" ");
        }

    }

}
