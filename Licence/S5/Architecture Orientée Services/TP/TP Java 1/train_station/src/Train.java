public class Train {
    int numTrain;
    String villeDepart, villeArrivee, heureDepart;
    
    public Train() {
    }

    public Train(int numTrain, String villeDepart, String villeArrivee, String heureDepart) {
        this.numTrain = numTrain;
        this.villeDepart = villeDepart;
        this.villeArrivee = villeArrivee;
        this.heureDepart = heureDepart;
    }

    public int getNumTrain() {
        return numTrain;
    }

    public void setNumTrain(int numTrain) {
        this.numTrain = numTrain;
    }

    public String getVilleDepart() {
        return villeDepart;
    }

    public void setVilleDepart(String villeDepart) {
        this.villeDepart = villeDepart;
    }

    public String getVilleArrivee() {
        return villeArrivee;
    }

    public void setVilleArrivee(String villeArrivee) {
        this.villeArrivee = villeArrivee;
    }

    public String getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(String heureDepart) {
        this.heureDepart = heureDepart;
    }

    @Override
    public String toString() {
        return "Train [heureDepart=" + heureDepart + ", numTrain=" + numTrain + ", villeArrivee=" + villeArrivee
                + ", villeDepart=" + villeDepart + "]";
    }
    
    
}
