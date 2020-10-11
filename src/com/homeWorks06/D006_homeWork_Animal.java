package com.homeWorks06;

public class D006_homeWork_Animal {

    protected String nameOfAnimal;
    static int countAnimal = 0;

    public D006_homeWork_Animal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
        if (!nameOfAnimal.isEmpty()) {
            countAnimal+=1;
        }
    }

    public void run (int runDistance) {
        System.out.println(nameOfAnimal + " ran " + runDistance+"m.");
    }

    public void swim (int swimDistance) {
        System.out.println(nameOfAnimal + " swam " + swimDistance+"m.");
    }

    public void printCountOfAnimals() {
        System.out.println("Created " + countAnimal + " animals.");
    }
}
