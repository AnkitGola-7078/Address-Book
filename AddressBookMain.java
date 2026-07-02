import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    // UC2: Store contacts
    private ArrayList<ContactPerson> contacts = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addContact() {
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter City: ");
        String city = sc.nextLine();

        System.out.print("Enter State: ");
        String state = sc.nextLine();

        System.out.print("Enter Zip: ");
        String zip = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phoneNumber = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

   
        ContactPerson person = new ContactPerson(firstName, lastName, address, city , zip, phoneNumber, email);
        contacts.add(person);

        System.out.println("Contact added successfully!");
    }

    public void displayContacts() {
        System.out.println("\n--- Contact List ---");
        for (ContactPerson contact : contacts) {
            System.out.println(contact); 
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book Program");

        AddressBookMain addressBook = new AddressBookMain();
        addressBook.addContact();       
        addressBook.displayContacts();  
    }
}
