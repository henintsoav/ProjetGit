import java.util.Comparator;

public class Contact {
    private String nom;
    private String prenom;
    private Integer numeroTelephone;
    private String adresseEMail;
private String commentaire;
private String categorie;

    public Contact(String nom, String prenom, Integer numeroTelephone, String adresseEMail) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroTelephone = numeroTelephone;
        this.adresseEMail = adresseEMail;
    }

    public Contact(String nom, String prenom, Integer numeroTelephone, String adresseEMail, String commentaire, String categorie) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroTelephone = numeroTelephone;
        this.adresseEMail = adresseEMail;
        this.commentaire = commentaire;
        this.categorie = categorie;
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

    @Override
    public String toString() {
        return "Contact{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numeroTelephone=" + numeroTelephone +
                ", adresseEMail='" + adresseEMail + '\'' +
                ", commentaire='" + commentaire + '\'' +
                ", categorie='" + categorie + '\'' +
                '}';
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }


}
