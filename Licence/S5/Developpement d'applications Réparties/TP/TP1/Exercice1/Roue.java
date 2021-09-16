package Exercice1;
import java.util.Random;

public class Roue {
    private int symbole; 

    public Roue(){
        this.symbole=0;
    }

    public void lance(){
        Random gen = new Random();
        symbole = gen.nextInt(4);
    }
    
    public int get(){
        return symbole;
    }
}