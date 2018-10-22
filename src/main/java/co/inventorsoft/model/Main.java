package co.inventorsoft.model;

import co.inventorsoft.StreamHomework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 17));
        persons.add(new Person("John1", 31));
        persons.add(new Person("John2", 32));
        persons.add(new Person("John3", 18));

        StreamHomework hw = new StreamHomework();
        hw.extractTeenagers(persons);


        List<String> emails = new ArrayList<>(Arrays.asList("a@gmail.com", "b@gmail.com", "c@gmail.com", "a@gmail.com", "d@gmail.com", null));
        List<User> users = hw.createUsers(emails);

        System.out.println(hw.groupByEmail(users));

        System.out.println(hw.groupByAge(persons));

        System.out.println(hw.collectDistinctNames(persons));


    }
}
