package ua.javabegin.training.fastjava2;

import ua.javabegin.training.fastjava2.objects.Phone;

public class Main {

    public static void main(String[] args) {
        Phone phone1 = new Phone(1024, "Samsung", "GSM");

        System.out.println("phone.getType() - "  + phone1.getType());
        System.out.println("phone.getName() - "  + phone1.getName());
        phone1.setName("iPnone");
    }

}
