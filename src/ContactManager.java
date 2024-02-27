import java.util.ArrayList;
import java.util.Collections;

public class ContactManager {

    private ArrayList<Contact> contacts;

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public void trierContactsParNom() {
        Collections.sort(contacts, new Contact.NomComparator());
    }

    public ContactManager() {
        contacts = new ArrayList<>();
    }

    public void ajouterContact(Contact contact) {
        contacts.add(contact);
    }

    public void supprimerContact(Contact contact) {
        contacts.remove(contact);
    }

    public void modifierContact(Contact contact, String nouveauNom, String nouveauPrenom, Integer nouveauNumero, String nouvelleAdresseEMail) {
        int index = contacts.indexOf(contact);
        if (index != -1) {
            Contact c = contacts.get(index);
            c.setNom(nouveauNom);
            c.setPrenom(nouveauPrenom);
            c.setNumeroTelephone(nouveauNumero);
            c.setAdresseEMail(nouvelleAdresseEMail);
            contacts.set(index, c);
        } else {
            System.out.println("Le contact n'existe pas.");
        }
    }

    public void afficherContacts() {
        if (contacts.isEmpty()) {
            System.out.println("La liste de contacts est vide.");
        } else {
            System.out.println("Liste des contacts :");
            for (Contact c : contacts) {
                System.out.println(c);
            }
        }
    }

    public void trierContactsParPrenom() {
        Collections.sort(contacts, new Contact.PrenomComparator());
    }

}
