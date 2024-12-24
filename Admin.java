
import java.time.LocalDate;


public class Admin extends User {
    // Default constructor
    public Admin() {
        super();
    }

    // Parameterized constructor
    public Admin(String name, int year, int month, int day) {
        super(name, year, month, day);
    }

    // Override the displayInfo() method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("User type: admin.");
    }

    // Overloaded displayInfo method
    public void displayInfo(boolean full) {
        if (full) {
            System.out.println("Name: " + getName());
            System.out.println("Birthday: " + getDob());
            System.out.println("User type: admin.");
            System.out.println("Today's date: " + LocalDate.now());
        } else {
            System.out.println("Name: " + getName());
        }
    }

    // Override the displayHappyBirthday method
    @Override
    public void displayHappyBirthday() {
        if (isBirthday()) {
            int age = LocalDate.now().getYear() - getDob().getYear();
            System.out.println("Happy birthday " + this.getName() + "! You are " + age + "!");
        }
    }
}


   