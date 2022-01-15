package section4.part1.operators.control.flows;

public class ifStatement4 {

    static boolean ifStatementE() {
        boolean approved = false;

        int age = 27;
        int salary = 60000;
        boolean hasBadCredit = false;

        //IF Type #5
        if (age >= 25 && age <= 35 && salary >= 50000) {
            //We could make it this way as well:
            //approved = true;
            System.out.println("age >= 25 && age <= 35 && salary >= 50000");
            return true; //TODO: ask it!
        } else if (age >= 35 && age <= 45 && salary >= 70000) {
            //approved = true;
            System.out.println("age >= 35 && age <= 45 && salary >= 70000");
            return true;
        }else if (age >= 45 && age <= 35 && salary >= 90000) {
            //approved = true;
            System.out.println("age >= 45 && age <= 35 && salary >= 90000");
            return true;
        //Take a look on 'if' inside 'else' (IF Type #5):
        } else {
            if (age > 55 && !hasBadCredit) {
                //approved = true;
                System.out.println("age > 55 && !hasBadCredit");
                return true;
            }
            System.out.println("else block");
            return false;
        }
        //TODO: why below 2 lines are unreachable?
        //System.out.println("outside if");
        //return approved;
        //TODO: is 'return' always needed?
    }

    public static void main(String[] args) {

    }
}
