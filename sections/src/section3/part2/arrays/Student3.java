package section3.part2.arrays;

public class Student3 {

    static int[] studentIds3; //declaration statement (it initialized null here)
    //We can declare an array in a class body, then assign it in a method (4th type of notation)^^

    static void arrays() {
       studentIds3 = new int[] {100, 200, 300, 400}; //assignment statement (then it is re-initialized)

        /*
        studentIds3 = {100, 200, 300, 400};
        This syntax can only be used as a declaration statement; can't be used as an assignment statement^^
        We get a compilation error if we use it this way
        (check Student2 > 3rd type of notation for a correct usage)
        */

        System.out.println("Student ID #1: " + studentIds3[0]);
        System.out.println("Student ID #2: " + studentIds3[1]);
        System.out.println("Student ID #3: " + studentIds3[2]);
        System.out.println("Student ID #4: " + studentIds3[3]);

        System.out.println("# of student ids: " + studentIds3.length);
        /*
        This line will return the number of elements inside this array "studentIds3".
        "lenght" is not "lenght()" so it is not a method! "lenght()" returns the number of characters in a string.
        "lenght" returns the number of elements.
        */
    }
}
