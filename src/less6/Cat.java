package less6;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cat {

    protected String name;
    String ownerName;
    private LocalDate birthDate;
    private Set<Vaccination> vaccinations;

    public Cat() { // конструктор без параметров, если нет другого конструктора, по умолчанию java создаст иманно такой
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, String owner) {
        this.ownerName = owner;
        this.name = name;
        this.vaccinations = new HashSet<>();
    }

    public Cat(LocalDate birthDate) {
        this.name = "Бездомный";
        this.ownerName = null; // по ум. все равно будет null, можно не указывать
        this.birthDate = birthDate;
    }

    public void doVaccine(String vaccineName, LocalDate vaccinationDate) {
        Vaccination vaccination = new Vaccination(vaccineName, vaccinationDate);
        this.vaccinations.add(vaccination);
    }

    public Set<Vaccination> getVaccinations() {
        return vaccinations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        int random = (int) (Math.random() * 10);
        this.name = name + " " + random;
    }
}
