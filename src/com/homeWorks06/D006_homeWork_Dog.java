package com.homeWorks06;

public class D006_homeWork_Dog extends D006_homeWork_Animal {

    protected final int maxRunDistanceDog = 500;
    protected final int maxSwimDistanceDog = 10;
    static int counterDog = 0;

    public D006_homeWork_Dog(String nameOfAnimal) {
        super(nameOfAnimal);
        this.nameOfAnimal = nameOfAnimal;
        if (!nameOfAnimal.isEmpty()) {
            counterDog+=1;
        }
    }

    public void run(int runDistance) {
        if (runDistance > maxRunDistanceDog) {
            System.out.println("Dog cannot run so far...");
        } else {
            System.out.println(nameOfAnimal + " ran " + runDistance + "m.");
        }
    }

    public void swim(int swimDistance) {
        if(swimDistance > maxSwimDistanceDog) {
            System.out.println("Dog cannot swim so far.");
        } else {
            System.out.println(nameOfAnimal + " swam " + swimDistance + "m.");
        }
    }

    public void printCountOfDogs() {
        System.out.println("Created " + counterDog + " dogs.");
    }

}
