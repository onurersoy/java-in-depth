package section3.part3.methodDetails;

public class methodIntro2 {

    /*
    //This one would give a compilation error because returnType's data type (float) is smaller than parameter's
    //data type (double); we have to use type casting!

    static float sum(double x, double y) {
        return x + y;
    }
    */

    //Find below the correction of above instance:
    static float sum(double x, double y) {
        return (float) (x + y);
    }

    public static void main(String[] args) {
        double d = sum(3.0, 2.0);
        //double d = sum(3.0f, (float) 2.0);
        //This one is also okay since 'double > float' and we can assign float type of values on a double variable^^
        System.out.println(d);
    }
}
