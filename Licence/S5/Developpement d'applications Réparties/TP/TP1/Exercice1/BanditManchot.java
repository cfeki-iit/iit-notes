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
        if()
        return (int) Math.pow(10,resultat);
    }
}
