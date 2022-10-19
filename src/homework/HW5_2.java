package homework;
/*

17. Посчитать с помощью методов класса Math
int a = 3
int b = 4
int c = 20

((a * b + c) * ab)
Вернуть значение с округлением в бОльшую сторону.

Part 3

Написать метод, который с помощью методов класса Math высчитывает случайно сгенерированную степень
сгенерированного случайного числа. Метод возвращает значение и выводит на экран: “Число … в степени … = …”
Число может быть в пределах от 0 до 1 исключительно.
Степень числа может быть от 0 до 10 включительно

20. Написать метод, который возвращает целочисленное случайное число в пределах от 1 до 99 включительно.
Затем написать метод, который возвращает случайное число в пределах от -1 до -99 включительно

22. Нагуглить географические координаты пяти городов, сделать API запрос по этим координатам,
получить параметры погоды. Затем сделать другие API запросы по названию тех же годов.
Получить параметры погоды и сравнить результаты. Распечатать результаты 2х запросов по каждому городу.
Если результаты совпали, то напечатать Pass, если не совпали - Fail

 */


import java.lang.ref.SoftReference;

public class HW5_2 {
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

    static int tcNumber = 11;

    //Вспомогательные методы для печати отчета тестирования
    public static void printTCNumber() {
        System.out.print("TC_" + tcNumber++ + "\t -- \t");
    }

    public static void printTestResult(String value) {
        System.out.print(value);
        System.out.println();
    }
    //11 Написать метод, который принимает на вход десятичное число (например, 10.75), и возвращает строку “10 руб 75 коп”.

    public static String formatCurrency(double totalMoney) {
        if (totalMoney < 0) {
            return "Error";
        }
        int rubl = (int) totalMoney;
        int kopeyka = (int) (Math.round(totalMoney * 100 % 100));
        String format = "";
        if (kopeyka > 9) {
            format = "" + rubl + " rub " + kopeyka + " kop. ";
        }
        if (kopeyka <= 9) {
            format = "" + rubl + " rub 0" + kopeyka + " kop. ";
        }
        return format;
    }

    // 12. Написать метод, который принимает на вход десятичное число (например, 10,075) и возвращает строку “10 кг 75 гр”.
    public static String convertNumberWeight(double weight) {
        if (weight >= 0) {
            int kg = (int) weight;
            int gr = (int) (Math.round(weight - kg) * 1000);
            //String gr1;
            //if (gr>=0 && gr<9){
            //  gr1 = "0" + gr;
            //} else {
            //  gr1 = "" +gr;
            //}
            return kg + " kg " + gr + " gr";
        }
        return "Error";
    }
/*
3Написать метод, который принимает на вход необходимые параметры, и печатает чек.
Этот метод тестировать не нужно, но необходимо использовать все раннее написанные методы
(в задачах из Part 1 тоже могут пригодиться некоторые методы)

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
 */

    public static void receipt(String item, String units, double price, double amount) {
        if (item == null || units == null || price <= 0 || amount <= 0) {
            System.out.println("Error");
        } else {
            System.out.println("\n" + item);
            System.out.println("Цена за 1 " + units + "\t\t\t" + formatCurrency(price));
            if (units.equalsIgnoreCase("кг")) {
                System.out.println("Количество товара\t\t" + convertNumberWeight(amount));
            } else {
                System.out.println("Количество товара\t\t" + (int) amount + " шт");
            }
            System.out.println("____________________________________");
            System.out.println("Сумма к оплате\t\t\t" + formatCurrency(price * amount));
        }
    }


/*
14. Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число.
    Счастливое число рассчитывается по формуле: сумма всех чисел, если результат больше 9, снова считается сумма всех чисел.
            Например:
    год рождения 1999
            1 + 9 + 9 + 9 = 28
            2 + 8 = 10
            1 + 0 = 1
    Счастливое число - 1
    */


    public static String printLuckyNum(int yOB) {
        int luckyNum = yOB % 9;
        if (luckyNum == 0) {
            luckyNum = 9;
        }
        return "Your lucky number is: " + luckyNum;
    }

    /* 15
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
     */
    public static String median (int a, int b, int c, int median){
        if (((a+b+c)/3 - median)>2){
            return "Среднее значение " + (a+b+c)/3 + " отличается от медианы " + median + "на"
                    +((a+b+c)/3 - median) + ".";
        }
        return "Среднее значение =" + (a+b+c)/3 + " медиана =  " + median + ".";
    }
    public static String medianMath(int a, int b, int c){
        int median = Math.max(Math.min(a,b), Math.min(Math.max(a,b), c));
        if (((a+b+c)/3 - median)>2){
            return "Среднее значение " + (a+b+c)/3 + " отличается от медианы " + median + "на"
                    +((a+b+c)/3 - median) + ".";
        }
        return "Среднее значение = " + (a+b+c)/3 + ", медиана = " + median + ".";
    }

    //16 Написать метод, который использует методы класса Math, принимает на вход сумму к оплате (например, 10.75)
    // и округляет сумму в пользу покупателя. Метод возвращает новую сумму к оплате в виде строки, например “10 руб 00 коп”.


    public static void main(String[] args) {
        // 11 task positive
        double totalMoney = 2.05;
        String expectedResult = "2 rub 05 kop. ";
        //act
        String actualResult = formatCurrency(totalMoney);
        //assert
        verifyEquals(expectedResult, actualResult);
        //report
        printTCNumber();
        printTestResult(verifyEquals(expectedResult, actualResult));
        //negativ
        totalMoney = -16.34;
        String expectedResul1t = "Error";

        //act
        String actualResult1 = formatCurrency(totalMoney);
        //assert
        verifyEquals(expectedResul1t, actualResult1);
        //report
        printTestResult(verifyEquals(expectedResul1t, actualResult1));

        // 12 task positive
        double weight = 10.075;
        String expectedResult2 = "10 kg 75 gr";
        //act
        String actualResult2 = convertNumberWeight(weight);
        //assert
        verifyEquals(expectedResult2, actualResult2);
        //report
        printTCNumber();
        printTestResult(verifyEquals(expectedResult2, actualResult2));
        //negative
        totalMoney = -3.74;
        String expectedResul1t3 = "Error";

        //act
        String actualResult3 = convertNumberWeight(weight);
        //assert
        verifyEquals(expectedResul1t3, actualResult3);
        //report
        printTestResult(verifyEquals(expectedResul1t, actualResult1));

        //13 task
        printTCNumber();
        receipt("Яблоки", "кг", 53.13, 3.400);
        receipt("Хлеб", "шт", 30.50, 5);

        //14 task positive
        int yOB = 1974;
        String expectedResult4 = "Your lucky number is: 3";
        //act
        String actualResult4 = printLuckyNum(yOB);
        //assert
        verifyEquals(expectedResult4, actualResult4);
        //report
        printTCNumber();
        printTestResult(verifyEquals(expectedResult4, actualResult4));

        // 15 task positive
        int a = 14;
        int b = 2;
        int c = 12;
        int median = 12;
        String expectedResult15 = "Среднее значение = 9, медиана = 12.";
        //act
        String actualResult15 = medianMath(14, 2, 12);
        //assert
        verifyEquals(expectedResult15, actualResult15);
        //report
        printTCNumber();
        printTestResult(verifyEquals(expectedResult15, actualResult15));
    }
}
