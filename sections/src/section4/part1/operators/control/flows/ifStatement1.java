package section4.part1.operators.control.flows;

public class ifStatement1 {

    static boolean ifStatementB() {
        boolean approved = false;

        int age = 27;
        int salary = 60000;
        boolean hasBadCredit = false;
        double interest;

        //IF Type #2
        if (age >= 25 && age <= 35 && salary >= 50000)
            /*The first line with a code after an 'IF argument' (13th>14th line in this example) is always exectuted
            with 'if'; we do not have to use it like: 'if () {}'. We use it that way so our code is easy to read.
            Same as the example in class  'if Statement'.
             */
            approved = true; //This line is with 'if'.
            interest = 0.09; //The rule only applies for the first line after 'if' so this line is not executed with 'if'.
            System.out.println("age >= 25 && age <= 35 && salary >= 50000");

        System.out.println("outside if");
        return approved;
    }

    public static void main(String[] args) {

    }
}
