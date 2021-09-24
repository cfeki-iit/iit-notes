

import Exercice2.Etudiant;
import Exercice2.Matiere;
import java.util.*;

public class testMatiere {
    public static void main (String[] args){
        Matiere mat = new Matiere(4);
        Etudiant ali = new Etudiant("ali","sfax");
        mat.ajouterEtudiant(ali, 20);
        mat.ajouterEtudiant(new Etudiant("salma","tozeur"), 15);
        mat.afficherListeNotes();
    }
}
