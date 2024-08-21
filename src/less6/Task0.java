package less6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task0 {

    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        System.out.println(fillSet(treeSet));

    }

    private static Set<Integer> fillSet(Set<Integer> set) {

        set.add(1427855);
        set.add(565456435);
        set.add(34345343);
        set.add(453533);
        set.add(4353);
        set.add(4353);
        set.add(4353);
        set.add(4353);

        set.add(4353534);
        return set;
    }
}
