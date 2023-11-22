package com.epam.mjc.stage0;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;
    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
    public String getDescription() {
        String ans = hasFur ? "a" : "no";
        String valuePaw = (numberOfPaws == 1) ? " paw" : " paws";
        return "This animal is mostly " + color + ". It has " + numberOfPaws + valuePaw + " and " + ans + " fur.";
    }
}

//class GFG {
//
//    public static void main(String[] args){
//        Animal appClass = new Animal("red", 3, true);
//        appClass.getDescription();
//
//    }
//}
