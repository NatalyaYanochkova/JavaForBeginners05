package lessons;

public class Lesson4 {

    public static void main(String[] args) {
        //int ageA;
        //int ageN;
        //int ageS;

        //(ageA>ageS)&&(ageN>ageS)
        int a = 0;
        int b = 77;
        int c = 25;
        System.out.println(5 > 7);
        System.out.println((a > b) || (a < b));


        if ((a > b) || (b < c)) {
            a = 7;
            int sum = b + c;
            System.out.println(a);
            System.out.println(sum);
        } else {
            a = 10;
            System.out.println(a);
        }

//unit test
        int n=43;
        if ((n % 2 != 0) && (n % 3 == 0)) {
            n = 0;
        } else if ((n % 2 != 0) && (n % 3 != 0)) {
            n = 10;
        } else if ((n % 2 == 0) && (n % 100 == 0)) {
            n = 100;
        }
        int expectedResult = 10;
        int actualResult = n;

        if(n== expectedResult){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }

        Integer x=12;
        Integer y=20;
        System.out.println(x.equals(y));
        System.out.println(!(x.equals(y)));

        String hi1 = "Hi";
        String hi2 ="hi";
        System.out.println(hi1.equals(hi2));

    }
}
