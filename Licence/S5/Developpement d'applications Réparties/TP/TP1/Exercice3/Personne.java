package Exercice3;

public class Personne {
    String nom;
    int age;
    int poids;
    
    public Personne(String n, int a, int p){
        nom=n; 
        age=a;
        poids=p;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    @Override
    public String toString() {
        return "Personne [age=" + age + ", nom=" + nom + ", poids=" + poids + "]";
    }

    
}
