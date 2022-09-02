public class Main {
    public static void main(String[] args) {
// Задание1
        System.out.println("Задача 1");

        int age = 18;
        if (age >= 18) ;
        {
            System.out.println("Можно поздравить с совершеннолетием!");
        }

        int age1 = 17;
        if (age1 <= 18) ;
        {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать!");
        }

        //Задание2
        System.out.println("Задача 2");

        int age2 = 7;
        if (age2 >= 7) {
            System.out.println("Ребенок ходит в школу, если его возраст равен или больше 7 лет");
        }
        if (age2 >= 18 && age2 < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет если его возраст 18 и больше лет");
        }
        if (age2 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу, если ему больше 24 лет");
        }

        //Задание 3
        System.out.println("Задача 3");

        int passenger = 107;
        int totalPassengers = 102;
        if (passenger > 102) {
            System.out.println("Если пассажиров больше 102, то мест нет, ты не едешь");
        }
        if (passenger <= 60) {
            System.out.println("Если пассажиров в вагоне меньше 60, то едешь сидя!");
        }
        if (passenger > 60 && totalPassengers <= 102) {
            System.out.println("Если пассажиров больше 60, то едешь стоя!");
        }

        // Задание 1.2
        System.out.println("Задание 2.1");

        int age3 = 15;
        if (age3 >= 18) {
            System.out.println("Можно поздравить с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, надо немного подождать!");
        }

        //Задание 2.2
        System.out.println("Задача 2.2");

        int age4 = 25;

        if (age4 >= 7 && age4 < 18) {
            System.out.println("Ребенок учится в школе");
        } else if (age > 18 && age4 < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else {
            System.out.println("Человек окончил университет и ему пора искать работу");
        }

        //Задание 2.3
        System.out.println("Задача 2.3");
        int capacity = 102;
        int seats = 60;
        int standingPlaces = (capacity - seats);

        int seatUsed = 37;
        int standingPlacesUsed = 25;
        if (seatUsed < seats ) {
            System.out.println("Есть еще" + (seats - seatUsed) + "Сидячих мест");
        }else{
            System.out.println("Сидячих мест нет");
        }
        if (standingPlacesUsed < standingPlaces ) {
            System.out.println("Есть ещё" + (standingPlaces - seatUsed) + "Стоячих мест");
        }else {
            System.out.println("Стоячих мест нет");}


    }
}