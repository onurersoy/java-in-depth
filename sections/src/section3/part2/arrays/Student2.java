package section3.part2.arrays;

public class Student2 {
    static void arrays() {
        System.out.println(("\nInside arrays ..."));
        //There is a 2nd type of notation when we create an array:
        int[] studentIds1 = new int[] {10, 20, 30, 40};
        System.out.println("Student ID #1: " + studentIds1[0]);
        System.out.println("Student ID #2: " + studentIds1[1]);
        System.out.println("Student ID #3: " + studentIds1[2]);
        System.out.println("Student ID #4: " + studentIds1[3]);

        //There is a 3rd type of notation when we create an array:
        int[] studentIds2 = {50, 60, 70, 80};
        System.out.println("Student ID #1: " + studentIds2[0]);
        System.out.println("Student ID #2: " + studentIds2[1]);
        System.out.println("Student ID #3: " + studentIds2[2]);
        System.out.println("Student ID #4: " + studentIds2[3]);
    }
}
