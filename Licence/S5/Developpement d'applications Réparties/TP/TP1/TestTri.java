
import Exercice3.Compare;
import Exercice3.AlgoGene;
import Exercice3.Op;
import Exercice3.Personne;

public class TestTri {
    public static void main(String[] args){
        Personne [] peuple = new Personne[4];
        peuple [0] = new Personne("toto", 25, 80);
        peuple [1]= new Personne("tutu", 53, 65);
        peuple [2] = new Personne("tata", 15, 47);
        peuple [3]= new Personne("jojo", 12, 30);
        Compare op = new Op();
      
        System.out.println("Tri selon age");
        AlgoGene.tri(peuple,op);
        afficherTableau(peuple);
       Op.setTriAge(false);
      
        System.out.println("tri selon poid");
        afficherTableau(peuple);

    }

    public static void afficherTableau(Personne[] pers){
        for(int i = 0 ;  i<pers.length ; i++){
            System.out.println(pers[i].toString());
                }
    }
}
