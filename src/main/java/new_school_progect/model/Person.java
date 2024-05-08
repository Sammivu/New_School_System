package new_school_progect.model;

import new_school_progect.enums.Genda;

public class Person {
    private  String name;
    private int age;
    private Genda genda;

    //Constructor generated
    public Person(String name, int age, Genda genda) {
        this.name = name;
        this.age = age;
        this.genda = genda;
    }

    // Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Genda getGender() {
        return genda;
    }

    public void setGender(Genda genda) {
        this.genda = genda;
    }


}
