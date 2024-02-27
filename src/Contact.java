public class Contact {
    private String nom;
    private String prenom;
    private String adresseEmail;
    private int numeroTelephone;

    public Contact(String nom, String prenom, String adresseEmail, int numeroTelephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresseEmail = adresseEmail;
        this.numeroTelephone = numeroTelephone;
    }

    public String getNom() {
        return nom;
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

    public String getAdresseEmail() {
        return adresseEmail;
    }

    public void setAdresseEmail(String adresseEmail) {
        this.adresseEmail = adresseEmail;
    }

    public int getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(int numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresseEmail='" + adresseEmail + '\'' +
                ", numeroTelephone=" + numeroTelephone +
                '}';
    }
}
