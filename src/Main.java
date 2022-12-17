import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void determineWhichYearIsALeapYear (int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void task1 () {
        System.out.println("Задание 1");
        determineWhichYearIsALeapYear(2020);
    }

    public static void whichVersionOfTheApplicationToInstall (int clientDeviceYear, int clientOS) {
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

    public static void task2 () {
        System.out.println("Задание 2");
        whichVersionOfTheApplicationToInstall(2020, 0);
    }

    public static void countTheNumberOfDeliveryDays (int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (deliveryDays + 1));
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (deliveryDays + 2));
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void task3 () {
        System.out.println("Задание 3");
        countTheNumberOfDeliveryDays(21);
    }
}