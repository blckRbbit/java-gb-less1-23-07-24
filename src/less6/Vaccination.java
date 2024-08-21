package less6;

import java.time.LocalDate;
import java.util.Objects;

public class Vaccination {

    private String vaccineName;
    private LocalDate vaccineDate;

    public Vaccination(String vaccineName, LocalDate vaccineDate) {
        this.vaccineName = vaccineName;
        this.vaccineDate = vaccineDate;
    }

    public void doVaccination(Cat cat, String vaccineName, LocalDate vaccineDate) {
        this.vaccineName = vaccineName;
        this.vaccineDate = vaccineDate;
        cat.getVaccinations().add(new Vaccination(vaccineName, vaccineDate));
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public LocalDate getVaccineDate() {
        return vaccineDate;
    }

    @Override
    public String toString() {
        return "Vaccination{" +
                "vaccineName='" + vaccineName + '\'' +
                ", vaccineDate=" + vaccineDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vaccination that = (Vaccination) o;
        return Objects.equals(vaccineName, that.vaccineName) && Objects.equals(vaccineDate, that.vaccineDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vaccineName, vaccineDate);
    }
}
