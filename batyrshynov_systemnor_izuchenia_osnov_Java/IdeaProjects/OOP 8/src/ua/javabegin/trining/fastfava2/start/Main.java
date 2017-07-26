package ua.javabegin.trining.fastfava2.start;

import ua.javabegin.trining.fastfava2.objects.Car;
import ua.javabegin.trining.fastfava2.objects.Door;
import ua.javabegin.trining.fastfava2.objects.House;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.setName("Toyota");

        System.out.println("car.getName() - " + car.getName());

        Door door = new Door();
        door.setColor("white");

        System.out.println("door.getColor() - " + door.getColor());
    }
}
