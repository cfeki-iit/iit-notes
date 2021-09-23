package Exercice2;

public class ListEtudiant {
    private int nbrEtud;
    private Etudiant[] listEtudiant;

    public ListEtudiant(int n) {
        this.nbrEtud=0;
        this.listEtudiant = new Etudiant[n];
    }

    public void ajouterEtudiant(Etudiant etud){
        if (nbrEtud<listEtudiant.length){
            listEtudiant[nbrEtud]=etud;
            nbrEtud++;
        }
    }

    public void modifierAdresse(Etudiant etud, String adr){
        etud.setAdresse(adr);
    }

    public Etudiant findEtudiant (String nom){
        int i=0;
        while (i<nbrEtud && listEtudiant[i].getNom()!=nom){
            i++;
        }
        
        return listEtudiant[i];
    }

    public int getNbrEtud() {
        return nbrEtud;
    }

    public void setNbrEtud(int nbrEtud) {
        this.nbrEtud = nbrEtud;
    }

    
}
