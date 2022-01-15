package section4.part1.operators.control.flows;

public class ifStatement {

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

    public static void main(String[] args) {

    }
}
