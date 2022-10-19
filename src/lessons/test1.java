package lessons;

public class test1 {
    public static double get(double a, double b, double c){


        if ((a*b-c)>0){
            return a*b-c;
        }else {
            return 0;
        }
    }
    public static void main(String[] args) {


        int a = 7 ;
        int b = 4;

        if (a >= b) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }


        double a1 = 3.30;
        double b1 = 2.09;
        double c1 = 1.0;
        System.out.println(get(a1,b1,c1));
    }
}








