package com.homeWorks06;

public class D006_homeWork_Main {

    public static void main(String[] args) {
        D006_homeWork_Dog dog = new D006_homeWork_Dog("Bull");
        D006_homeWork_Cat cat = new D006_homeWork_Cat("Mitzi");
        D006_homeWork_Cat cat1 = new D006_homeWork_Cat("Kuka");
        D006_homeWork_Cat cat2 = new D006_homeWork_Cat("Lolui");
        D006_homeWork_Dog dog1 = new D006_homeWork_Dog("Luli");

        dog.run(200);
        cat.run(300);
        cat.swim(300);

        cat.printCountOfCats();
        dog.printCountOfDogs();
        cat.printCountOfAnimals();

    }
}
