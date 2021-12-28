package section3.part4.constructors;

public class Person4 {

    int id;
    String name;
    String gender;
    int age;
    long phone;

    Person4(int newId, String newName, String newGender, int newAge, long newPhone) {
        id = newId;
        name = newName;
        gender = newGender;
        age = newAge;
        phone = newPhone;
    }

    Person4 p4 = new Person4(1000, "John", "Male", 15, 538_111_22_33L);

    /*
    >> By using a constructor, we skipped this pile of code >>
    Person4 p4 = new Person4();
    p4.id = 1000;
    p4.name = "John";
    p4.gender = "Male";
    p4.age = 15;
    p4.phone =  538_111_22_33L;
     */
}
