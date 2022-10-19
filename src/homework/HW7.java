package homework;

import java.util.Arrays;

public class HW7 {
    public static void main(String[] args) {
        //3. Создать массив catsNames[], заполнить его любыми своими значениями (не такими, как были на уроке).
        String[] catsNames1;
        catsNames1 = new String[8];
        catsNames1 = new String[]{"Dimka", "Lapka", "Kokos", "Vaska", "Pusik", "Snezhok", "Bratish", "Matroskin"};
        //4/В массиве catsNames[] изменить значение элемента с индексом 4 на “Рыжик”,  а значение элемента с индексом 1 на “Черныш”.
        for (int i = 0; i < catsNames1.length; i++) {
            if (catsNames1[i].equals(4)) {
                catsNames1[i] = "Рыжик";
            } else if (catsNames1[i].equals(1)) {
                catsNames1[i] = "Черныш";
            }
        }
        System.out.print(Arrays.toString(catsNames1));
        System.out.println();

        //5.Создать массив catsColors[] и заполнить его значениями (см картинку в презентации).
        //8. Распечатать для массивов catsNames[] и catsColors[]:
        //имя кота в коробке с номером 6
        //имена котов из коробок с четными индексами
        //имена котов из коробок, чьи индексы кратны 4
        //цвет котов из коробок с нечетными индексами
        //цвет котов из коробок, чьи индексы кратны 3, но не кратны 2
        String[] catsNames = new String[]{"Дымка", "Черныш", "Кокос", "Васька", "Рыжик", "Снежок", "Братиш", "Матроскин"};
        System.out.println(catsNames[6]);

        String[] catsColors = new String[8];

        catsColors[0] = "Grey";
        catsColors[1] = "Black";
        catsColors[2] = "Grey";
        catsColors[3] = "Brown";
        catsColors[4] = "Red";
        catsColors[5] = "Grey";
        catsColors[6] = "Red";
        catsColors[7] = "Grey";

        for (int i = 0; i < catsNames.length; i += 2) {
            System.out.print(catsNames[i] + " | ");
        }

        System.out.println();
        for (int i = 0; i < catsNames.length; i += 4) {
            System.out.print(catsNames[i] + " | ");
        }

        System.out.println();
        for (int i = 1; i < catsColors.length; i += 2) {
            System.out.print(catsColors[i] + " | ");
        }

        System.out.println();
        for (int i = 0; i < catsColors.length; i += 3) {
            if (i % 2 != 0) {
                System.out.println(catsColors[i]);
            }
        }

        // 9. Распечатать “Накорми кота!” для всех серых котов
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Grey")) {
                System.out.print("Накорми кота! ");
            }
        }

        System.out.println();

        //7. Создать массив isCatRed[] и заполнить его соответствующими значениями (см картинку в презентации. Red = рыжий)
        // 10. Распечатать “Дай коту воды!” для всех котов со значениями true из массива isCatRed[]
        boolean[] isCatRed = new boolean[8];
        isCatRed[0] = false;
        isCatRed[1] = false;
        isCatRed[2] = false;
        isCatRed[3] = false;
        isCatRed[4] = true;
        isCatRed[5] = false;
        isCatRed[6] = true;
        isCatRed[7] = false;

        for (int i = 0; i < catsColors.length; i++) {
            if (isCatRed[i] == true) {
                System.out.print("Дай коту воды! ");
            }
        }

        System.out.println();
        //6.Создать массив catsAges[] и заполнить его любыми целочисленными валидными значениями.
        int[] catAges = new int[8];
        catAges[0] = 2;
        catAges[1] = 3;
        catAges[2] = 16;
        catAges[3] = 3;
        catAges[4] = 1;
        catAges[5] = 5;
        catAges[6] = 10;
        catAges[7] = 0;

        //11. Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет
        for (int i = 0; i < catAges.length; i++) {
            if (i < 2) {
                System.out.print("Отнеси кота на прививку!" + " ");
            }
        }

        System.out.println();
        //12.Для кота в последней коробке распечатать имя, цвет, возраст
        System.out.println(catsNames[catsNames.length - 1] + " | " +
                catsColors[catsColors.length - 1] + " | "
                + catAges[catAges.length - 1]);

        //13.Распечатать имя, цвет, возраст котов в двух серединных коробках

        System.out.println(catsNames[catsNames.length / 2] + " | " +
                catsNames[catsNames.length / 2 - 1] + " | " +
                catsColors[catsColors.length / 2] + " | " +
                catsColors[catsColors.length / 2 - 1] + " | " +
                catAges[catAges.length / 2] + " | "
                + catAges[catAges.length / 2 - 1]);

        //14.Распечатать имена всех котов, чей возраст больше 2 лет
        if (catsNames.length == catAges.length)
            for (int i = 0; i < catAges.length; i++) {
                if (catAges[i] > 2) {
                    System.out.print(catsNames[i] + " | ");
                }
            }

        System.out.println();
        //15.Распечатать “Накорми … !” , где … - имя кота, а значение isCatRed == true

        if (catsNames.length == isCatRed.length) ;
        for (int i = 0; i < isCatRed.length; i++) {
            if (isCatRed[i] == true) {
                System.out.print("Накорми " + catsNames[i] + "a !" + " | ");
            }
        }
        System.out.println();
        // 16.Распечатать средний возраст котов из массива catsAges[]

        int sum = 0;
        for (int i = 0; i < catAges.length; i++) {
            sum += catAges[i];
        }
        System.out.println(sum / catAges.length);

        //17.Распечатать возраст самого молодого кота
        //18.Распечатать возраст самого старого кота
        int min = 150;
        int max = 0;

        for (int i = 0; i < catAges.length; i++) {
            if (catAges[i] < min) {
                min = catAges[i];
            }
            if (catAges[i] > max) {
                max = catAges[i];
            }
        }
        System.out.println(min + " | " + max);

//19.Распечатать количество серых котов и количество рыжих котов

        int counter = 0;
        for (int i = 0; i < catsColors.length; i++) {
            if (!catsColors[i].equals("Grey")) {
                continue;
            }
            counter++;
        }
        System.out.println("Grey = " + counter);

        int counter1 = 0;
        for (int i = 0; i < catsColors.length; i++) {
            if (!catsColors[i].equals("Red")) {
                continue;
            }
            counter1++;
        }
        System.out.println("Red = " + counter1);
        System.out.println(counter1+counter);

//20.Распечатать имя кота, если кот находится в коробке с нечетным индексом и его возраст не больше 2 лет

    }
}
