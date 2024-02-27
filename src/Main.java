import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Créer une instance ContactManager
        ContactManager contactManager = new ContactManager();

        // Créer des contacts
        Contact contact1 = new Contact("Doe", "John", 123456789, "john.doe@example.com");
        Contact contact2 = new Contact("Smith", "Jane", 987654321, "jane.smith@example.com");
        Contact contact3 = new Contact("Gates", "Billy", 987654643, "billy.gates@example.com");
        // Ajouter des contacts à ContactManager
        contactManager.ajouterContact(contact1);
        contactManager.ajouterContact(contact2);

        // Afficher les contacts
        System.out.println("Contacts après ajout:");
        contactManager.afficherContacts();

        // Modfication du contacts 1
        contactManager.modifierContact(contact1, "Doe", "Jonathan", 987654321, "jonathan.doe@example.com");

        // Affichage du contact 1 après modification
        System.out.println("\nContacts après modification:");
        contactManager.afficherContacts();

        // supprimer contact2
        contactManager.supprimerContact(contact2);

        // Afficher tous les contacts après modifcation
        System.out.println("\nContacts après supression:");

        //contactManager.ajouterContact(contact1);
        contactManager.ajouterContact(contact2);
        contactManager.ajouterContact(contact3);
        contactManager.afficherContacts();


        //Triage des contacts par le nom
        contactManager.trierContactsParNom();
        System.out.println("\nContacts triés par nom :");
        for (Contact contact : contactManager.getContacts()) {
            System.out.println(contact.getNom());
        }
    }
}

