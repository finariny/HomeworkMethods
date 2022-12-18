import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    //Задание 1
    public static void determineWhichYearIsALeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void task1() {
        System.out.println("Задание 1");
        determineWhichYearIsALeapYear(2020);
    }

    //Задание 2
    public static void whichVersionOfTheApplicationToInstall(int clientDeviceYear, int clientOS) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear < currentYear) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void task2() {
        System.out.println("Задание 2");
        whichVersionOfTheApplicationToInstall(2020, 0);
    }

    //Задание 3
    public static int countTheNumberOfDeliveryDays(int deliveryDistance) {
        int deliveryDays = 0;
        if (deliveryDistance <= 20) {
            return deliveryDays += 1;
        } else if (deliveryDistance <= 60) {
            return deliveryDays += 2;
        } else if (deliveryDistance <= 100) {
            return deliveryDays += 3;
        } else {
            return deliveryDays;
        }
    }

    //Способ 1
    public static void printDeliveryDaysFirstWay(int days) {
        System.out.println("Потребуется дней: " + days);
    }

    //Способ 2
    public static void printDeliveryDaysSecondWay(int deliveryDistance) {
        int days = countTheNumberOfDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней: " + days);
    }

    public static void task3() {
        System.out.println("Задание 3");

        System.out.println("Способ 1");
        int days = countTheNumberOfDeliveryDays(91);
        printDeliveryDaysFirstWay(days);

        System.out.println("Способ 2");
        printDeliveryDaysSecondWay(91);
    }
}