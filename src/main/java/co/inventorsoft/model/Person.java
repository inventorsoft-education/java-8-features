package co.inventorsoft.model;

public class Person {
    private final String name;
    private final Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public boolean isTeenager(){
       return this.getAge() < 19 && this.getAge() > 13;
    }
}
