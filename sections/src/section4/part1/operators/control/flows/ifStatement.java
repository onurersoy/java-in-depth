package section4.part1.operators.control.flows;


import java.text.NumberFormat;
import java.util.Locale;

public class ifStatement {
    private final static NumberFormat decimalFormat = NumberFormat.getInstance(Locale.getDefault());
    private final static NumberFormat decimalFormat2 = NumberFormat.getInstance(Locale.FRANCE);

    static boolean ifStatementA() {
        boolean approved = false;

        int age = 27;
        int salary = 60000;
        boolean hasBadCredit = false;

        //IF Type #1
        if (age >= 25 && age <= 35 && salary >= 50000) {
            approved = true;
            System.out.println("age >= 25 && age <= 35 && salary >= 50000");
        }
        System.out.println("outside if");
        return approved;
        //A statement coming after ‘return’ is never executed; it’s called as ‘unreachable argument/statement’. F.e.:
        //System.out.println("outside if");
    }

    public static Double doubleParser(String value) {
        Double result = null;
        if (null != value) {
            try {
                result = decimalFormat2.parse(value).doubleValue();
            } catch (Exception ignored) {

            }
        }
        return result;
    }



    public static void main(String[] args) {
        String amount = "205,67";
        Double result = doubleParser(amount);
        System.out.println(result);
    }
}
