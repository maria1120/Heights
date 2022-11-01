package com.maria.calculateheight;

public class App {
    public static void main(String[] args) {


            Heights person1 = new Heights(5, 8);
            Heights person2 = new Heights (6, 7);
            Heights height = new Heights();

            height.sumHeight(person1, person2);
            System.out.println("Sum : "+height.getFeet()+" feets "+ height.getInches()+" inches");



    }
}
