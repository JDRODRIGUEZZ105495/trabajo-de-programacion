public class Passenger {
    private String passportNumber;  // Unique passport ID
    private String firstName;       // First name
    private String lastName;        // Last name
    private String nationality;     // Nationality
    private String dateOfBirth;     // Date of birth (format: YYYY-MM-DD)

    // Constructor
    public Passenger(String passportNumber, String firstName, String lastName, 
                    String nationality, String dateOfBirth) {
        this.passportNumber = passportNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
    }

    // Getters and setters
    public String getPassportNumber() { return passportNumber; }
    public void setPassportNumber(String passportNumber) { this.passportNumber = passportNumber; }
    
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    
    public String getNationality() { return nationality; }
    public void setNationality(String nationality) { this.nationality = nationality; }
    
    public String getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }
}
