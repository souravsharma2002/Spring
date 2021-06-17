package com.sanchit.autowired;

/**
 * @author: Sanchit Raina
 */
public class Heart {
    private String nameOfAnimal;
    private int noOfHearts;

    public String getNameOfAnimal() {
        return this.nameOfAnimal;
    }

    public void setNameOfAnimal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }

    public int getNoOfHearts() {
        return this.noOfHearts;
    }

    public void setNoOfHearts(int noOfHearts) {
        this.noOfHearts = noOfHearts;
    }

    public void pump() {
        System.out.println("Your heart is pumping");
        System.out.println("Alive!");
    }
}
