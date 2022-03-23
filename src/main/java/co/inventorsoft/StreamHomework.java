package co.inventorsoft;

import co.inventorsoft.model.Person;
import co.inventorsoft.model.User;

import java.util.List;
import java.util.Map;


public class StreamHomework {
    public List<Person> extractTeenagers(final List<Person> people) {
        return people.stream()
                .filter(RandomeNameOfParametr -> RandomeNameOfParametr.getAge() >= 13 && RandomeNameOfParametr.getAge() <= 19)
                .collect(java.util.stream.Collectors.toList());
    }

    public List<User> createUsers(final List<String> emails) {
        return emails.stream()
                .distinct()
                .filter(java.util.Objects::nonNull)
                .map(User::new)
                .collect(java.util.stream.Collectors.toList());
    }

    public Map<String, User> groupByEmail(final List<User> users) {

        return users.stream()
                .collect(java.util.stream.Collectors.toMap(User::getEmail, user -> user));
    }

    public Map<Integer, List<Person>> groupByAge(final List<Person> people) {
        return people.stream()
                .collect(java.util.stream.Collectors.groupingBy(Person::getAge));
    }

    public String collectDistinctNames(final List<Person> people) {
        return people.stream()
                .map(Person::getName)
                .distinct()
                .collect(java.util.stream.Collectors.joining(", ", "Distinct names: ", "!"));
    }
}
