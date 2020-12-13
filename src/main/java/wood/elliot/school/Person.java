package wood.elliot.school;

import java.time.LocalDate;
import java.util.Locale;

public abstract class Person {

    private LocalDate dob;
    private String name;

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toLowerCase();
    }

    @Override
    public String toString() {
        return "Person{" +
                "dob=" + dob +
                ", name='" + name + '\'' +
                '}';
    }
}
