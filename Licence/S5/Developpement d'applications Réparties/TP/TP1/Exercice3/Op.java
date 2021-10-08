package Exercice3;

public class Op implements Compare{

    private static boolean triAge=false;
    /*private static boolean triNom=false;
    private static boolean triPoid=false;*/
    
    @Override
    public boolean inf(Object x, Object y) {
        Personne p1 = (Personne) x;
        Personne p2 = (Personne) y;
        if (triAge){
            if (p1.getAge()<(p2.getAge())){
                return true;
            }
            return false;
        }
        else {
                if (p1.getPoids()<(p2.getPoids())){
                    return true;
                }
                return false;
            }
        
      
    }

    public static boolean isTriAge() {
        return triAge;
    }

    public static void setTriAge(boolean triAge) {
        Op.triAge = triAge;
    }
/*
    public static boolean isTriNom() {
        return triNom;
    }

    public static void setTriNom(boolean triNom) {
        Op.triNom = triNom;
    }

    public static boolean isTriPoid() {
        return triPoid;
    }

    public static void setTriPoid(boolean triPoid) {
        Op.triPoid = triPoid;
    }
  */  
}
