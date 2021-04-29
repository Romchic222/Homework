package Homework;

public class Homework01 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }



        public static void printThreeWords () {
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }


        public static void checkSumSign() {
                int a = -63;
                int b = 54;
                if (a + b >= 0) {
                    System.out.println("Сумма_положительная");
                }
                if (a + b < 0) {
                    System.out.println("Сумма_отрицательная");
                }
        }

            public static void printColor () {
            int value = 114;
            boolean less = value<= 100;
            boolean more = value > 0;

            if (value <= 0) {
            System.out.println("Красный");
            }

            else if (less && more) {
            System.out.println("Желтый");
            }

            if (value >100) {
                System.out.println("Зеленый");
            }
            }

            public static void compareNumbers () {
        int a = 99;
        int b = 48;
        if (a >= b) {
            System.out.println("a >= b");
            if (a < b) {
                System.out.println("a < b");
            }
        }
        }
        }



