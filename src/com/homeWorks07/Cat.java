package com.homeWorks07;

public class Cat {

    private String name;
    private int appetite;
    private boolean bellyFull;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.bellyFull = false;
    }

    public void eat(Plate p) {
        if (p.getFood() > appetite) {
            p.decreaseFood(appetite);
            bellyFull = true;
        }
    }

    public void catInfo() {
        System.out.println("Cat: " + name + ", appetite: " + appetite + ", is not hungry: " + bellyFull+".");
    }

}
