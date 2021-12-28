package section3.part4.constructors;

public class Person3 {
    int id;

    Person3(int newId) {
        id = newId;
    }

    Person3() {
    }

    Person3 p3a = new Person3(1001);
    Person3 p3b = new Person3();
}
