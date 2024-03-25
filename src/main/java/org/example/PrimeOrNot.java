package org.example;
//24 | Java Program To Check Given Number is Prime or Not | Java For Loop


public class PrimeOrNot {
    public static void main(String[] args) {

        int num = 6;
        int count = 0;

        for (int i = 1; i <=num; i++) {
            if (num % i == 0 ) {
         count++;
                }
            }
        if (count ==2) {
            System.out.println("Prime");
        }else{
            System.out.println("not prime");

        }

        }

}
