package lessons;

public class MathMethods {

    public static void printLine() {
        String line = "__________________________________";
        System.out.println(line);
    }

    public static void main(String[] args) {

        //          Основные функции
        System.out.println("Основные функции");

        System.out.println(Math.abs(-26.7));         // Модуль числа
        System.out.println(Math.ceil(7.4));          // Округляет в большую сторону
        System.out.println(Math.floor(7.8));         // Округляет в меньшую сторону
        System.out.println(Math.max(8.6, 5.2));      // Выбирает максимальное из двух чисел
        System.out.println(Math.min(8.6, 5.2));      // Выбирает минимальное из двух чисел
        System.out.println(Math.pow(5, 3));          // Возведение в степень. Первое число в скобках - что возводим.
        // Второе число - в какую степень
        System.out.println(Math.sqrt(9));            // Квадратный корень числа

        printLine();

        //          MATH CLASS PART #1: MAX and MIN Methods (JAVA)
        System.out.println("MATH CLASS: MAX and MIN");

        System.out.println("a) " + Math.max(50, 100));
        System.out.println("b) " + Math.min(50, 100));

        int num1 = 100;
        int num2 = 50;
        int num3 = 150;

        //NB! В методе MATH мы можем сравнить только 2 числа

        //1й вариант реализации метода сравнения 3х чисел
        int max = Math.max(num1, num2);
        System.out.println("c) " + max);
        //int max = Math.max(num1, num2, num3) - ERROR! Так нельзя записать
        max = Math.max(num3, max);
        System.out.println("d) " + max);

        //2й (более верный) вариант реализации метода сравнения 3х чисел: "Метод в методе"
        max = Math.max(Math.max(num1, num2), num3);
        System.out.println("e) " + max);
        int min = Math.min(Math.min(num1, num2), num3); //Тоже самое при поиске минимального числа из 3х
        System.out.println("f) " + min);

        System.out.println("g) " + Math.max(50.26, 100.67)); //Используем переменную double в параметрах
        System.out.println("h) " + Math.min(50, 100.67));    //Используем переменную double в параметрах

        //1. The method max of the Math class finds the maximum of two numbers
        //2. The method min of the Math class finds the minimum of two numbers
        //3. Methods can only be used the way the creator intended
        //4. Methods can be used inside of other methods
        //5. Methods can be overloaded

        printLine();

        //          MATH CLASS PART #2: Rounding Methods (JAVA)
        System.out.println("MATH CLASS: Rounding Methods");

        //int num4 = Math.round(10.5); - ERROR! Так нельзя записать

        //rounding floor - Округляет в меньшую сторону, не имеет значения какая цифра после запятой
        //Возвращает double переменную
        System.out.println("rounding floor:");
        System.out.println("a) " + Math.floor(10.1));
        System.out.println("b) " + Math.floor(10.5));
        System.out.println("c) " + Math.floor(10.9));

        //rounding ceil - Округляет в большую сторону, не имеет значения какая цифра после запятой
        //Возвращает double переменную
        System.out.println("rounding ceil:");
        System.out.println("a) " + Math.ceil(10.1));
        System.out.println("b) " + Math.ceil(10.5));
        System.out.println("c) " + Math.ceil(10.9));

        System.out.println("конвертировать результат в переменную int (double to int):");
        //Если переменная int, нельзя использовать method Math.floor или Math.ceil, так как эти methods
        // используют переменную double, а переменная double больше чем переменная int и не может быть ей присвоена.

        //int num5 = Math.floor(10.9); - ERROR
        //int num6 = Math.ceil(10.1);  - ERROR

        //То есть нам нужно конвертировать результат в переменную int, для этого мы добавим ее в скобках перед методом:
        int num5 = (int)Math.floor(10.9);
        int num6 = (int)Math.ceil(10.1);
        System.out.println("1) " + num5); // на выходе переменная int без знаков после запятой
        System.out.println("2) " + num6); // на выходе переменная int без знаков после запятой

        System.out.println("rounding:"); // на выходе переменная int без знаков после запятой
        System.out.println("1) " + Math.round(10.1));   //если значение после точки < 5, округление в меньшую сторону
        System.out.println("2) " + Math.round(10.4999));//если значение после точки < 5, округление в меньшую сторону
        System.out.println("3) " + Math.round(10.5));   //если значение после точки >= 5, округление в большую сторону
        System.out.println("4) " + Math.round(10.9));   //если значение после точки >= 5, округление в большую сторону

        System.out.println("конвертировать результат в переменную int (long to int):");
        //Если переменная int, нельзя использовать method Math.round, так как этот method
        // используют переменную long, а переменная long больше, чем переменная int и не может быть ей присвоена.

        //int num7 = Math.round(10.9); - ERROR

        //То есть нам нужно конвертировать результат в переменную int, для этого мы добавим ее в скобках перед методом:
        int num7 = (int)Math.round(10.9);
        System.out.println("a) " + num7);

        System.out.println("Отрицательные числа:");
        System.out.println("1) " + Math.floor(-10.9)); // -11 < -10
        System.out.println("2) " + Math.ceil(-10.1));  // -10 > -11
        System.out.println("3) " + Math.round(-10.5)); // -10 > -11

        //1. The Math Class has 3 rounding methods: floor, ceil, round
        //2. The method floor of the Math Class rounds down
        //3. The method ceil of the Math Class rounds up
        //4. The method round of the Math Class uses ties rounding ( .5 - up; .4 - down)
        //5. It is important to know what data type is being returned by a method
        //6. Negative numbers can be rounded

        printLine();

        //          MATH CLASS PART #3: Random Method (JAVA)
        System.out.println("MATH CLASS: Random Method");

        // Range (диапазон): 0 <= num < 1 - Этот промежуток в этом методе всегда по умолчанию
        System.out.println("Range (диапазон): 0 <= num < 1");
        System.out.println(Math.random()); // случайные числа (random numbers)
        System.out.println(Math.random()); // случайные числа (random numbers)
        System.out.println(Math.random()); // случайные числа (random numbers)

        System.out.println("Range (диапазон): 0 <= num < 10");
        //Число до запятой будет в промежутке от 0 до 9 включительно, то есть 10 разных вариантов:
        System.out.println(Math.random() * 10);
        System.out.println(Math.random() * 10);
        System.out.println(Math.random() * 10);

        //Если мы попытаемся конвертировать в переменную int, то на выходе всегда получим 0:
        System.out.println("конвертируем в int без скобок:");
        System.out.println((int)Math.random() * 10);

        //Чтобы случайные числа до запятой перевелись в переменную int, нужно поставить ещё одни скобки вокруг
        //Math.random()*10, то есть переменная int в отдельных скобках, а метод Math.random()*10 в отдельных скобках
        System.out.println("конвертируем в int со скобками:");
        System.out.println((int)(Math.random() * 10));
        System.out.println((int)(Math.random() * 10));
        System.out.println((int)(Math.random() * 10));

        //                                       20....29         10.....19
        System.out.println("Range (диапазон): 20 <= num < 30 && 10 <= num < 20");
        //amount possible numbers + lower bound (количество возможных чисел + нижняя граница), где:
        // 10 - amount possible numbers; 20 - lower bound
        System.out.println((int)(Math.random() * 10) + 20); // установили нижнюю границу:  20
        //и метод будет генерировать числа от нижней границы до 29, потому что у нас стоит диапазон 10 чисел,
        // но так как 20 включительно, то получается от 20 до 29

        System.out.println("Method CALL"); // Add two numbers together then subtract 1

        //Чтобы вычислить диапазон и верхнюю границу,
        // нужно прибавить количество возможных чисел и нижнюю границу, а затем вычесть 1
        System.out.println("1) " + ((int)(Math.random() * 100) + 10));//Range (диапазон): 10...109 (109 = 100+10-1), где
        // 10 - нижняя граница (задана); 109 - верхняя граница (вычислили)
        System.out.println("2) " + ((int)(Math.random() * 101) + 10)); //Range (диапазон): 10...110 (110 = 101+10-1)
        System.out.println("3) " + ((int)(Math.random() * 55) + 32));  //Range (диапазон): 32...86 (86 = 55+32-1)
        System.out.println("4) " + ((int)(Math.random() * 13) + 845)); //Range (диапазон): 845...857 (857 = 13+845-1)

        //Примеры, когда нижняя граница отсутствует:
        System.out.println("5) " + ((int)(Math.random() * 10))); //Range (диапазон): 0...9 (9 = 10+0-1)
        System.out.println("6) " + ((int)(Math.random() * 0)));  //Range (диапазон): 0...9 (9 = 10+0-1)
        System.out.println("7) " + ((int)(Math.random() * 33))); //Range (диапазон): 0...32 (32 = 33+0-1)

        //Примеры с отрицательной нижней границей:
        System.out.println("8) " + ((int)(Math.random() * 10) - 20)); //Range (диапазон): -20...-11 (-11 = 10+(-20)-1)
        System.out.println("9) " + ((int)(Math.random() * 40) - 80)); //Range (диапазон): -80...-41 (-41 = 40+(-80)-1)
        System.out.println("10) " + ((int)(Math.random() * 30) - 10)); //Range (диапазон): -10...19 (19 = 30+(-10)-1)

        System.out.println("11) " + ((int)(Math.random() * 10) + 1)); //Range (диапазон): 1...10 (10 = 10+1-1)

        // Вычислить верхнюю границу и найти диапазон, если задана нижняя граница и количество возможных чисел:
        System.out.println("Вычислить верхнюю границу и найти диапазон:");
        System.out.println("a) " + ((int)(Math.random() * 150) + 10)); //Range (диапазон):  10...159 (159 = 150+10-1)
        System.out.println("b) " + ((int)(Math.random() * 151) + 10)); //Range (диапазон):  10...160 (160 = 151+10-1)
        System.out.println("c) " + ((int)(Math.random() * 26) + 65));  //Range (диапазон):  65...90 (90 = 26+65-1)
        System.out.println("d) " + ((int)(Math.random() * 15) + 314)); //Range (диапазон): 314...328 (328 = 15+314-1)
        System.out.println("e) " + ((int)(Math.random() * 20)));       //Range (диапазон):   0...19 (19 = 20+0-1)
        System.out.println("f) " + ((int)(Math.random() * 20) + 0));   //Range (диапазон):   0...19 (19 = 20+0-1)
        System.out.println("g) " + ((int)(Math.random() * 88)));       //Range (диапазон):   0...87 (87 = 88+0-1)
        System.out.println("h) " + ((int)(Math.random() * 25) - 50));  //Range (диапазон): -50...-26 (-26 = 25+(-50)-1)
        System.out.println("i) " + ((int)(Math.random() * 36) - 75));  //Range (диапазон): -75...-40 (-40 = 36+(-75)-1)
        System.out.println("j) " + ((int)(Math.random() * 10) - 5));   //Range (диапазон):  -5...4 (4 = 10+(-5)-1)
        System.out.println("k) " + ((int)(Math.random() * 20) + 1));   //Range (диапазон):   1...20 (20 = 20+1-1)

        //Вставить в метод количество возможных чисел и нижнюю границу, если задан диапазон:
        //Upper bound minus lower bound plus 1 (верхнюю границу - нижняя граница + 1)
        System.out.println("");
        System.out.println("l) " + ((int)(Math.random() * 100) + 10)); //Range (диапазон):  10...109 (109-10+1=100)
        System.out.println("m) " + ((int)(Math.random() * 101) + 10)); //Range (диапазон):  10...110 (110-10+1=101)
        System.out.println("n) " + ((int)(Math.random() * 55) + 32));  //Range (диапазон):  32...86 (86-32+1=55)
        System.out.println("o) " + ((int)(Math.random() * 13) + 845)); //Range (диапазон): 845...857 (857-845+1=13)
        System.out.println("p) " + ((int)(Math.random() * 10)));       //Range (диапазон):   0...9 (9-0+1=10)
        System.out.println("q) " + ((int)(Math.random() * 10) + 0));   //Range (диапазон):   0...9 (9-0+1=10)
        System.out.println("r) " + ((int)(Math.random() * 33)));       //Range (диапазон):   0...32 (32-0+1=33)
        System.out.println("s) " + ((int)(Math.random() * 10) - 20));  //Range (диапазон): -20...-11 (-11-(-20)+1=10)
        System.out.println("t) " + ((int)(Math.random() * 40) - 80));  //Range (диапазон): -80...-41 (-41-(-80)+1=40)
        System.out.println("u) " + ((int)(Math.random() * 30) - 10));  //Range (диапазон): -10...19 (19-(-10)+1=30)
        System.out.println("v) " + ((int)(Math.random() * 10) + 1));   //Range (диапазон):   1...10 (10-1+1=10)

        //Чтобы с помощью метода Math.random осуществлять поиск букв, символов и т.д. можем использовать перемен. char

        System.out.println("");
        System.out.println((int)(Math.random() * 26) + 65); //Range (диапазон): 65...90 (90=26+65-1)
        //                            65 <= num < 91 - upper-case letters (Заглавные буквы)
        //Вставим в метод переменную char:
        System.out.println((char)((int)(Math.random() * 26) + 65));//тогда Range (диапазон): A <= num < {
        //То есть , когда вставляем в метод переменную char она выбирает буквы из английского алфавита, 26 букв  A...Z

        //Перевод в поиск букв можно записать проще:
        int let = (int)(Math.random() * 26) + 97; // Range (диапазон): 97 <= num < 123    97...122
        System.out.println((char)let);//тогда Range (диапазон):a <= num < { a...z - lower-case letters (Маленькие буквы)

        //1. Math.random() is used to find random numbers
        //2. random finds a range 0 >= num < 1
        //3. What random returns is multiplied times a number (exemp. 0.872 == 8.72)
        //4. The value is then casted as an int data type (exemp. 8.72 == 8)
        //5. A number can be added to this result to give a minimum other than zero
        //6. Method Call into Range: add two numbers together then subtract 1
        //7. range into Method Call: upper bound minus lower bound plus 1
        //8. Random letters can be found using their ascii numeric equivelents

        printLine();

        //          MATH CLASS PART #4: Summary (JAVA)
        System.out.println("MATH CLASS: Summary");

        System.out.println("Method sqrt");
        System.out.println(Math.sqrt(16));   // 4.0 - Возвращает квадратный корень из значения
        System.out.println(Math.sqrt(8.5));  // 2.9154759474226504 - Возвращает квадратный корень из значения

        //                    (Math.sqrt(16) and (Math.sqrt(8.5)
        // Method name:              sqrt
        // Data Type In:             double
        // Data Type Returned:       double
        // Sequence:                 n/a
        // Quantity:                 1

        System.out.println("Method abs");
        System.out.println(Math.abs(-16));   // 16 - Возвращает абсолютное значение значения
        System.out.println(Math.abs(8.5));  // 8.5 - Возвращает абсолютное значение значения

        //                       (Math.abs(-16)            (Math.abs(8.5)     - overloaded (Перегруженные)
        // Method name:              abs                      abs       - same name (одноимённая)
        // Data Type In:             int                      double    - different implementation (другая реализация)
        // Data Type Returned:       int                      double    - different implementation (другая реализация)
        // Sequence:                 n/a                      n/a
        // Quantity:                 1                        1

        System.out.println("Method pow");
        System.out.println(Math.pow(5, 6));//15625.0  - Возвращает первое значение, возведен в степень второго значения
        System.out.println(Math.pow(6, 5));//7776.0  - Возвращает первое значение, возведенн в степень второго значения

        //                        (Math.pow(5, 6) and (Math.pow(6, 5)
        // Method name:                  pow
        // Data Type In:           double, double
        // Data Type Returned:        double
        // Sequence:                base, exp
        // Quantity:                     2

        System.out.println("Method max");
        System.out.println(Math.max(5, 6));     // 6 - Возвращает максимальное значение, равное двум значениям
        System.out.println(Math.max(6.8, 5.4)); // 6.8 - Возвращает максимальное значение, равное двум значениям
        //System.out.println(Math.max(6, 4, 5)); - ERROR

        //                      (Math.max(5, 6)             (Math.max(6.8, 5.4) - overloaded (Перегруженные)
        // Method name:            max                     max                  - same name (одноимённая)
        // Data Type In:           int, int                double, double - different implementation (другая реализация)
        // Data Type Returned:     int                     double         - different implementation (другая реализация)
        // Sequence:               num, num                num, num
        // Quantity:               2                       2

        System.out.println("Method min");
        System.out.println(Math.min(5, 6));     // 5 - Возвращает минимальное значение, равное двум значениям.
        System.out.println(Math.min(6.8, 5.4)); // 5.4 - Возвращает минимальное значение, равное двум значениям.
        //System.out.println(Math.min(6, 4, 5)); - ERROR

        //                      (Math.min(5, 6)             (Math.min(6.8, 5.4) - overloaded (Перегруженные)
        // Method name:            min                     min                  - same name (одноимённая)
        // Data Type In:           int, int                double, double - different implementation (другая реализация)
        // Data Type Returned:     int                     double         - different implementation (другая реализация)
        // Sequence:               num, num                num, num
        // Quantity:               2                       2

        System.out.println("Method floor"); //Возвращает значение, которое меньше или равно аргументу и равно целому
        // числу
        System.out.println(Math.floor(10.1));  // 10.0
        System.out.println(Math.floor(10.9)); //  10.0
        //int num = Math.floor(10.5); - ERROR

        //                      (Math.floor(10.1)
        // Method name:            floor
        // Data Type In:           double
        // Data Type Returned:     double
        // Sequence:               n/a
        // Quantity:               1

        System.out.println("Method ceil"); //Возвращает значение, которое больше или равно аргументу и равно целому
        // числу
        System.out.println(Math.ceil(10.1));  // 11.0
        System.out.println(Math.ceil(10.9)); //  11.0
        //int num = Math.ceil(10.5); - ERROR
        int num = (int) Math.ceil(10.5);

        //                      (Math.ceil()
        // Method name:            ceil
        // Data Type In:           double
        // Data Type Returned:     double
        // Sequence:               n/a
        // Quantity:               1

        System.out.println("Method round"); //возвращает ближайшую длинную длину к аргументу с округлением связей
        // в большую сторону
        System.out.println(Math.round(10.1));    // 10.0
        System.out.println(Math.round(10.9));    // 11.0
        System.out.println(Math.round(10.5));    // 11.0
        System.out.println(Math.round(10.4999)); // 10.0
        //int num = (int) Math.round(10.5);       - ERROR
        int num9 = (int) Math.round(10.5);


        //                      (Math.round()
        // Method name:            round
        // Data Type In:           double
        // Data Type Returned:     long
        // Sequence:               n/a
        // Quantity:               1

        System.out.println("Method random"); // возвращает значение в диапазоне: 0.0 <= num < 1

        //                                                        Range:             Possible Output:
        System.out.println(Math.random());                  // [0.0, 1.0)         .65718965
        System.out.println(Math.random() * 10);             // [0.0, 10.0)        6.5718965
        System.out.println((int)(Math.random() * 10));      // [0, 9]             6
        System.out.println((int)(Math.random() * 10) + 5);  // [5, 14]            10

        //                      Math.random()
        // Method name:            random
        // Data Type In:           n/a
        // Data Type Returned:     double
        // Sequence:               n/a
        // Quantity:               0

        // METHOD CALL:: Add two numbers together then subtract 1
        // RANGE:: Upper bound minus lower bound plus 1
        // System.out.println((int)(Math.random() * 10) + 5);  // [5, 14] where 5 - min; 14 - max;

        //Метод всегда будет иметь скобки ():
        System.out.println(Math.PI); // 3.141592653589793 - отношение окружности круга к ее диаметру
        System.out.println(Math.E);  // 2.718281828459045 - Основание натуральных логарифмов

        //          SUMMARY::
        //1. Math Class is a collection of math related methods and data values
        //2. Important to know about methods:: function, name, data in, data returned, sequence and quantity
        //3. OVERLOADED:: Same name different implementation
        //4. Important to know about data values:: function and name

    }
}



