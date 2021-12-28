package section3.part3.methodDetails;

public class methodIntro4 {
    //How Data Is Passed To Methods In Java?:


    /*
    //1st Instance (Pass by Value: Primitives):
    void updateId(int newId) {
        newId = 1001;
    }

    int id = 1000;
    updateId(id);

    //The result would be '1000'.
    */



   /*
    //2nd Instance (Pass by Value: Object References):
    void updateId(Student s1) {
        s1.id = 1001;
    }

    Student s = new Student();
    s.id = 1000;
    updateId(s);

    //This time, the result would be '1001' (Because we are keeping the reference of an object).
    */



   /*
    //3rd Instance (Pass by Value: Reassignment):
    void updateId(Student s1) {
        s1 = new Student();
        s1.id = 1001;
    }

    Student s = new Student();
    s.id = 1000;
    updateId(s);

    //The result would be '1000' (Because we are creating a new object reference so 'new memory address').
    */



    /*
    //Bonus1:

    intid = 1000;
    int newId = id;
    newId = 1001;

    //The result would be '1001'.
     */



    /*
    //Bonus2:

    Student s = new Student();
    s.id = 1000;
    Student s1 = s;
    s1.id = 1001;

    //The result would be '1001'.
     */

}
