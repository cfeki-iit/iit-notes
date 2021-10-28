package exercice_2;

public class Etudiant {
    
    private String nom, prenom, tel, mail, url, date_naiss;

    public Etudiant(String nom, String prenom, String tel, String mail, String url, String date_naiss) {
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.mail = mail;
        this.url = url;
        this.date_naiss = date_naiss;
    }

    public String getNom() {
        return nom;
    }


    public String getPrenom() {
        return prenom;
    }

    public String getTel() {
        return tel;
    }


    public String getMail() {
        return mail;
    }

    public String getUrl() {
        return url;
    }


    public String getDate_naiss() {
        return date_naiss;
    }

    
    
    
}
