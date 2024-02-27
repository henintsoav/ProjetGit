import java.util.Comparator;

public class Contact {
    private String nom;
    private String prenom;
    private Integer numeroTelephone;
    private String adresseEMail;
    private String commentaires;
    private String catégories;

    public Contact(String nom, String prenom, Integer numeroTelephone, String adresseEMail, String commentaires, String catégories) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroTelephone = numeroTelephone;
        this.adresseEMail = adresseEMail;
        this.commentaires = commentaires;
        this.catégories = catégories;
    }

    public static class PrenomComparator implements Comparator<Contact> {
        @Override
        public int compare(Contact c1, Contact c2) {
            return c1.getPrenom().compareTo(c2.getPrenom());
        }
    }

    public String getNom() {
        return nom;
    }

    public static class NomComparator implements Comparator<Contact> {
        @Override
        public int compare(Contact c1, Contact c2) {
            return c1.getNom().compareTo(c2.getNom());
        }
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(Integer numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public String getAdresseEMail() {
        return adresseEMail;
    }

    public void setAdresseEMail(String adresseEMail) {
        this.adresseEMail = adresseEMail;
    }

    public String getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }

    public String getCatégories() {
        return catégories;
    }

    public void setCatégories(String catégories) {
        this.catégories = catégories;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Numéro de téléphone: " + numeroTelephone + ", Adresse e-mail: " + adresseEMail + " commentaire : " + commentaires + " catégorie : " + catégories ;
    }
}
