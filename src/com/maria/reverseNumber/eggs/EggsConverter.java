package com.maria.reverseNumber.eggs;

public class EggsConverter {

    private int eggsInput;





    public void setEggsInput(int eggsInput) {
        this.eggsInput = eggsInput;
    }

    public int getEggsGross() {
        int eggsGross = eggsInput / 144;
        return eggsGross;
    }



    public int getEggsDozen() {
        int eggsDozen = eggsInput / 12;
        return eggsDozen;
    }



    public int getEggsLeft() {
        return eggsInput % 144 + eggsInput % 12 ;

    }




}
