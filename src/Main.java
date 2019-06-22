import java.util.*;

public class Main {
    public static void main(String[] args) {
        // выполнение задания 1 к уроку 3 (строки 6-40)
        String[] cars = {
                "BMW",
                "Volkswagen",
                "Mercedes",
                "Toyota",
                "Renault",
                "Mazda",
                "Nissan",
                "Skoda",
                "Volkswagen",
                "Toyota",
                "LADA",
                "Haval",
                "Geely",
                "Toyota",
                "BMW"
        };

        Set<String> carsSet = new HashSet<>();
        for (int i = 0; i < cars.length; i++) {
            carsSet.add(cars[i]);
        }
        System.out.println(carsSet);

        Map<String, Integer> carsMap = new HashMap<>();
        for (int i = 0; i < cars.length; i++) {
            Integer n = 1;
            carsMap.put(cars[i], n);
            for (int j = 0; j < cars.length; j++) {
                if(cars[i].equals(cars[j])) {
                    carsMap.put(cars[i], n++);
                }
            }
        }
        System.out.println(carsMap);

        // выполнение задания 2 к уроку 3 (строки 43-51 + класс Phonebook)
        Phonebook phonebook = new Phonebook();
        phonebook.add("Иванов", "+7(999) 555-44-22");
        phonebook.add("Сидоров", "+7(988) 888-77-11");
        phonebook.add("Иванов", "+7(977) 123-25-66");
        phonebook.add("Петров", "+7(495) 369-71-45");
        phonebook.add("Петров", "+7(821) 555-55-55");
        phonebook.add("Иванов", "+7(922) 235-56-99");

        phonebook.get("Иванов");

    }
}
