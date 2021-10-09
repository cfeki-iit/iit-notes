package Exercice3;

public class AlgoGene {
    public static void tri (Object [] T, Compare op) {
        for (int i=T.length-1; i>=0; i--) {
            for (int j=1; j<=i; j++) {
                if (op.inf(T[j],T[j-1])) {
                    Object x=T[j-1]; T[j-1]=T[j]; T[j]=x;
                }
            }
        }
    }
        
}
