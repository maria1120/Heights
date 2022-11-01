package com.maria.reverseNumber;

public class ReverseNumber {

    int number;
    int result = 0;


    public int getResult() {

        return  reverseNumber();
    }

    public void setNumber(int number) {
        this.number = number;
    }


    private int reverseNumber(){
        // run loop until number becomes 0
        while(number != 0) {             /// number = 123

            // get last digit from number
            int digit = number % 10;    // digit = 3
            result = result * 10 + digit; // result = 0 * 10 + 3 = 3

            // remove the last digit from number
            number /= 10; // 123 / 10 = 12.3
        }
        return result;
    }



}
