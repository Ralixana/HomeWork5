public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");

        int clientOS = 1;
        int Android = 1;
        int iOS = 0;
        if (clientOS == iOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == Android) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Task 2");

        int year = 2013;
        int clientDeviceYear = 2015;

        if (clientOS == Android && year < clientDeviceYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == Android && year >= clientDeviceYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == iOS && year < clientDeviceYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == iOS && year >= clientDeviceYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        System.out.println("Task 3");

        // это задание списала у ребят, не понимаю почему решается именно так,
        // не понимаю решение с помощью процента, долго сидела над ним

        int Year = 2011;

        if (Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0) {
            System.out.println(Year + " - год является високосным");
        } else {
            System.out.println(Year + " - год не является високосным");
        }

        System.out.println("Task 4");

        int deliveryDistance = 100;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }

        System.out.println("Task 5");

        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}