package less6;

import java.time.LocalDate;

public class Lesson6 {

    public static void main(String[] args) {

//        Object
        Cat barsic = new Cat("Барсик" , "Василий");


        Cat murzic = new Cat("Мурзик");
        Cat murzic2 = new Cat("Мурзик 2");
        Cat bezdomny = new Cat(LocalDate.of(2021, 3, 11));

        barsic.setName("БАРС");

        System.out.println(barsic.name);

        System.out.println(murzic2.name);

        barsic.doVaccine("Чумка", LocalDate.of(2021, 3, 11));
        barsic.doVaccine("Чумка", LocalDate.of(2021, 3, 11));
        barsic.doVaccine("Столбняк", LocalDate.now());

        System.out.println(barsic.getVaccinations());
    }

}
