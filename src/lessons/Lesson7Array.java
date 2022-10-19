package lessons;

import java.util.Arrays;

public class Lesson7Array {
    public static void main(String[] args) {
        String catName = new String("Rizhik");
        System.out.println(catName);

        String[] catsNames;
        catsNames = new String[8];
        System.out.println(Arrays.toString(catsNames));

        int[] catAges = new int[8];
        System.out.println(Arrays.toString(catAges));

        Integer[] catAges1 = new Integer[8];
        System.out.println(catAges1);
        System.out.println(Arrays.toString(catAges1));

        catsNames = new String[]{"Dimka", "Chernish", "Kokos", "Vaska", "Rizhik", "Snezhok", "Bratish", "Matroskin"};
        System.out.println(Arrays.toString(catsNames));

        catAges[0] = 2;
        catAges[1] = 3;
        catAges[2] = 16;
        catAges[3] = 3;
        catAges[4] = 1;
        catAges[5] = 5;
        catAges[6] = 10;
        catAges[7] = 0;

        System.out.println(Arrays.toString(catAges));

        System.out.println(catsNames[0] + ", " + catsNames[7]);

        System.out.println(catAges[2] + ", " + catAges[4]);
        System.out.println(catAges[2] + catAges[4]);//16+1

        for (int i = 0; i <= 7; i++) {
            System.out.print(catsNames[i] + ", ");
        }

        System.out.println();
        System.out.println(catsNames.length);

        for (int i = 0; i < catsNames.length; i++) {
            System.out.print(catsNames[i] + ", ");
        }

        System.out.println();
        System.out.println(catAges.length);

        for (int i = 0; i < catsNames.length; i++) {
            if (catsNames[i].equals("Rizhik")) {
                System.out.println("Poglad kota!");
                break;//if rizhik 1
            }
        }

        for (int i = 4; i < catsNames.length - 3; i++) {
            System.out.println("Poglad kota esche!");
        }

        for (int i = 0; i < catsNames.length; i++) {
            if (catsNames[i].equals("Rizhik")) {
                System.out.println(i);
            }
        }

        int counter = 0;
        for (int i = 0; i < catsNames.length; i++) {
            if (!catsNames[i].equals("Rizhik")) {
                continue;
            }
            counter++;
        }
        System.out.println(counter);
    }
}
