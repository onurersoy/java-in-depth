package section3.part2.arrays;

public class Student1 {
    static void arrays() {
        int[] studentIds = new int[4];
        //Array is an object and "studentIds" is an object reference
        //Always use a plural name for an array because it stores multiple values
        //int = the type of array
        //[] = it means it is an array
        //[4] = total count of elements in the array
        //int studentIds[] = new int[4]; >> this notation is also okey
        studentIds[0] = 10;
        studentIds[1] = 20;
        studentIds[2] = 30;
        studentIds[3] = 40;
        System.out.println("Student ID #1: " + studentIds[0]);
        System.out.println("Student ID #2: " + studentIds[1]);
        System.out.println("Student ID #3: " + studentIds[2]);
        System.out.println("Student ID #4: " + studentIds[3]);
        }

}
