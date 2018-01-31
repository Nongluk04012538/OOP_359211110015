package ooplab7;

import java.util.Scanner;

public class mySuperCar {
    public static void main(String[] args) {
        SuperCar car1 = new SuperCar();
        car1.setCarBrand("Masda");
        car1.setCarColor("Black");
        car1.setCarEngineSize("1000 CM");
        car1.setMaxSpeed("120");
        car1.setCountryOfOrigin("Thai");

        System.out.println(car1.getCarBrand());
        System.out.println(car1.getCarColor());

        System.out.println(car1.toString());


        //user assign data to object
        SuperCar car3 = new SuperCar();
        car3 = inputData(car3);
        System.out.println(car3.toString());

    }

    private static SuperCar inputData(SuperCar car) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a student info: ");
        System.out.print("carBrand: ");
        car.setCarBrand(scanner.nextLine());

        System.out.print("carColor: ");
        car.setCarColor(scanner.nextLine());

        System.out.print("carEngineSize: ");
        car.setCarEngineSize(scanner.nextLine());

        System.out.print("maxSpeed: ");
        car.setMaxSpeed(scanner.nextLine());

        System.out.print("countryOfOrigin: ");
        car.setCountryOfOrigin(scanner.nextLine());
        return car;



    }
}//class
