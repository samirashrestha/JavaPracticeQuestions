package org.example;

import com.sun.jdi.PathSearchingVirtualMachine;
//03 | Java Program to Check Divisibility Of the Number | Java If Statements

public class DivisiblityOfANumber {
    public static void main(String[] args) {
//        input
        int givenNumber= 11;

        int numberToDivideWith = 5;

//        logic
        if(givenNumber%5==0){
//            output
            System.out.println("number is divisible by 5");
//            logic
        }else{
//            output
            System.out.println("number is not divisible by 5");
        }

    }
}
