


public class LAb05_2 {
    public static void main(String[] args) {
        // Create an instance of User
        User john = new User("John", 2001, 12, 24);
        john.displayInfo(); // Display user's info
        john.displayHappyBirthday(); // Check and display birthday message


    

        // Create an instance of Admin
        Admin nicolas = new Admin("Nicolas", 2001, 12, 25);
        nicolas.displayInfo(); // Basic displayInfo
        nicolas.displayInfo(true); // Full displayInfo
        nicolas.displayInfo(false); // Only name
        nicolas.displayHappyBirthday(); // Check and display birthday message

        
    }
}
