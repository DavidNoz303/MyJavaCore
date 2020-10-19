package com.homeWorks07;

public class MainClass {
    public static void main(String[] args) {

        //Example of food that cat is not touching !!!
        Cat cat = new Cat("Barsik", 15);
        Plate plate = new Plate(10);
        plate.info();
        cat.eat(plate);
        plate.info();
        System.out.println();

        //Ex5+6 in the homework:
        Cat[] cats = new Cat[5];
        Plate plateForCats = new Plate(150);

        cats[0] = new Cat("Miukolo", 102);
        cats[1] = new Cat("Nuni", 12);
        cats[2] = new Cat("Markiz", 24);
        cats[3] = new Cat("Murz", 125);
        cats[4] = new Cat("Rizhik", 250);

        cats[0].eat(plateForCats);
        cats[1].eat(plateForCats);
        cats[2].eat(plateForCats);
        cats[3].eat(plateForCats);
        cats[4].eat(plateForCats);

        cats[0].catInfo();
        cats[1].catInfo();
        cats[2].catInfo();
        cats[3].catInfo();
        cats[4].catInfo();
        System.out.println();
    /*----------------------------------------------------------------*/
        cats[0] = new Cat("Miukolo", 102);
        cats[1] = new Cat("Nuni", 12);
        cats[2] = new Cat("Markiz", 24);
        cats[3] = new Cat("Murz", 125);
        cats[4] = new Cat("Rizhik", 250);

        plateForCats.addFood(1000);
        cats[0].eat(plateForCats);
        cats[1].eat(plateForCats);
        cats[2].eat(plateForCats);
        cats[3].eat(plateForCats);
        cats[4].eat(plateForCats);

        cats[0].catInfo();
        cats[1].catInfo();
        cats[2].catInfo();
        cats[3].catInfo();
        cats[4].catInfo();




    }
}
