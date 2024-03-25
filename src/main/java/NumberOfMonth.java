import java.util.Scanner;

//07 | Java Program To Print Number Of Days In a Given Month | Java Ladder If Else

public class NumberOfMonth {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Month Number: ");
//
//        int month = scanner.nextInt();
//
//        if (month == 1) {
//            System.out.println("Hello January. The number of days is 31");
//        }else if (month == 2) {
//            System.out.println("Hello February. The number of days is 29");
//        }else if (month == 3) {
//            System.out.println("Hello March. The number of days is 31");
//        }else if (month == 4) {
//            System.out.println("Hello April. The number of days is 30");
//        }else if (month == 5) {
//            System.out.println("Hello May. The number of days is 31");
//        }else if (month == 6) {
//            System.out.println("Hello June. The number of days is 30");
//        }else if (month == 7) {
//            System.out.println("Hello July. The number of days is 31");
//        }else if (month == 8) {
//            System.out.println("Hello August. The number of days is 31");
//        }else if (month == 9) {
//            System.out.println("Hello September. The number of days is 30");
//        }else if (month == 10) {
//            System.out.println("Hello October. The number of days is 31");
//        }else if (month == 11) {
//            System.out.println("Hello November. The number of days is 30");
//        }else if (month == 12) {
//            System.out.println("Hello December. The number of days is 31");
//        }else{
//            System.out.println("Number is not valid");
//
//        }
//    }
//}
//07 | Java Program To Print Number Of Days In a Given Month by using switch statement | Java Ladder If Else


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Month Number");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
                System.out.println("Hello January. The number of days is 31");
                break;

            case 2:
                System.out.println("Hello February. The number of days is 29");
                break;

            case 3:
                System.out.println("Hello March. The number of days is 31");
                break;

            case 4:
                System.out.println("Hello April. The number of days is 30");
                break;

            case 5:
                System.out.println("Hello May. The number of days is 31");
                break;

            case 6:
                System.out.println("Hello June. The number of days is 30");
                break;

            case 7:
                System.out.println("Hello July. The number of days is 31");
                break;

            case 8:
                System.out.println("Hello August. The number of days is 31");
                break;

            case 9:
                System.out.println("Hello September. The number of days is 30");
                break;

            case 10:
                System.out.println("Hello October. The number of days is 31");
                break;

            case 11:
                System.out.println("Hello November. The number of days is 30");
                break;

            case 12:
                System.out.println("Hello December. The number of days is 31");
                break;
            default:
                System.out.println("Enter a valid Number");
                break;


        }
    }
}
