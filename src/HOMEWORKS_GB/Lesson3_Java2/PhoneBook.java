package HOMEWORKS_GB.Lesson3_Java2;

import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class PhoneBook {
    private Map<String, Set<String>> book;

    public PhoneBook() {
        this.book = new HashMap<>();
    }

    public void add(String name, String number) {
        if (!book.containsKey(name)) {
            Set<String> numbers = new HashSet<>();
            numbers.add(number);
            book.put(name, numbers);
            return;
        }
        book.get(name).add(number);
    }

    public Set<String> get(String name) {
        return book.getOrDefault(name, Collections.emptySet());
    }

    @Override
    public String toString() {
        return "PhoneBook:" + book;
    }
}
