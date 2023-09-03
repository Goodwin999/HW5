public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите приложение для IOS ");
        } else if (clientOS == 1) {
            System.out.println("Установите приложение для Android ");
        }


        int clientIos = 0;
        int clientDeviceYear = 2015;
        if (clientIos == 0) {
            System.out.println("Установите приложение для IOS");
        } else if (clientIos == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке ");
        } else if (clientDeviceYear > 2015) {
            System.out.println("Установите приложение для IOS ");
        } else if (clientIos == 1) {
            System.out.println("Установите приложение для Android ");
        } else if (clientIos == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке» ");
        } else if (clientDeviceYear > 2015) {
            System.out.println("Установите приложение для Android ");
        } else {
            System.out.println("Купите телефон ");
        }


        int year = 2021;
        boolean leapYear = (year > 1584 && ((year % 400 == 0) ||
                (year % 4 == 0 && year % 100 != 0)));
        if (leapYear) {
            System.out.println("Год " + year + " високосный");
        } else {
            System.out.println("Год " + year + " не високосный");
        }


        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется одни сутки ");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется двое суток");
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется трое суток");
        } else {
            System.out.println("Доставки нет");
        }


        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
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
