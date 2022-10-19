package homework;


public class HW3 {
    public static void main(String[] args) {


        int number = 2;
        String numberOfTask = "Task ";
        String line = "_________________________";
        System.out.println(line);
        System.out.println(numberOfTask + number++);
        //Создать переменные a и b типа byte, присвоить им значения из допустимого диапазона.

        byte a = -103;
        byte b = 58;
        System.out.println(line);
        System.out.println(numberOfTask + number++);

        //3 Создать переменные s и t типа short, присвоить им значения с разницей 60000.

        //short s = Short.MAX_VALUE;
        //short t = Short.MAX_VALUE - 60000;
        //System.out.println("s = " +s + " t = " + t);

        short s = 30000;
        short t = -30000;
        int delta = s - t;
        System.out.println(delta);

        System.out.println(line);
        System.out.println(numberOfTask + number++);
        //4 Создать переменную i типа int и присвоить ей минимально возможное значение
        // этого типа. Затем присвоить максимально возможное значение этого типа.
        // Распечатать оба значения в виде таблицы:
        int i = 10;
        i = Integer.MAX_VALUE;
        System.out.println(i);
        i = Integer.MIN_VALUE;
        System.out.println(i);

    }
}
