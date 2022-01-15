package section4.part1.operators.control.flows;

public class StudentNotes {

    double lower;
    double higher;
    int[] studentIdList;
    char[][] studentsGrades;

    StudentNotes (double lower, double higher, int[] studentIdList, char[][] studentsGrades) {
        this.lower = lower;
        this.higher = higher;
        this.studentIdList = studentIdList;
        this.studentsGrades = studentsGrades;
    }

    int[] studentIdList1 = new int[] {123, 456, 789};
    char[][] studentGrades1 = new char[][] {{'A', 'A', 'A', 'A'}, {'B', 'B', 'B'}, {'C', 'C', 'C', 'C'}};
    StudentNotes studentNotes1 = new StudentNotes(3, 4.0, new int[] {123, 456, 789}, new char[][] {{'A', 'A', 'A', 'A'}, {'B', 'B', 'B'}, {'C', 'C', 'C', 'C'}});

}
