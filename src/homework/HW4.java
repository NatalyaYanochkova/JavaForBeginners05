package homework;

public class HW4 {

    static String task = "\nTask # ";
    static int number = 2;
    static double speedAverage = 0;
    static String longLine = "_________________________________________________________________________";
    static String vLine = "|";
    static String tab = "\t";
    static String tabs = "\t\t";

    public static void printTask() {
        System.out.println(task + (number ++));
    }

    public static void countTemperatureInF(double tempC) {
        System.out.println((tempC * 1.8 + 32) + " °F");
    }

    public static void printKLM(String var1, String var2, int num1, int num2) {
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        System.out.println(
                "Результат деления " + var1 + " на " + var2 + " = "
                        + quotient
                        + ", а остаток от деления  = "
                        + remainder
        );
    }

    public static void countSpeedAverage(double distance, double time) {
        speedAverage = distance / time;
        System.out.println(speedAverage);
    }

    public static void printApples(int apples) {
        String appleWord = "";
        if (apples == 1 || apples % 10 == 1) {
            appleWord = " яблокo";
        } else if (apples >= 2 && apples <= 4
                || apples % 10 >= 2 && apples % 10 <= 4 ) {
            appleWord = " яблока";
        } else {
            appleWord = " яблок";
        }

        System.out.print(appleWord);
    }

    public static void printApplesPo(int apples) {
        String appleWord = "";
        if (apples > 10 && apples < 20) {
            appleWord = " яблок";
        } else if (apples == 1 || apples % 10 == 1) {
            appleWord = " яблоку";
        } else if (apples >= 2 && apples <= 4
                || apples % 10 >= 2 && apples % 10 <= 4 ) {
            appleWord = " яблока";
        } else {
            appleWord = " яблок";
        }

        System.out.print(appleWord);
    }


    public static void printStudents(int students) {
        String studentsWord = "";
        if (students >= 1 && students <= 4
                || students % 10 >= 1 && students % 10 <= 4 ) {
            studentsWord = " ученика";
        } else {
            studentsWord = " учеников";
        }

        System.out.print(studentsWord);
    }

    public static void countApples(int apples, int students) {
        int applesForStudents = apples / students;
        int applesForTeacher = apples % students;

        System.out.print("Если " + apples);
        printApples(apples);

        System.out.print(" поделить на " + students);
        printStudents(students);

        System.out.print(", то каждый ученик получит по " + applesForStudents);
        printApplesPo(applesForStudents);

        System.out.print(", и " + applesForTeacher);
        printApples(applesForTeacher);
        System.out.print(" останется учителю.\n");
    }

    public static void printVLine() {
        System.out.print(vLine);
    }

    public static void printLine() {
        System.out.println(longLine);
    }

    public static void printHeader(String letter, double variable ) {
        printVLine();
        System.out.print(letter + " = " + variable + tabs + tab);
    }

    public static void printHeader(String letter, float variable ) {
        printVLine();
        System.out.print(letter + " = " + variable + tabs);
    }

    public static void printAction(String action, float f, double d) {
        printVLine();
        String result = "float" + action + " = " + f;
        if (result.length() < 18) {
            System.out.print(result + tabs + tabs);
        } else {
            System.out.print(result + tabs + tab);
        }
        printVLine();
        result = "double" + action + " = " + d;
        if (result.length() < 18) {
            System.out.print(result + tabs + tabs + tabs);
            printVLine();
            System.out.println();
        } else if (result.length() < 25){
            System.out.print(result + tabs + tabs + tab);
            printVLine();
            System.out.println();
        } else {
            System.out.print(result + tab);
            printVLine();
            System.out.println();
        }
    }

    public static void printResult(String action, float f, float ff, double d, double dd) {
        if (action.equals("+")) {
            action = "Sum";
            float resultF = f + ff;
            double resultD = d + dd;
            printAction(action, resultF, resultD);
        } else if (action.equals("-")) {
            action = "Sub";
            float resultF = f - ff;
            double resultD = d - dd;
            printAction(action, resultF, resultD);
        } else if (action.equals("*")) {
            action = "Product";
            float resultF = f * ff;
            double resultD = d * dd;
            printAction(action, resultF, resultD);
        } else if (action.equals("/")) {
            action = "Quotient";
            float resultF = f / ff;
            double resultD = d / dd;
            printAction(action, resultF, resultD);
        } else if (action.equals("%")) {
            action = "Remainder";
            float resultF = f % ff;
            double resultD = d % dd;
            printAction(action, resultF, resultD);
        } else {
            System.out.println("Can't recognize the action");
        }
    }

    public static void main(String[] args) {
        //2
        //Написать метод, который будет печатать номер задания перед каждым ответом. Придумайте свой дизайн.
        printTask();

        //3
        //Записать в виде кода следующие логические выражения:
        // 1) (2 = 2) И (7 = 7);
        //2) Не(15 < 3);
        //3) ("Сосна" = "Дуб") ИЛИ ("Вишня" = "Клён");
        //4) Не("Сосна" = "Дуб");
        //5) (Не(15 < 3)) И (10 > 20);
        //6) ("Глаза даны, чтобы видеть") И ("Под третьим этажом находится второй этаж");
        //7) (6/2 = 3) ИЛИ (7*5 = 20)


        printTask();
        /*
         * 1) (2 == 2 && (7 == 7)) - True
         * 2) !(15 < 3) - True
         * 3) ("Сосна".equals("Дуб") || ("Вишня".equals("Клен"))) - здесь обязательно .equals(), тк я о нем рассказывала и показывала
         * 4) !("Сосна".equals("Дуб")) - тоже обязательно именно так, я это показывала. Будет True
         * 5) (!(15 < 3) && (10 > 20)) False
         * 6) ("Глаза даны, чтобы видеть") && ("Под третьим этажом находится второй этаж") - это самый простой вариант, а там уж кто что придумает )))
         * 7) (6 / 2 == 3) || (7 * 5 == 20)
         */

        printTask();
        //4
        //Записать в виде кода следующие выражения:
        //а) Света младше Андрея и Наташи
        //б) На полке стоят учебники, а на столе лежат справочники.
        //в) БОльшая часть детей — девочки. Остальные - мальчики.

        //a
        int ageS;
        int ageA;
        int ageN;
//        (ageS < ageA) && (ageS < ageN);

        //b
        //("На полке стоят учебники") && ("На столе лежат справочники")

        //c
        int girls;
        int boys;
        int all;
        //(all - girls) < (all - boys)


        //5
        //“Водительские права можно получить, только когда исполнится 16 лет.”
        printTask();
        int age;
//        if(age >= 16) {
//            System.out.println("Можно получить водительские права");
//        }

        //6
        //”Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно”
        printTask();
        String action1 = "едет в автобусе";
        String action2 = "читает книгу";
        String action3 = "смотрит в окно";

        //String actionsPetr = !(action1) && ((action2) || !(action3))

        //7
        //“Если с другом ты, это хорошо, а когда наоборот - плохо”
        printTask();
        String action = "ты с другом";
        String actionNow = "";

        if (actionNow.equals(action)) {
            System.out.println("Это хорошо");
        } else {
            System.out.println("Плохо");
        }

        //8
        //Проверить число x, которое может принимать значения 10, 12, -3, 5 и 0.
        //Если x больше 10, то вывести на печать “x больше 10”.
        //Если x меньше нуля, то вывести на печать “x - отрицательное число”
        //Если x = 5, то вывести на печать “Разность x и 5 равна 0”
        //Иначе вывести на печать “Число x меньше 11, больше или равно 0, но не равно 5”.
        // Проверить, соответствует ли последнее утверждение всем предыдущим утверждениям.
        printTask();
        int x = 10; // x = 10, 12, -3, 5 и 0
        if (x > 10) {
            System.out.println("x больше 10");
        } else if (x < 0) {
            System.out.println("x - отрицательное число");
        } else if (x == 5) {
            System.out.println("Разность x и 5 равна 0");
        } else {
            System.out.println("Число x меньше 11, больше или равно 0, но не равно 5");
        }

        //9
        // Проверьте число на четность. Если число четное, удвойте это число, иначе возведите число в квадрат.
        // Выведите результат работы алгоритма на печать.
        // Найдите в презентации, какой блок схеме соответствует ваш алгоритм.
        printTask();
        int y = 3;
        if (y % 2 == 0) {
            System.out.println("y * 2 = " + (y * 2));
        } else {
            System.out.println("y * y = " + (y * y));
        }

        //10
        //Напишите алгоритм проверки возраста на соответствие условиям (if-else):
        //Голосовать можно с 18 лет
        //Машину можно водить с 16 лет
        //В школу можно идти с 5 лет
        //Выведите результат работы алгоритма на печать.
        printTask();
        //здесь важно, чтобы для возраста больше 18 выводились все 3 предложения, тк по тех заданию нет ограничения по возрасту в бОльшую сторону
        age = -3;
        if (age >= 0 && age <= 150) { // - проверка на валидность данных
            if (age >= 5 ) {
                System.out.println("Можно идти в школу");
                if (age >= 16) {
                    System.out.println("Можно водить машину");
                    if (age >= 18) {
                        System.out.println("Можно голосовать");
                    }
                }
            } else {
                System.out.println("В требованиях не указано, что делать");
            }
        } else {
            System.out.println("Введите валидный возраст");
        }


        //11
        //Напишите алгоритм программы, которая проверяет оценку ученика и выполняет следующие действия:
        //5 - выдать похвальную грамоту и перевести в следующий класс
        //4 - перевести в следующий класс
        //3 - дать задание на лето и перевести в следующий класс
        //2 - вызвать родителей и оставить в текущем классе на второй год
        //Выведите результат работы алгоритма на печать.
        printTask();
        // здесь важно донеси, что оценка только одна, значит, нужно решать через else - if
        int score = 0;
        if (score < 6 && score >= 2) {
            if (score == 5) {
                System.out.println("5 - выдать похвальную грамоту и перевести в следующий класс");
            } else if (score == 4) {
                System.out.println("4 - перевести в следующий класс");
            } else if (score == 3) {
                System.out.println("3 - дать задание на лето и перевести в следующий класс");
            } else if (score == 2) {
                System.out.println("2 - вызвать родителей и оставить в текущем классе на второй год");
            }
        } else {
            System.out.println("score should be >= 2 and <= 5");
        }

        //Part2
        //12
        //Напишите метод, который примет на вход температуру в Цельсиях,
        // и распечатает результат температуры в Цельсиях и в Фаренгейтах.
        printTask();
        countTemperatureInF(100);

        //13
        //Напишите алгоритм программы, которая проверяет 2 числа.
        // Программа складывает числа, которые делятся на 3 без остатка,
        // и вычитает числа, которые делятся на 5 без остатка.
        // ПРограмма выводит на печать результат вычислений.
        //Программа умножает числа, которые делятся на 2 без остатка,
        // но если хотя бы одно число отрицательное,
        // программа умножает результат действия на (-1).
        // ПРограмма выводит на печать результат вычислений.
        //Если числа не прошли ни одну проверку,
        // программа выводит на печать ошибку о невозможности произвести действия.
        printTask();
        // А здесь наоборот надо решать только через независимые if, тк одни и те же числа могут делиться и на 3 и на 5
        // Я предполагала, что отрицательные числа важны только при делении на 2, но если кто-то поймет, что
        //отрицательные числа важны всегда и решит через это утверждение, то тоже OK
        int n = 20;
        int m = -30;

        if (n % 3 != 0 && n % 5 != 0 && n % 2 != 0
                && m % 3 != 0 && m % 5 != 0 && m % 2 != 0) {
            System.out.println("Невозможно произвести действия");

        } else {
            if (n % 3 == 0 && m % 3 == 0) {
                System.out.println("n + m = " + (n + m));
            }
            if (n % 5 == 0 && m % 5 == 0) {
                System.out.println("n - m = " + (n - m));
            }
            if (n % 2 == 0 && m % 2 == 0) {
                if (n >= 0 && m >= 0) {
                    System.out.println("n * m = " + (n * m));
                } else if (n < 0 || m < 0) {
                    System.out.println("-(n * m) = " + (n * m * (-1)));
                }
            }
        }


        //14
        //Распечатать следующие выражения, используя метод и параметры k, l, m:
        //Результат деления k на l = …, а остаток от деления  = …
        //Результат деления k на m = …, а остаток от деления  = …
        //Результат деления l на m = …, а остаток от деления  = …
        //Результат деления m на k = …, а остаток от деления  = …
        printTask();
        int k = 6;
        int l = 2;
        m = 3;

        printKLM("k", "l", k, l);
        printKLM("k", "m", k, m);
        printKLM("l", "m", l, m);
        printKLM("m", "k", m, k);

        //15
        //Решить задачу
        //В клетке находятся фазаны и кролики.
        // Известно, что у них 35 голов и 94 ноги.
        // Узнайте число фазанов и число кроликов.
        //Проверить работу вашего алгоритма тестом.
        printTask();
        int birds = 23; //Test data 23, 20, 1, 100

        int heads = 35;
        int legs = 94;
        int birdLegs = 2;
        int rabbitLegs = 4;
        int rabbits = heads - birds;

        int actualResult = 0;
        if ((birds == heads - rabbits) && (birdLegs * birds == legs - (rabbitLegs * rabbits))) {
            actualResult = rabbits;
        }

        //Test
        int expectedResult = 12;
        if (actualResult == expectedResult) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }


        //16
        //Написать метод, который рассчитывает среднюю скорость движения
        // (speedAverage) транспортного средства или живого существа
        // с разными параметрами distance и  time.
        //Протестировать метод.
        //
        //
        //Тестовые данные:
        //distance    time
        //12         20 min
        //150         2,5 hours
        //300         1¾ hours

        printTask();
        double distance = 12;
        double time = 20;
        countSpeedAverage(distance, time);
        //test1
        double expResult = 0.6;
        if (speedAverage == expResult) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }


        distance = 150;
        time = 150;
        countSpeedAverage(distance, time);
        //test2
        expResult = 1;
        if (speedAverage == expResult) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }


        distance = 300;
        time = 105;
        countSpeedAverage(distance, time);
        //test3
        expResult = 2.857142857142857; // - посчитать на калькуляторе
        if (speedAverage == expResult) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail" );
        }


        //17
        //Выполнить задание 7 и 8 из HW2 с помощью метода и параметров:
        //
        //
        //Написать метод так, чтобы правильные склонения слов (н-р, яблок, яблоко или яблока; ученики - учеников…) печатались автоматически в зависимости от значений параметров.
        //Распечатать выражение с параметрами:
        //apple = 42, 55, 1
        //student = 42, 5, 2

        //7. Создать переменные apple и student и присвоить им значения 40 и 6 соотетственно.
        // Распечатать выражение, где вместо … - результаты математических вычислений:
        //Если … яблок поделить на … учеников,
        // то каждый ученик получит по … яблок(a),
        // и … яблок(а) останется учителю.
        //
        //
        //8. Распечатать выражение из задания 7 со значениями 100 и 21 соответственно.
        printTask();
        int apple = 40; //42, 55, 1
        int student = 6; //42, 5, 2

        countApples(apple, student);
        countApples(42, 42);
        countApples(33, 3);
        countApples(63, 3);
        countApples(55, 5);
        countApples(1, 2);

        //18
        printTask();
        float f = 5.66F;
        float ff = 10.0F;
        double d = 5.66;
        double dd = 10.0;

        printLine();
        printHeader("f", f);
        printHeader("ff", ff);
        printHeader("d", d);
        printHeader("dd", dd);
        printVLine();
        System.out.println();

        printLine();
        printResult("+", f, ff, d, dd);
        printResult("-", f, ff, d, dd);
        printResult("*", f, ff, d, dd);
        printResult("/", f, ff, d, dd);
        printResult("%", f, ff, d, dd);
        printLine();


        //19
        //Напишите алгоритм программы, которая проверяет число типа short на количество разрядов, и выводит результат проверки.
        //( Например, “It’s a two-digit number.”, “It’s a five-digit number.”, etc)
        //Выведите результат проверки на печать.
        printTask();
        short number = 10000;

        if (number < 0) {
            number = (short) ((-1) * number);
        }
        if (number / 10 == 0) {
            System.out.println("It’s a one-digit number.");
        } else if (number / 100 == 0) {
            System.out.println("It’s a two-digit number.");
        } else if (number / 1000 == 0) {
            System.out.println("It’s a three-digit number.");
        } else if (number / 10_000 == 0) {
            System.out.println("It’s a four-digit number.");
        } else if (number / 100_000 == 0) {
            System.out.println("It’s a five-digit number.");
        }



        //20
        //На сайте https://openweathermap.org/ зарегистрироваться и получить ключ (key).
        // Найти в документации пример запроса с параметрами “Название города” (а не с географическими координатами).
        // Сформировать и отправить запрос на сервер (manually).
        // В полученном ответе найти географические координаты для следующих городов

        //https://api.openweathermap.org/data/2.5/weather?q=London&appid={API%20key}
        //London - "lon":-0.1257,"lat":51.5085
        //Paris - "lon":2.3488,"lat":48.8534
        //Rome - "lon":-85.1647,"lat":34.257










    }
}
