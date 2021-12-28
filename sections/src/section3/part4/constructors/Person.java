package section3.part4.constructors;

public class Person {
    int id;
    Person(int newId) {
        id = newId;
    }

    Person p = new Person(1001);
    //It is the correct way to do it^^ (with a constructor)
}
