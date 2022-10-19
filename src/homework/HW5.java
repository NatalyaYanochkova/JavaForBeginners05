package homework;

public class HW5 {
    //
    // 1
    public static String returnDayWeek(int dayWeek) {
        if ((dayWeek > 0) || (dayWeek < 8)) {
            if (dayWeek == 1) {
                return "Monday";
            } else if (dayWeek == 2) {
                return "Tuesday";
            } else if (dayWeek == 3) {
                return "Wednesday";
            } else if (dayWeek == 4) {
                return "Thursday";
            } else if (dayWeek == 5) {
                return "Friday";
            } else if (dayWeek == 6) {
                return "Saturday";
            } else if (dayWeek == 7) {
                return "Sunday";
            }
        }
        return "Error";
    }

    public static String verifyEquals(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static String verifyEquals(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static String verifyEquals(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    static int tcNumber = 1;

    //Вспомогательные методы для печати отчета тестирования
    public static void printTCNumber() {
        System.out.print("TC_" + tcNumber++ + "\t -- \t");
    }

    public static void printTestResult(String value) {
        System.out.print(value);
        System.out.println();
    }
//3 task Написать алгоритм вычисления среднего возраста в семье из 3х человек.
// Протестируйте алгоритм на позитивные и негативные сценарии.

    public static int countAgeAve(int ageM, int ageF, int ageC) {
        if (ageM >= 0 && ageM <= 150
                && ageF >= 0 && ageF <= 150
                && ageC >= 0 && ageC <= 150) {

            int ageAve = (ageM + ageF + ageC) / 3;

            return ageAve;
        }
        return -1;
    }
//5 task Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота.
// Не забудьте, что температура тела ЖИВОГО кота имеет определенные границы.
// Значения, которые не входят в эти границы считаем невалидными и выдаем ошибку.
// Протестируйте метод на позитивные и негативные сценарии.

    public static double catTemp(double t1, double t2, double t3, double t4, double t5) {
        if (t1 < 28 && t1 > 45 &&
                t2 < 28 && t2 > 45 && t3 < 28 && t3 > 45 && t4 < 28 && t4 > 45 && t5 < 28 && t5 > 45) {
            return Double.MIN_VALUE;//-1 also
        }
        double aveTem = (t1 + t2 + t3 + t4 + t5) / 5;
        return aveTem;
    }
    //6 task Написать метод, который принимает на вход количество часов работы в день, стоимость одного часа работы
    // в десятичном числе, и возвращает заработную плату в месяц в целых единицах.
    // Протестируйте метод на позитивные и негативные сценарии.

    public static int payInMonth(int time, double pay) {
        if (time > 0 && time < 25 && pay > 12.5) {
            int payInMonth = (int) (time * pay * 28);
            return payInMonth;
        }
        return -1;
    }

    // task 7 Написать метод, который принимает на вход 2 параметра -  цену и количество товара (количество в штуках).
// Алгоритм возвращает сумму покупки в виде десятичного числа.
// ПРоверьте метод на позитивный и негативный сценарий.
    public static double countSumBuy(double price, int amount) {
        if (price > 0 && amount > 0.) {
            double totalPrice = (price * amount);
            return totalPrice;
        }
        return -1;
    }
//8 Написать метод, который принимает на вход
    // необходимые параметры и возвращает строку
    // ведомости выдачи зарплаты сотрудникам.
    // Например:
    // “Смирнова Мария Ивановна       70000 руб 00 коп”

    public static String returnRow(String fio, double salary) {
        if (!fio.isEmpty() && salary >= 0) {
            int rub = (int) salary;
            int kop = (int) ((salary - rub) * 100);

            String result = fio + "\t\t\t" + rub + " руб ";
            if (kop >= 0 && kop < 10) {

                return result = result + "0" + kop + " коп";
            } else {

                return result = result + kop + " коп";
            }
        }

        return "";
    }


    //TC_9
    //Создать метод, который печатает ведомость для нескольких сотрудников, используя метод из задачи 8, например:
    //
    //Смирнова Мария Ивановна     70000 руб 00 коп
    //Серебряков Иван Петрович        128059 руб 00 коп
    //
    //На этот метод писать тесты не нужно, просто распечатать ведомость.

    public static void printSalaryList(String s1, String s2, String s3) {
        System.out.println();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println();
    }

    //TC_10
    //Записать в виде метода и протестировать:

    public static String checkTheNumber(int x) {
        if (x < 0) {

            return "x is negative";
        } else if (x > 0) {

            return "x is positive";
        }

        return "x is zero";
    }
    public static void main(String[] args) {
        //arrange
        //int number = 1;
        //String expectedResult = "Monday";
        int number = 0;
        String expectedResult = "Error";

        //act
        String actualResult = returnDayWeek(number);
        //assert
        verifyEquals(expectedResult, actualResult);

        //report
        printTCNumber();
        printTestResult(verifyEquals(expectedResult, actualResult));

        //tc#3

        int ageM = 25;
        int ageF = 30;
        int ageC = 5;

        int expectedResult3 = 20;
        int actualResult3 = countAgeAve(ageM, ageF, ageC);

        verifyEquals(expectedResult3, actualResult3);
        printTCNumber();
        printTestResult(verifyEquals(expectedResult3, actualResult3));
//tc#3/1
        //ageM = -20;
        //ageF = 0;
        //ageC = 1000;

        ageM = 150;
        ageF = 0;
        ageC = 100;

        int expectedResult4 = -1;
        int actualResult4 = countAgeAve(ageM, ageF, ageC);

        verifyEquals(expectedResult4, actualResult4);
        printTCNumber();
        printTestResult(verifyEquals(expectedResult4, actualResult4));

        //tc#5
        double t1 = 29;
        double t2 = 31;
        double t3 = 39;
        double t4 = 41;
        double t5 = 37;

        double expectedResult5 = 35.4;
        double actualResult5 = catTemp(t1, t2, t3, t4, t5);

        verifyEquals(expectedResult5, actualResult5);

        printTCNumber();
        //report 5
        printTestResult(verifyEquals(expectedResult5, actualResult5));

//tc6
        int time = 8;
        double pay = 150;
        int expectedResult6 = 33_600;

        int actualResult6 = payInMonth(time, pay);
        verifyEquals(expectedResult6, actualResult6);

        //report 6
        printTCNumber();
        printTestResult(verifyEquals(expectedResult6, actualResult6));

        //tc7
        double price = 10.75;
        int amount = 5;
        double expectedResult7 = 53.75;

        double actualResult7 = countSumBuy(price, amount);
        verifyEquals(expectedResult7, actualResult7);

        //report 7
        printTCNumber();
        printTestResult(verifyEquals(expectedResult7, actualResult7));
//7-
        price = 0;
        amount = -5;
        double expectedResult8 = -1;

       double actualResult8 = countSumBuy(price, amount);
        verifyEquals(expectedResult8, actualResult8);

        //report 7
        printTCNumber();
        printTestResult(verifyEquals(expectedResult8, actualResult8));

        //TC_8_1 Positive


        String foi = "Смирнова Мария Ивановна";
        double salary = 70000.0;
        String expectedResult8_1 = "Смирнова Мария Ивановна\t\t\t70000 руб 00 коп";

        String actualResult8_1 = returnRow(foi, salary);

        printTCNumber();
        verifyEquals(expectedResult8_1, actualResult8_1);

        printTestResult(verifyEquals(expectedResult8_1, actualResult8_1));


        //TC_9

        printSalaryList(
                returnRow("Смирнова Мария Ивановна", 70000.0),
                returnRow("Серебров Иван Петрович", 128059.0),
                returnRow("Алешина Анна Егоровна", 59456.77)
        );


        //TC_10_1 Positive


        int x = 5;
        String expectedResult10_1 = "x is positive";

        String actualResult10_1 = checkTheNumber(x);

        printTCNumber();
        verifyEquals(expectedResult10_1, actualResult10_1);

        printTestResult(verifyEquals(expectedResult10_1, actualResult10_1));


        //TC_10_2 Positive
        x = -5;
        String expectedResult10_2 = "x is negative";

        String actualResult10_2 = checkTheNumber(x);

        verifyEquals(expectedResult10_2, actualResult10_2);
printTCNumber();
        printTestResult(verifyEquals(expectedResult10_2, actualResult10_2));


        //TC_10_3 Positive
        x = 0;
        String expectedResult10_3 = "x is zero";

        String actualResult10_3 = checkTheNumber(x);

        verifyEquals(expectedResult10_3, actualResult10_3);
printTCNumber();
        printTestResult(verifyEquals(expectedResult10_3, actualResult10_3));



    }
}
/*
Part 2


Все методы необходимо тестировать, если нет особого условия
При невалидных значениях для всех методов необходимо вернуть -1 или “Error”
в зависимости от типа данных. Можно прописать проверки на валидность в отдельных
методах и вызывать эти методы по необходимости



Написать метод, который принимает на вход десятичное число (например, 10.75), и возвращает строку “10 руб 75 коп”.


Написать метод, который принимает на вход десятичное число (например, 10,075) и возвращает строку “10 кг 75 гр”.


Написать метод, который принимает на вход необходимые параметры, и печатает чек. Этот метод тестировать не нужно, но необходимо использовать все раннее написанные методы (в задачах из Part 1 тоже могут пригодиться некоторые методы)

Пример чека:

Яблоки
Цена за 1 кг			50 руб 13 коп
Количество товара	         3 кг 400 гр
_______________________________________
Сумма к оплате		170 руб 44 коп

или

Хлеб
Цена за 1 шт		30 руб 50 коп
Количество товара	5 шт
_______________________________________
Сумма к оплате		152 руб 50 коп


Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число. Счастливое число рассчитывается по формуле: сумма всех чисел, если результат больше 9, снова считается сумма всех чисел.
Например:
год рождения 1999
1 + 9 + 9 + 9 = 28
2 + 8 = 10
1 + 0 = 1
Счастливое число - 1


а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.

b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать

*Медиана - это серединное число в отсортированном наборе чисел.
1, 3, 9 → медиана 3
12, 13, 101 → медиана 13
14, 2, 12 → медиана 12

ВСе параметры приходят в int, расчеты производим в int


Протестировать оба метода - a) и b)



Написать метод, который использует методы класса Math, принимает на вход сумму к оплате (например, 10.75) и округляет сумму в пользу покупателя. Метод возвращает новую сумму к оплате в виде строки, например “10 руб 00 коп”.


Посчитать с помощью методов класса Math
int a = 3
int b = 4
int c = 20

((a * b + c) * ab)
Вернуть значение с округлением в бОльшую сторону.

Part 3





Написать метод, который с помощью методов класса Math высчитывает случайно сгенерированную степень сгенерированного случайного числа. Метод возвращает значение и выводит на экран: “Число … в степени … = …”
Число может быть в пределах от 0 до 1 исключительно.
Степень числа может быть от 0 до 10 включительно


Написать метод, который возвращает целочисленное случайное число в пределах от 1 до 99 включительно. Затем написать метод, который возвращает случайное число в пределах от -1 до -99 включительно






Нагуглить географические координаты пяти городов, сделать API запрос по этим координатам, получить параметры погоды. Затем сделать другие API запросы по названию тех же годов. Получить параметры погоды и сравнить результаты. Распечатать результаты 2х запросов по каждому городу. Если результаты совпали, то напечатать Pass, если не совпали - Fail



 */

