package com.company;

public class Main {
//Создать возвращаемый метод который будет принимать 2 входящих параметра - возраст человека и температуру на улице, и возвращать результат в виде строки.
//Алгоритм метода должен работать следующим образом:
//если возраст человека от 20 до 45 лет и температура на улице от -20 до 30 градусов, то возвращаемый результат - “Можно идти гулять”;
//если же человеку меньше 20 лет и температура на улице в диапазоне от 0 до 28 градусов, то результат снова -  “Можно идти гулять”;
//а если человеку больше 45 лет, то результат “Можно идти гулять” формируется только тогда когда на улице температура в диапазоне от -10 до 25 градусов;
//В остальных случаях метод должен возвращать результат - “Оставайтесь дома”;
//В методе main вызвать написанный метод 5 раз с различными входными данными (аргументами) и распечатать результат в консоль.
//ДЗ на сообразительность:
//Написать метод в котором генерируется случайный возраст public static int generateRandomAge(){........}
//При вызове метода, который формирует результат “можно ли идти гулять” использовать генерирование случайного возраста с помощью метода “generateRandomAge” test(23, 10); test(generateRandomAge(), 23);
    public static int concat(int temperatureOnTheStreet, int age) {

        if (temperatureOnTheStreet && age) {
            System.out.println("Можно идти гулять");
        }

        if (temperatureOnTheStreet && age) {
            System.out.println("Можно идти гулять");
        }

        if (temperatureOnTheStreet && age) {
            System.out.println("Можно идти гулять");
        }

        if (temperatureOnTheStreet && age) {
            System.out.println("Go to cinema");
        }

        if (temperature > 0 && (temperature < 10 || numberOfStudents < 10)) {
            // true && (false || false) => 1 * (0 + 0) => 1 * 0 = 0 (FALSE)
            System.out.println("Go to work");
        }
        //Hi sensei

        if (!isSnowy) { // ! - оператор отрицания НЕ (NOT)
            System.out.println("Go swimming");
        }


    }
}
