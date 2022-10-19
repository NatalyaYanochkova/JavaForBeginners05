package homework;

public class HW6 {

    static int taskNumber = 1;

    //Вспомогательные методы для печати отчета тестирования
    public static void printTCNumber() {
        System.out.println("\n" + "\u001B[0m" + "________Task_" + taskNumber++ + "_____________");

    }

    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    //10.Написать метод, который принимает на
    // вход параметры start,  end, step, и печатает
    // последовательность десятичных  чисел, начиная с числа start, с шагом step. Точка выхода из цикла - число end.

    public static void createSequence(double start, double end, double step) {
        if (step != 0 && start != end) {
            if (start < end && step > 0) {
                for (double i = start; i <= end; i += step) {
                    System.out.print(i + "\t");
                }
            } else {
                for (double i = start; i >= end; i -= step) {
                    System.out.print(i + "\t");
                }
            }
        }
        if (start == end) {
            System.out.print(start);
        }
    }

    // 11. Написать метод, который принимает на вход параметры n и m
    // типа char, и выводит на печать последовательность букв английского алфавита
    // в промежутке между значениями n и m включительно.
    public static void m1(char n, char m) {
        if (n > 65 && m <= 90 || n >= 97 && m <= 122) {
            if (n <= m) {
                for (int i = n; i <= m; i++) {
                    System.out.print((char) i + "\t");

                }
            } else {
                for (int i = n; i >= m; i--) {
                    System.out.print((char) i + "\t");
                }
            }
        }
    }
//12.Написать метод, который принимает параметр  и печатает  последовательность четных чисел от нуля.
// Длина последовательности = l.
    public static void returnNumber(int l) {
        int count = 0;
            for (int i = 0; count < l; i+=2, count++) {
                    System.out.print(i + " ");
                }
            }
//13. Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до n включительно

    public static void printNn (int n){
        for (int i = 1; i <=n; i++){
            System.out.println((int) (Math.pow(2,i)) +"\t");
        }
    }
//14.Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.
//15. Написать метод, который генерирует  последовательность чисел:
//0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5
//Метод формирует строку из сгенерированных значений, и выводит результат единожды на печать. ПРотестировать этот метод.

    public static void main(String[] args) {
        //1.Распечатать последовательность чисел от 0 до 9 включительно.
        printTCNumber();
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "\t");
        }
        //2.Распечатать последовательность чисел от 10 исключительно до 0 включительно.
        printTCNumber();
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + "\t");
        }
        //3.Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.
        printTCNumber();
        for (int i = 50; i < 55; i += 2) {
            System.out.print(i + "\t");
        }
        //4.Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)
        printTCNumber();
        // for (int i = 326; i > 300; i--) {
        // if (i % 7 == 0) {
        //    System.out.print(i + "\t");
        // }
        //}
        //более правильное решение; код сложнее но операций меньше
        for (int i = 326; i > 300; i--) {
            if (i % 7 == 0) {
                for (int j = i; j > 300; j -= 7) {
                    System.out.print(j + "\t");
                }
                break;
            }
        }

        //5.Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1
        printTCNumber();
        for (double i = 12; i < 13; i += 0.1) {
            System.out.print((double) (int) Math.round(i * 10) / 10 + "\t");
        }
        //6.Распечатать последовательность четных чисел от 215 до 237 включительно
        printTCNumber();
        for (int i = 215; i < 238; i++) {
            if (i % 2 == 0)
                System.out.print(i + "\t");
        }
        //7.Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно.
        printTCNumber();
        for (int i = 8; i < 14; i++) {
            if (i % 7 == 0)
                System.out.print(i + "\t");
        }
        //8.Распечатать последовательность которая начинается с минимального значения
        // типа данных short и заканчивается максимальным значением short.
        // Числа в последовательности должны быть кратны 15001.
        printTCNumber();
        for (short i = Short.MIN_VALUE; i < Short.MAX_VALUE; i++) {
            if (i % 15001 == 0) {
                System.out.print(i + "\t");
            }
        }

        //9.Распечатать последовательность чисел в промежутке от -10 до 34 включительно.
        // Числа, кратные 11, должны быть распечатаны синим цветом.
        // Числа, кратные 12, должны быть распечатаны красным цветом.
        // А ноль необходимо распечатать словом ZERO.
        printTCNumber();
        for (int i = -10; i < 35; i++) {
            if (i == 0) {
                System.out.print("ZERO" + "\t");
            } else if (i % 12 == 0) {
                System.out.print("\u001B[31m" + i + "\t ");
            } else if (i % 11 == 0) {
                System.out.print("\u001B[34m" + i + "\t ");
            }
        }
        //10
        printTCNumber();
        createSequence(10, 8, 2);

        //11
        printTCNumber();
        m1('a', 'g');

        //12
        printTCNumber();
        returnNumber(5);

        //13
        printTCNumber();
        printNn(5);


        //16 Распечатать последовательность чисел:
        //0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25
        printTCNumber();
        for (int i = 0; i < 26; i++) {
            if (i == 0) {
                System.out.print(i + ", ");
            } else if (i % 3 == 0) {
                System.out.print(i + ", ");
            } else if (i % 5 == 0 && i != 25) {
                System.out.print(i + ", ");
            }
            if (i == 25) {
                System.out.println(i);
            }

        }
    }
}
