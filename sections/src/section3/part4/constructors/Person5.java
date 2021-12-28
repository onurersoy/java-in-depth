package section3.part4.constructors;

public class Person5 {

    int id;
    String name;
    String gender;
    int age;
    long phone;
    int nextId;

    void compute() {
        int nextId = id + 1;

        System.out.println("\nid: " + id);
        System.out.println("\nname: " + name);
        System.out.println("\ngender: " + gender);
        System.out.println("\nid:age " + age);
        System.out.println("\nid:phone " + phone);
        System.out.println("\nid:newId " + nextId);
    }

    //Non-args constructor:
    Person5 () {}

    Person5(int newId, String newName, String newGender, int newAge, long newPhone) {
        id = newId;
        name = newName;
        gender = newGender;
        age = newAge;
        phone = newPhone;

        //Where we invoke our method in the constructor:
        compute();
    }

    public static void main(String[] args) {
        Person5 p5 = new Person5(1000, "John", "Male", 15, 538_111_22_33L);

        /*
        >> By using a constructor, we skipped this pile of code >>
        Person5 p5 = new Person5();
        p5.id = 1000;
        p5.name = "John";
        p5.gender = "Male";
        p5.age = 15;
        p5.phone =  538_111_22_33L;

        p5.compute();
         */
    }

}
