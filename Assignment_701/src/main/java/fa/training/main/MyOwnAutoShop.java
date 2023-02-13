package fa.training.main;

import fa.training.entities.Ford;
import fa.training.entities.Sedan;
import fa.training.entities.Truck;

public class MyOwnAutoShop {

    public static void main(String[] args) {
        Sedan sedan1 = new Sedan(100, 1000, "red", 10);
        Sedan sedan2 = new Sedan(150, 3000, "blue", 20);
        Sedan sedan3 = new Sedan(200, 5000, "black", 30);
        Sedan sedan4 = new Sedan(300, 7000, "pink", 40);

        Ford ford1 = new Ford(100, 1000, "red", 2010, 50);
        Ford ford2 = new Ford(200, 1000, "pink", 2020, 100);

        Truck truck1 = new Truck(100, 1000, "red", 1500);
        Truck truck2 = new Truck(100, 3000, "blue", 3000);

        double priceArray[] = {sedan1.getSalePrice(), sedan2.getSalePrice(), sedan3.getSalePrice(), sedan4.getSalePrice(),
                ford1.getSalePrice(), ford2.getSalePrice(), truck1.getSalePrice(), truck2.getSalePrice()};

        for (double price : priceArray) {
            System.out.println("Price: "+price+"$");
        }
    }
}
