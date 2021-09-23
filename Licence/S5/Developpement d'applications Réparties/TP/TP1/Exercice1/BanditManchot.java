package Exercice1;
public class BanditManchot {
    Roue[] tabRoue;

    public BanditManchot(){
         tabRoue = new Roue[4];
         for (int i = 0; i<4 ; i++){
             tabRoue[i] = new Roue();
         }
    }

    public int joue(){
        int resultat=1;
        for (int i = 0; i<4; i++){
            tabRoue[i].lance();
        }
        int r1 = tabRoue[0].get();
        int r2 = tabRoue[1].get();
        int r3 = tabRoue[2].get();
        int r4 = tabRoue[3].get();
        
        if (r1==r2 && r1==r3 && r1==r4)
            resultat=1000;
        else if (r1==r2 && r1==r3 || r1==r2 && r1==r4 || r1==r3 && r1==r4 || r2==r3 && r2==r4)
                resultat=100;
             else if (r1==r2 || r1==r3 || r1==r4 || r2==r3 || r2==r4 || r3==r4)
                    resultat=10;
                  else 
                    resultat=0;
        return resultat;
    }
}
