package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Exercise23 {

    public static void main(String[] args) {
        // Objetivo 1
        Map<String, Person> m = createHashMap();

        // Objetivo 2
        PoliceOfficer po = new PoliceOfficer("Charles", "Boyle", "B-99");
        System.out.println("Added Person: " + addMapValue(m, "police", po));

        // Objetivo 3
        printMapValues(m);


    }

    public static Map<String, Person> createHashMap() {
        Map<String, Person> m = new HashMap<String, Person>();

        m.put("person", new Person("John", "Smith"));
        m.put("teacher", new Teacher("María", "Montessori", "Educación"));
        m.put("police", new PoliceOfficer("Jake", "Peralta", "B-99"));
        m.put("doctor", new Doctor("Gregory", "House", "Nefrología e infectología"));

        return m;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {
        map.put(key, value);
        return value;
    }

    public static void printMapValues(Map<String, Person> map) {
        for (Map.Entry<String, Person> entry: map.entrySet()){
            entry.getValue().getDetails();
        }
    }
    
}
