public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите приложение для IOS ");
        } else if (clientOS == 0) {
            System.out.println("Установите приложение для Android ");
        }


        int clientIos = 0;
        int clientAndroid = 1;
        int clientDeviceYear = 2015;
        if (clientIos == 0) {
            System.out.println("Установите приложение для IOS");
        } else if (clientIos == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке ");
        } else if (clientDeviceYear > 2015) {
            System.out.println("Установите приложение для IOS ");
        } else if (clientAndroid == 1) {
            System.out.println("Установите приложение для Android ");
        } else if (clientAndroid == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке» ");
        } else if (clientDeviceYear > 2015) {
            System.out.println("Установите приложение для Android ");
        } else {
            System.out.println("Купите телефон ");
        }


        int year = 2021;
        switch (year) {
            case 2012:
            case 2016:
            case 2020:
            case 2024:
                System.out.println("Год  является високосным ");
                break;
            case 2021:
            case 2022:
            case 2023:
                System.out.println("Год не является високосным ");
                break;
            default:
                System.out.println("Такого года не существеует ");
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
