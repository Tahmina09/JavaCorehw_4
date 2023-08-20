import java.time.LocalDate;
import java.time.Period;

public class Customer {
    private static LocalDate currentDate = LocalDate.now();
    private String name;
    private LocalDate birthdate;
    private String phone;

    Customer (String name, LocalDate birthdate, String phone) {
        this.name = name;
        this.birthdate = birthdate;
        this.phone = phone;
    }

    public void setName() { this.name = name; }

    public void setPhone(String phone) { this.phone = phone; }

    public String getName() { return name; }

    public String getPhone() { return phone; }

    public int getAge( LocalDate birthDate, LocalDate currentDate) {
        return Period.between(birthDate, currentDate).getYears();
    }

    @Override
    public String toString() {
        return "Customer {name = ' " + name + '\'' +
                "birthdate = ' " + birthdate + '\'' +
                "phone = ' " + phone + "'}";
    }
}
