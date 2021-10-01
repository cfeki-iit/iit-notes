package Exercice2;

public class Matiere {
    ListEtudiant list;
    float[] notes ;

    public Matiere( int n ){
        list= new ListEtudiant(n);
        notes = new float[n];
    }
    
    public void ajouterEtudiant(Etudiant etud, float note){
        notes[list.getNbrEtud()]=note;
        list.ajouterEtudiant(etud);
    }
    public float moyenne(){
        float moy=0;
        int i = 0;
        while (i<notes.length){
            System.out.println(notes[i]+" "+notes.length);
            moy+=notes[i]/notes.length;
            i++;
        }
        return moy;
    }
    public void afficherListeNotes(){
        int nbretud = list.getNbrEtud();
        Etudiant[] etuds=list.getListEtudiant();
        for(int i =0; i<nbretud;i++){
            System.out.println("Etudiant:\n\tNom:"+etuds[i].getNom());
            System.out.println("\n\tAdresse:"+etuds[i].getAdresse());
            System.out.println("\n\tNote:"+notes[i]);
        }
    }
}
