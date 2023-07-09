public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2023;
        checkIfLeapYear(year);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2010;
        suggestAppVersion(clientOS, clientDeviceYear);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 69;
        int daysToDeliver = getDaysToDeliver(deliveryDistance);
        printDaysToDeliver(daysToDeliver);
    }

    public static void checkIfLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным");
        }
    }

    public static void suggestAppVersion(int clientOS, int clientDeviceYear) {
        int deviceYearCutOff = 2015;
        if (clientOS == 0) {
            if (deviceYearCutOff > clientDeviceYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else
                System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            if (deviceYearCutOff > clientDeviceYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else
                System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int getDaysToDeliver(int deliveryDistance) {
        int days20Km = 1;
        if (deliveryDistance <= 20 && deliveryDistance > 0) {
            return days20Km;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return (days20Km + 1);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return (days20Km + 2);
        } else if (deliveryDistance > 100) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void printDaysToDeliver(int daysToDeliver) {
        if (daysToDeliver == -1) {
            System.out.println("Некорректно введена дистанция");
        } else if (daysToDeliver == 0) {
            System.out.println("Доставка не производится");
        }else if (daysToDeliver == 1) {
            System.out.println("Доставка займет " + daysToDeliver + " день");
        } else {
            System.out.println("Доставка займет " + daysToDeliver + " дня");
        }
    }
}