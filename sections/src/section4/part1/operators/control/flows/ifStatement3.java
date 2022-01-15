package section4.part1.operators.control.flows;

public class ifStatement3 {

    static boolean ifStatementD() {
        boolean approved = false;

        int age = 27;
        int salary = 60000;
        boolean hasBadCredit = false;

        //IF Type #4
        if (age >= 25 && age <= 35 && salary >= 50000) {
            approved = true;
            System.out.println("age >= 25 && age <= 35 && salary >= 50000");
        } else if (age >= 35 && age <= 45 && salary >= 70000) {
            approved = true;
            System.out.println("age >= 35 && age <= 45 && salary >= 70000");
        }else if (age >= 45 && age <= 35 && salary >= 90000) {
            approved = true;
            System.out.println("age >= 45 && age <= 35 && salary >= 90000");
        } else {
            /*'else' cannot be before 'else if', otherwise we get a compilation error. 'else' needs to be in the end,
            after 'else if' arguments.*/
            System.out.println("else block");
        }
        System.out.println("outside if");
        return approved;
    }

    public static void main(String[] args) {

    }
}
