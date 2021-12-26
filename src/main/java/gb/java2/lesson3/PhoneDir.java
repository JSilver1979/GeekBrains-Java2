package gb.java2.lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDir {
    private Map<String, List<String>> phoneMap = new HashMap<String, List<String>>();

    public void add(String name, String phone) {
        if (!phoneMap.containsKey(name)) {
            phoneMap.put(name, new ArrayList<>());
        }
        phoneMap.get(name).add(phone);
    }

    public void get(String name) {
        if (phoneMap.containsKey(name)) {
            System.out.println("Found info:");
            System.out.println("Name: " + name + ";");
            for (int i = 0; i < phoneMap.get(name).size(); i++) {
                System.out.println("Phone: " + phoneMap.get(name).get(i));
            }
        } else {
            System.out.println("No such name in directory");
        }
    }
}
