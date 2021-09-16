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
        int resultat=0;
        for (int i = 0; i<4; i++){
            tabRoue[i].lance();
        }
        for (int i =0; i<3; i++){
            resultat=0;
            for (int j = i+1; j<4 ;j++){
                if (tabRoue[i].get() == tabRoue[j].get()){
                    resultat++;
                }
            }
        }
        return (int) Math.pow(10,resultat);
    }
}
