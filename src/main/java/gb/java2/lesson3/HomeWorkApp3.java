package gb.java2.lesson3;

import java.util.HashMap;
import java.util.Map;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        String[] wordsArray = {"Moscow", "New York", "Tokyo", "Sidney", "Madrid", "London", "Paris",
                "Vienna", "Athens", "Mexico", "Tokyo", "Vienna", "Moscow", "London", "Tokyo",
                "Moscow", "Oslo", "Berlin", "Abu Dhabi", "London"};
        Map<String, Integer> wordsMap = new HashMap<>();

        for (String city : wordsArray) {
            Integer counter = wordsMap.get(city);
            if (counter == null) {
                wordsMap.put(city,1);
            } else {
                wordsMap.put(city, ++counter);
            }
        }
        wordsMap.forEach((k,v) -> System.out.println(k + ": " + v));
//  2nd Task
        System.out.println("");
        PhoneDir myDir = new PhoneDir();
        myDir.add("Ivanov", "123344");
        myDir.add("Ivanov","09090909");
        myDir.add("Petrov","34827632");
        myDir.add("Sidorov","2233455");
        myDir.get("Ivanov");
    }
}
