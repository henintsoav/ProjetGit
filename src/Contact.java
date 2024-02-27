public class Contact {
    private String nom;
    private String prenom;
    private Integer numeroTelephone;
    private String adresseEMail;

    public Contact(String nom,String prenom, Integer numeroTelephone, String adresseEMail) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroTelephone = numeroTelephone;
        this.adresseEMail = adresseEMail;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public java.lang.String getPrenom() {
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

    public java.lang.String getAdresseEMail() {
        return adresseEMail;
    }

    public void setAdresseEMail(String adresseEMail) {
        this.adresseEMail = adresseEMail;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Numéro de téléphone: " + numeroTelephone + ", Adresse e-mail: " + adresseEMail;
    }
}
