package section3.part2.arrays;

public class Student4 {
    int id;
    String name;
    int age;
    int score;

    public static void main(String [] args) {
        //irrelevant instance starting
        Student4 studentA = new Student4();
        studentA.id = 10;
        studentA.name = "James";
        studentA.age = 15;
        studentA.score = 100;

        Student4 studentB = new Student4();
        studentB.id = 20;
        studentB.name = "Mary";
        studentB.age = 25;
        studentB.score = 200;

        Student4 studentC = new Student4();
        studentC.id = 30;
        studentC.name = "Robert";
        studentC.age = 35;
        studentC.score = 300;

        Student4 studentD = new Student4();
        studentD.id = 40;
        studentD.name = "Jennifer";
        studentD.age = 45;
        studentD.score = 400;
        //irrelevant instance ending


        //***It is similar with arrays!
        //****An object that an array of a class "Student4":
        Student4[] students = new Student4[4]; //1st type of notation

        /*
        Similar with above line: (2nd type of notation)
        Student4[] students = new Student4[] {new Student4(), new Student4(), new Student4()};
        */

        /*
        Similar with above line: (3rd type of notation)
        Student4[] students = {new Student4(), new Student4(), new Student4()};
        */

        students[0] = new Student4();
        students[1] = new Student4();
        students[2] = new Student4();
        students[3] = new Student4();

        students[0].name = "James";
        students[1].name = "Mary";
        students[2].name = "Robert";
        students[3].name = "Jennifer";

        System.out.println("Student 1: " + students[0].name);
        System.out.println("Student 2: " + students[1].name);
        System.out.println("Student 3: " + students[2].name);
        System.out.println("Student 4: " + students[3].name);
    }

}
