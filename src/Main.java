import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Contact unContact = new Contact("Julie", "Chocoblast", "julie.chocoblast@gmail.com", 9739);
        Contact johanna = new Contact("Johanna", "Chocoblast", "johanna.chocoblast@gmail.com", 975);
        ContactManager contactManager = new ContactManager();
        contactManager.ajouterContact(johanna);
        contactManager.ajouterContact(unContact);
        contactManager.afficherContacts();
    }
}