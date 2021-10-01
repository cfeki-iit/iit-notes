

import Exercice2.Etudiant;
import Exercice2.Matiere;
import java.util.*;

public class testMatiere {
    public static void main (String[] args){
        Matiere mat = new Matiere(2);
        Etudiant ali = new Etudiant(1,"ali","sfax");
        mat.ajouterEtudiant(ali, 20);
        mat.ajouterEtudiant(new Etudiant(2,"salma","tozeur"), 15);
        mat.afficherListeNotes();
        System.out.println("\nla moyenne des notes est : "+ mat.moyenne());
    }
}
