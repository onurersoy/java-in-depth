package section3.part3.methodDetails;

public class methodIntro {

    //Syntax of a method:

    /*
    returnType methodName(type param1, type param2, ...) {
        ...
        return someValue;
    }
     */

    static double sum(double x, double y) {
        return x + y;
    }

    //Invoking a method:

    /*
    type var = methodName(arg1, arg2, ...)
     */

    public static void main(String[] args) {
        double d = sum(3.0, 2.0);
        System.out.println(d);
    }

}
