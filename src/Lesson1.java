import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lesson1 {

    public static void main(String[] args) {

        // int, float, double, char, byte, short, boolean, long


//        User u = new User("Alex", 37);

        List<Integer> ints = List.of(1, -2, 300, 24, 5, 6, 17, 8, 93, 10);

        List<Integer> i = new ArrayList<>();
        i.addAll(ints);

//        x = 0;
//        x = "ajgfuweghfrugw";

        char c = 'f';
        String s = c + c + "";

        System.out.println(i);

        Collections.sort(i);

        System.out.println(i);

//        System.out.println(u.getName());

//        System.out.println("Hello world!");

    }
}

class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}