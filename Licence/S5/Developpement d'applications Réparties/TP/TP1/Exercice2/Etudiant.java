package Exercice2;

public class Etudiant {
    private String nom;
    private String adresse;
    private int id;

    public Etudiant(int id,String nom, String adresse){
        this.id=id;
        this.nom=nom;
        this.adresse=adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    
    
}
