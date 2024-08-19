package less5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class Task1 {

    static Map<String, Integer> map = Map.of(
            "I", 1,
            "V", 5,
            "X", 10,
            "L", 50,
            "C", 100,
            "D", 500,
            "M", 1000
    );

    private static int toArabic(String romanNum) { //XV // M,M,X,X,I,I = 2022

        char c = romanNum.charAt(0);
        String key = Character.toString(c);

//        int result = map.get(key); //1000

        int result = 0;


//        String[] split = romanNum.split("");
//
//        List<Integer> list = new ArrayList<>();
//
//        for (String s : split) {
//            list.add(map.get(s));
//        } равно коду ниже

        List<Integer> ints = romanNum.chars() // поток числовых представлений char //        IntStream chars = romanNum.chars();
                .mapToObj(Character::toString) // превращаем в поток строк
                .map(map::get) // по ключу получили значение
                .toList(); // в итоге получили список всех целых чисел переведенных в арабский формат из римского
        // MMXXII -> [1000, 1000, 10, 10, 1, 1] -> 2022

        for (int i = 0; i < ints.size() - 1; i++) {
            if (ints.get(i) >= ints.get(i + 1)) {
                result += ints.get(i);
            } else {
                result -= ints.get(i);
            }
        }
        result += ints.get(ints.size() - 1); // с 21 java можно так :  result += ints.getLast();

        return result;
    }

    // XLIII  LX
    public static void main(String[] args) {
        // ссылка на табл римских чисел https://dpva.ru/Guide/GuideMathematics/RomanNumerals/
        System.out.println(toArabic("IV"));
    }


}
