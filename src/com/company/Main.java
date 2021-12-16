package com.company;

public class Main {

    public static void main(String[] args) {
//        char value = 'A';
//        switch (value) {
//            case 'A':
//                System.out.println("Value was A");
//                break;
//            case 'B':
//                System.out.println("Value was A");
//                break;
//            case 'C':
//                System.out.println("Value was A");
//                break;
//            case 'D':
//                System.out.println("Value was A");
//                break;
//            case 'E':
//                System.out.println("Value was A");
//                break;
//            default:
//                System.out.println("Not found");
//                break;
//        }
        printDayOfTheWeek(-1);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);
        printDayOfTheWeek(40303);

    }

    private static void printDayOfTheWeek(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("invalid day");
                break;
        }
    }
}
