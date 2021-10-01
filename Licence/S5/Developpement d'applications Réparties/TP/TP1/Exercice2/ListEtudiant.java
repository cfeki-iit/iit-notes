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

    public void modifierAdresse(int idEtudiant, String adr){
        int i=0;
        while (listEtudiant[i].getID()!= idEtudiant && i<listEtudiant.length){
            i++;
        }
        if (i<listEtudiant.length){
            listEtudiant[i].setAdresse(adr);
        }
        else
            System.out.println("Etudiant introuvable");
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

    public Etudiant[] getListEtudiant() {
        return listEtudiant;
    }

    public void setListEtudiant(Etudiant[] listEtudiant) {
        this.listEtudiant = listEtudiant;
    }

    
}
