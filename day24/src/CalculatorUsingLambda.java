//Calculator Using Lambda
@FunctionalInterface
interface cal{
    int result(int a, int b);
}

public class CalculatorUsingLambda {
    public static void main(String[] args) {

        cal add=(a,b)->a+b;
        cal minus=(a,b)->a-b;
        cal multiple=(a,b)->a*b;
        cal division=(a,b)->a/b;
        System.out.println(add.result(2,3));
        System.out.println(minus.result(3,1));
        System.out.println(multiple.result(3,8));
        System.out.println(division.result(4,2));
    }

    public static int result(int a, int b,cal c) {
        return c.result(a,b);
    }
}
