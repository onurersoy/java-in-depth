package section3.part3.methodDetails;

public class methodIntro3 {

    static double sum(double x, double y) {
        return (x + y);
    }

    static double avg(double x, double y) {
        double sum = sum(x, y);
        return sum/2;
    }

    public static void main(String[] args) {
        //float d = sum(3.0f, (float) 2.0);
        //An errorerd instance since the values of 'x + y' might be at the outside of float data type's boundries^^

        //Find below the correction of above instance:
        float d = (float) sum(3.0f, (float) 2.0);
        System.out.println(d);

        double d2 = avg(3.0, 2.0);
        System.out.println(d2);

    }
}
