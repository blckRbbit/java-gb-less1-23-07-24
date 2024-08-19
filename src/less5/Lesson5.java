package less5;

import java.util.*;

public class Lesson5 {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();

        map.put(123456, "Иванов");
        map.put(321456, "Васильев");
        map.put(234561, "Петрова");
        map.put(234432, "Иванов");
        map.put(654321, "Петрова");
        map.put(345678, "Иванов");

        List<Map.Entry<Integer, String>> list = new ArrayList<>();

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().equals("Иванов")) list.add(entry);
        }

//        System.out.println(map.size());
//        System.out.println(map.entrySet());
//        System.out.println(map.containsKey(1));
//        System.out.println(map.containsValue("Соловьев"));
//        map.remove(1); //удаляет по ключу весь энтри, если такого ключа нет, ничего не происходит
//        map.computeIfPresent(1, (key, value) -> value);
//        System.out.println(map.get(1));
//        System.out.println(map.get(234432));


//        Map<String, String> map2 = Map.of(
//                "1", "Соловьев", // Entry
//                "32", "Попова"
//        );


    }
}
