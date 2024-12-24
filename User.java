
import java.time.LocalDate;


public class User {
    private String name;
    private LocalDate dob;

    // Default constructor
    public User() {
        this.name = null;
        this.dob = LocalDate.now();
    }

    // Parameterized constructor
    public User(String name, int year, int month, int day) {
        this.name = name;
        this.dob = LocalDate.of(year, month, day);
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(int year, int month, int day) {
        this.dob = LocalDate.of(year, month, day);
    }

    // Display user info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Birthday: " + dob);
    }

    // Check if today is the user's birthday
    public boolean isBirthday() {
        LocalDate today = LocalDate.now();
        return today.getMonthValue() == dob.getMonthValue() && today.getDayOfMonth() == dob.getDayOfMonth();
    }

    // Display happy birthday message
    public void displayHappyBirthday() {
        if (isBirthday()) {
            System.out.println("Happy birthday " + this.name + "!");
        }
    }
}














