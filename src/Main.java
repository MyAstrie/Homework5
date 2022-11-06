import java.util.Scanner;

public class Main {
    public static void task1(){
        System.out.println("Выберете вашу опреационную систему: \n" +
                "0 - iOS\n" + "1 - Android\n");
        Scanner in = new Scanner(System.in);
        int clientOS = in.nextInt();

        if(clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2(){
        System.out.println("Выберете вашу опреационную систему: \n" +
                "0 - iOS\n" + "1 - Android\n");
        Scanner in = new Scanner(System.in);
        int clientOS = in.nextInt();

        System.out.println("Введите год производста телефона");
        int clientDeviceYear = in.nextInt();

        if(clientDeviceYear >= 2015) {
            if(clientOS == 0){
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        else{
            if(clientOS == 0){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3(){
        System.out.println("Введите год: ");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Введите дистаницю: ");
        Scanner in = new Scanner(System.in);
        int deliveryDistance = in.nextInt();

        if((deliveryDistance - 20) % 40.0 == 0) {
            System.out.println(" Потребуется дней: " + (int)Math.ceil(((deliveryDistance - 20) / 40.0) + 2));
        }
        else {
            System.out.println(" Потребуется дней: " + (int)Math.ceil(((deliveryDistance - 20) / 40.0) + 1));
        }
    }

    public static void task5() {
        System.out.println("Введите месяц: ");
        Scanner in = new Scanner(System.in);
        int monthNumber = in.nextInt();

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

    public static void main(String[] args) {
        task4();
    }
}