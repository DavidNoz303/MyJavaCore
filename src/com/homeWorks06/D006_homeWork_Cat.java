package com.homeWorks06;

public class D006_homeWork_Cat extends D006_homeWork_Animal{

    protected final int maxRunDistanceCat = 200;
    static int counterCat = 0;

    public D006_homeWork_Cat(String nameOfAnimal) {
        super(nameOfAnimal);
        this.nameOfAnimal = nameOfAnimal;
        if (!nameOfAnimal.isEmpty()) {
            counterCat+=1;
        }
    }

    public void run(int runDistance) {
        if (runDistance > maxRunDistanceCat) {
            System.out.println("Cat cannot run so far...");
        } else {
            System.out.println(nameOfAnimal + " ran " + runDistance + "m.");
        }
    }

    public void swim(int swimDistance) {
        System.out.println("Cats cannot swim :)");
    }

    public void printCountOfCats() {
        System.out.println("Created " + counterCat + " cats.");
    }
}
