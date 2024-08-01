package less3;

import java.util.*;

public class Lesson3 {

    public static void main(String[] args) {
//        Task0.isEqual(Task0.s1, Task0.s6);
//        Task1.extracted2();

        // String[] s = new String[10];
        // -> создать массив больше -> скопировать из меньшего в больший -> добавить новое
        // ArrayList(16) -> 17-ый добавить то верхняя логика выполнится автоматически

//        Object b = true;
//        System.out.println(b.equals(true));

//        List<String> list = new ArrayList<>(16);
//
//        list.add("awearfae");
////        list.add(1);
////        list.add(true);
//        list.add("awearewrwaQ3fae");

//        for (String o : list) {
////            String s = "";
////            if (o instanceof String) {
////                s = (String) o;
////            }
////            try {
////                s = (String) o;
////            } catch (ClassCastException e) {
////                continue;
////            }
//
//            int length = o.length();
//            System.out.println(length);
//        }

//        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        List<Integer> integers2 = new ArrayList<>(integers);
//
//        System.out.println(integers2);
//        integers2.removeAll(integers);
//
//        System.out.println(integers2.contains(51));
        //count = 0, while(set.size() != 10 -> случайное

        List<String> books0 = List.of("proza", "War and peace", "12 stylev");
        List<String> books1 = List.of("poetry", "Borodino", "E Onegin");

        Task4.fillLibrary(books0);
        Task4.fillLibrary(books1);

        System.out.println(Task4.getLibrary());
    }

}

class Task4 {
    private static final List<List<String>> LIBRARY = new ArrayList<>();

    public static List<List<String>> fillLibrary(List<String> genreAndBooks) {
        LIBRARY.add(genreAndBooks);
        return LIBRARY;
    }

//    public static List<List<String>> fillLibrary0(List<List<String>> genresAndBooks) {
//        LIBRARY.addAll(genresAndBooks);
//        return LIBRARY;
//    }

    static List<List<String>> copy = new ArrayList<>(LIBRARY);
    public static List<List<String>> getLibrary() {
        return copy;
    }
}

class Task3 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<String>();
        list.add("A");
        list.add("BAWEFEW");
        list.add(23);
        System.out.println(list);
    }
}

class Task2 {
    public static void main(String[] args) {
        task2();
    }

//    public static void main(String[] args) {
//        // Создаем массив названий планет Солнечной системы
//        String[] planets = {
//                "Меркурий", "Венера", "Земля", "Марс",
//                "Юпитер", "Сатурн", "Уран", "Нептун"
//        };
//
//        // Создаем список для случайного заполнения планет
//        List<String> planetList = new ArrayList<>();
//        Random random = new Random();
//
//        // Заполняем список случайными названиями планет с повторениями
//        for (int i = 0; i < 20; i++) { // Заполняем 20 планет
//            int index = random.nextInt(planets.length); // Генерируем случайный индекс
//            planetList.add(planets[index]); // Добавляем планету в список
//        }
//
//        // Выводим список планет
//        System.out.println("Список планет: " + planetList);
//
//        // Списки для хранения уникальных планет и их количества повторений
//        List<String> uniquePlanets = new ArrayList<>();
//        List<Integer> counts = new ArrayList<>();
//
//        // Подсчитываем количество повторений каждой планеты
//        for (String planet : planetList) {
//            int index = uniquePlanets.indexOf(planet); // Находим индекс планеты в уникальных планетах
//            if (index == -1) { // Если планета еще не добавлена в уникальные планеты
//                uniquePlanets.add(planet); // Добавляем планету
//                counts.add(1); // Устанавливаем счетчик для этой планеты
//            } else { // Если планета уже существует в уникальных планетах
//                counts.set(index, counts.get(index) + 1); // Увеличиваем счетчик
//            }
//        }
//
//        // Выводим количество повторений каждой планеты
//        System.out.println("Количество повторений каждой планеты:");
//        for (int i = 0; i < uniquePlanets.size(); i++) {
//            System.out.println(uniquePlanets.get(i) + ": " + counts.get(i));
//        }
//    }

    public static void task2() {
        // Создаем массив названий планет Солнечной системы
        String[] planets = {
                "Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Saturn", "Uran", "Neptune", "Pluto",
        };

        // Создаем список для случайного заполнения планет
        List<String> planetList = new ArrayList<>();
        Random random = new Random();

        // Заполняем список случайными названиями планет с повторениями
        for (int i = 0; i < 20; i++) { // Заполняем 20 планет
            int index = random.nextInt(planets.length); // Генерируем случайный индекс
            planetList.add(planets[index]); // Добавляем планету в список
        }

        // Выводим список планет
        System.out.println("Список планет(Planets list): " + planetList);

        // Списки для хранения уникальных планет и их количества повторений
        List<String> uniquePlanets = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();

        // Подсчитываем количество повторений каждой планеты
        for (String planet : planetList) {
            int index = uniquePlanets.indexOf(planet); // Находим индекс планеты в уникальных планетах
            if (index == -1) { // Если планета не добавлена
                uniquePlanets.add(planet); // Добавляем планету
                counts.add(1); // Устанавливаем счетчик для новой планеты
            } else {
                counts.set(index, counts.get(index) + 1); // Увеличиваем счетчик для существующей планеты
            }
        }

        // Выводим количество повторений каждой планеты
        System.out.println("Количество повторений каждой планеты:");
        for (int i = 0; i < uniquePlanets.size(); i++) {
            System.out.println(uniquePlanets.get(i) + ": " + counts.get(i));
        }

        List<String> strings = removeEqualElements(planetList);
        System.out.println("Unigue: " + strings);
    }

    public static void getPlanets(List<String> planets) {
        List<String> uniquePlanets = new ArrayList<>();
        List<Integer> planetCounts = new ArrayList<>();

        for (String planet : planets) {
            int position = uniquePlanets.indexOf(planet); // если -1 значит не найдено
            if (position >= 0) {
                planetCounts.set(position, planetCounts.get(position)  + 1);
            } else {
                uniquePlanets.add(planet);
                planetCounts.add(1);
            }
        }

        printPlanetCount(uniquePlanets, planetCounts);

        for (String p: uniquePlanets ) {
            if (!p.trim().endsWith("1")) {
                uniquePlanets.remove(p);
            }
        }

        printPlanetCount(uniquePlanets, planetCounts);

    }

    public static List<String> removeEqualElements(List<String> elements) {
        elements.sort(String::compareTo);

        for (int i = 1; i < elements.size(); i++) {

            if (elements.get(i).equals(elements.get(i - 1))) {
                elements.remove(elements.get(i));
                i--;
            }
        }
        System.out.println(elements);
        return elements;
    }

    private static void printPlanetCount(List<String> planets, List<Integer> counts) {
        for (int i = 0; i < planets.size(); i++) {
            System.out.printf("%-10s : %3d%n", planets.get(i), counts.get(i));
        }
    }

    public static void planets2for(List<String> planets) {
        StringBuilder builder = new StringBuilder();
        List<String> result = new ArrayList<>();
        for (int i = 0; i < planets.size(); i++) {
            if (!result.contains(planets.get(i))) {
                result.add(planets.get(i));
                int counter = 0;
                for (int j = 0; j < planets.size(); j++) {
                    if (planets.get(j).equals(planets.get(i))) counter ++;
                }
                builder.append(planets.get(i)).append(" : ").append(counter).append(", ");
            }
        }
        System.out.println(builder);
    }

}

class Task1 {

    public static void extracted1() {
        // Создаем список для хранения случайных чисел
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        // Заполняем список десятью случайными числами от 1 до 100
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(96) + 5); // Генерируем числа от 5 до 100
//            numbers.add(random.nextInt(100) + 1); // Генерируем числа от 1 до 100
        }

        // Выводим несортированный список на экран
        System.out.println("Несортированный список: " + numbers);

        // Сортируем список
        Collections.sort(numbers, Collections.reverseOrder());

        // Выводим отсортированный список на экран
        System.out.println("Отсортированный список: " + numbers);
    }

    public static void extracted2() {
        // Создаем список для хранения случайных чисел
        List<Integer> numbers = new ArrayList<>();

        // Заполняем список десятью случайными числами от 1 до 100
        for (int i = 0; i < 10; i++) {
//            int randomNum = (int)(Math.random() * 96) + 5; // Генерируем числа от 5 до 100
            int randomNum = (int)(Math.random() * 100) + 1; // Генерируем числа от 1 до 100
            numbers.add(randomNum);
        }

//        numbers.sort(Comparator.naturalOrder());
        // TODO Выводим несортированный список на экран
        System.out.println("Несортированный список: " + numbers);

        // Сортируем список
        Collections.sort(numbers);

        // Выводим отсортированный список на экран
        System.out.println("Отсортированный список: " + numbers);
    }

}

class Task0 {

    public static String s1 = "hello";
    public static String s2 = "hello";

    public static String s3 = s1;

    public static String s4 = "h" + "e" + "l" + "l" + "o"; //"hello"
    public static String s5 = new String("hello");
    public static String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

    public static void isEqual(String arg0, String arg1) {
//        s1 = s1 + "ldfjghoaergb";
        if (arg0 == arg1) {
//            "a" == "a"; //false
            System.out.println("Равны как ссылки - 1");
        } else if (arg0 != arg1) {
            System.out.println("Не равны как ссылки - 0");
        }
        if (arg0.equals(arg1)) {
            System.out.println("Равны как значения - 11");
        } else if (!arg0.equals(arg1)) {
            System.out.println("Не равны как значения - 00");

        }
    }

}