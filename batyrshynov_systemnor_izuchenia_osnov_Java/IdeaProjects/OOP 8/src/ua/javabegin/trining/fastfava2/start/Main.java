package ua.javabegin.trining.fastfava2.start;

import ua.javabegin.trining.fastfava2.objects.Car;
import ua.javabegin.trining.fastfava2.objects.House;

public class Main {

    public static void main(String[] args) {
	    House house1 = new House();
        House house2 = new House();
        Car car = new Car();
        car.setName("Toyota");
        System.out.println("car.getName() - " + car.getName());
    }
}
