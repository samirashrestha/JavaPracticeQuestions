package org.example;

//17 | Java Program To Print Sum Of 1 to 10 | Java For Loop
//18 | Java Program To Print Sum Of Even Numbers From 1 to 10 | Java For Loop
//19 | Java Program To Print Result Of 1+2-3+4+5-6+7+8-9 | Java For Loop


public class sum1to10 {
    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 1; i<=10; i++){
//            sum+=i;
//        }
//        System.out.println(sum);

//        int sum = 0;
//        for (int i = 1; i<=10; i++){
//          if(i % 2 == 0){
//              sum+=i;
//          }
//        }
//            System.out.println(sum);


        int sum = 0;
        for (int i = 1; i<=10; i++){
            if (i % 3 == 0){
                sum -=i;
            }
            else {
                sum +=i;
            }
        }
        System.out.println(sum);

    }
}
