package week5.projects.ınnerClassesProject;

public class Employee {
    private String firstName;
    private String lastName;
    private ContactInfo contactInfo; // Inner class'ın bir örneği

    // Constructor
    public Employee(String firstName, String lastName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactInfo = new ContactInfo(phoneNumber, email);
    }

    // Inner Class - sadece Employee ile birlikte anlamlıdır
    private class ContactInfo {
        private String phoneNumber;
        private String email;

        // Constructor
        public ContactInfo(String phoneNumber, String email) {
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        // İletişim bilgilerini döndüren metod
        public String getContactDetails() {
            return "Phone: " + phoneNumber + ", Email: " + email;
        }
    }

    // Çalışanın tüm bilgilerini yazdıran metod
    public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + firstName + " " + lastName);
        System.out.println("Contact Information: " + contactInfo.getContactDetails());
    }
}