import java.util.ArrayList;

public class ContactManager {
    private ArrayList<Contact> monContact;

    public ContactManager() {
        monContact = new ArrayList<>();
    }
    public void ajouterContact( Contact contact){
        monContact.add(contact);
    }

    public void supprimerContact(Contact contact){
        monContact.remove(contact);
    }

    public void modifierContact(Contact contact){
        monContact.set(1, contact);
    }

    public void afficherContacts(){
        if (monContact.isEmpty()){
            System.out.println("C'est le vide");
        } else {
            System.out.println("Voici les contacts : ");
            for (Contact c : monContact)
                System.out.println(c);
        }
    }

}


