import java.lang.invoke.SwitchPoint;
import java.time.LocalDate;

public class Main {

    public static int generateRandomYear(int minYear, int maxYear) {
        java.util.Random random = new java.util.Random();
                                                        //метод генерации чисел
        return random.nextInt(maxYear - minYear) + minYear;
    }

    public static boolean checkYear(int year) {
        if ((year % 400) == 0) {                        //метод проверки года на високосность
            return true;
        } else if ((year % 100) == 0) {
            return false;
        } else return (year % 4) == 0;
    }

    public static boolean checkOldVersion(int year, int oldVersion) {
        return (year <= oldVersion);                    //метод проверки года телефона
    }

    public static void printForOS(int os, boolean year) {
        if (year) {
            switch (os) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            switch (os) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");/////////////////
            }
        }
    }



    public static void main(String[] args) {
        task1();
        task2();

    }

    public static void task1() {
        System.out.println("\n\n" +
                "=============================\n" +
                "========= Задание 1 =========\n" +
                "=============================\n");


        int minYear = 1000;
        int maxYear = 2000;
        int year = generateRandomYear(minYear, maxYear);

        if (checkYear(year)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }


    public static void task2() {
        System.out.println("\n\n" +
                "=============================\n" +
                "========= Задание 2 =========\n" +
                "=============================\n");

        int oldVersion = 2015;
        int currentYear = LocalDate.now().getYear();
        int typeOS = generateRandomYear(0, 1);   // Здесь всегда 0, и я знаю в чем ошибка, но не могу исправить

        boolean version = checkOldVersion(currentYear, oldVersion);
        printForOS(typeOS, version);



    }
}