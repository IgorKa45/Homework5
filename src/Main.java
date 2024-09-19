public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        // 1 = iOS; 0 = android
        byte clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Ошибка. Неизвестная операционная система.");
        }

        System.out.println("Задание 2");

        // для Операционных систем использую переменные из предыдущего задания
        short clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке.");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке.");
        } else {
            System.out.println("Ошибка. Неизвестная операционная система.");
        }

        System.out.println("Задание 3");
        //Исследуемый год
        short year = 2012;

        if (year % 4 == 0 && year > 1584) {
            System.out.println("Данный год является високосным.");
        } else if (year % 400 == 0 && year > 1584) {
            System.out.println("Данный год является високосным.");
        } else if (year % 100 == 0 && year > 1584) {
            System.out.println("Данный год не является високосным.");
        } else if (year > 1584) {
            System.out.println("Данный год не является високосным.");
        } else {
            System.out.println("Этот год не может считаться високосным так как это понятие ввели в 1584 году.");
        }

        System.out.println("Задание 4");

        //Расстояние до клиента в километрах
        byte deliveryDistance = 120;

        // Время доставки в сутках
        var deliveryTime = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + deliveryTime);
        } else if (deliveryDistance >= 21 && deliveryDistance <= 60) {
            deliveryTime = deliveryTime + 1;
            System.out.println("Потребуется дней " + deliveryTime);
        } else if (deliveryDistance >= 61 && deliveryDistance <= 100) {
            deliveryTime = deliveryTime + 1 + 1;
            System.out.println("Потребуется дней " + deliveryTime);
        } else {
            System.out.println("Доставка на такое расстояние не предусмотрена.");
        }

        System.out.println("Задание 5");
        // Введённый месяц
        byte monthNumber = 9;
        // 1 - январь
        // 2 - февраль
        // 3 - март
        // 4 - апрель
        // 5 - май
        // 6 - июнь
        // 7 - июль
        // 8 - август
        // 9 - сентябрь
        // 10 - октябрь
        // 11 - ноябрь
        // 12 - декабрь
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Время года - зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Время года - весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Время года - лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Время года - осень.");
                break;
            default:
                System.out.println("Введён несуществующий месяц.");
        }
    }
}