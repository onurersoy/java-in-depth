package section4.part1.operators.control.flows;

public class ifStatement2 {

    static boolean ifStatementC() {
        boolean approved = false;

        int age = 27;
        int salary = 60000;
        boolean hasBadCredit = false;

        //IF Type #3
        if (age >= 25 && age <= 35 && salary >= 50000) {
            approved = true;
            System.out.println("age >= 25 && age <= 35 && salary >= 50000");
        } else {
            System.out.println("else block");
        }
        System.out.println("outside if");
        return approved;
    }

    public static void main(String[] args) {

    }
}
