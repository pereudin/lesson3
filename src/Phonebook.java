import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {
    HashMap<String, ArrayList> phonebook;

    public Phonebook() {
        phonebook = new HashMap<>();
    }

    void add(String name, String num) {
        if(phonebook.containsKey(name)) {
            phonebook.get(name).add(num);
        } else {
            ArrayList<String> number = new ArrayList<>();
            number.add(num);
            phonebook.put(name, number);
        }
    }

    void get(String name) {
        ArrayList<String> def = new ArrayList<>();
        def.add("Фамилия отсутствует");
        System.out.println(name + ": " + phonebook.getOrDefault(name, def));
    }
}