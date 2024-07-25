package com.jmjenterprises.calculator;

public class Calculator {

    public int add(int firstNum, int secondNum ){
            int sum = firstNum + secondNum;
            return sum;
    }

    public int subTrack(int firstNum, int secondNum){
        if (firstNum < secondNum){
            int temp = 0;
            temp = secondNum;
            secondNum = firstNum;
            firstNum = temp;
            int sum =  firstNum - secondNum;
            return sum;

        } else{
            int sum = firstNum - secondNum;
            return sum;
        }
    }
}
