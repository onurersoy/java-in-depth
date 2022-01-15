package section4.part1.operators.control.flows;

import java.util.Arrays;

public class StudentUtil {

    public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) {
        double[] gpaValues = new double[studentIdList.length];
        //Whatever you gonna return in method, define an empty one of it on the 1st line after method's 1st line^^
        for (int i = 0; i < studentIdList.length; i++) {
            double sum = 0;
            double gpa = 0;
            for (int j = 0; j < studentsGrades[i].length; j++) {
                if (studentsGrades[i][j] == 'A') {
                    sum += 4;
                    //studentsGrades[i][j] = 4;
                } else if (studentsGrades[i][j] == 'B') {
                    sum += 3;
                    //studentsGrades[i][j] = 3;
                } else if (studentsGrades[i][j] == 'C') {
                    sum += 2;
                    //studentsGrades[i][j] = 2;
                }
                //System.out.println("\nStudent ID: " + studentIdList[i] + " & Student Sum of Grades After Each Exam: " + sum);
            }
            //sum = sum + studentsGrades[i][j];
            //System.out.println("\nStudent ID: " + studentIdList[i] + " & Student Total Sum of Grades: " + sum);
            gpa = sum / studentsGrades[i].length;
            System.out.println("Student ID: " + studentIdList[i] + " & Student GPA: " + gpa);
            gpaValues[i] = gpa;
        }
        System.out.println("\nStudent GPA Values Array: " + Arrays.toString(gpaValues));
        return gpaValues;
    }

    public static int[] getStudentsByGPA(double lowerLimit, double higherLimit, int[] studentIdList, char[][] studentsGrades) {
        int[] studentsByGPA = new int[studentIdList.length];
        //Whatever you gonna return in method, define an empty one of it on the 1st line after method's 1st line^^
        // perform parameter validation. Return null if passed parameters are not valid
        double[] gpaValues = new double[studentIdList.length];
        gpaValues = calculateGPA(studentIdList, studentsGrades);
        int index = 0;
        int exceptionalGPA = 0;
        for (int i = 0; i < gpaValues.length; i++) {
            if (gpaValues[i] >= lowerLimit && gpaValues[i] <= higherLimit) {
                studentsByGPA[index] = studentIdList[i];
                index++;
            } else {
                exceptionalGPA += 1;
                //TODO: ASK IT!!!
            }
        }
        System.out.println("Successfull Students By Id: " + (Arrays.toString(studentsByGPA)));
        return studentsByGPA;

        // invoke calculateGPA
        // construct the result array and return it. You would need an extra for loop to compute the size of the resulting array

    }

    public static void main(String[] args) {
        int[] studentIdList1 = new int[] {123, 456, 788, 944};
        char[][] studentGrades1 = new char[][] {{'A', 'A', 'A', 'A'}, {'B', 'B', 'B'}, {'C', 'C', 'C', 'C'}, {'A', 'A', 'B', 'B'}};
        StudentUtil.getStudentsByGPA(3, 4, studentIdList1, studentGrades1);
    }

}
