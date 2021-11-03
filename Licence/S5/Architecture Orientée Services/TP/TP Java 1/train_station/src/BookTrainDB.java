import java.util.ArrayList;

public class BookTrainDB {
    
    ArrayList<Train> trains;

    public BookTrainDB(ArrayList<Train> trains) {
        this.trains = trains;
    }

    public ArrayList<Train> getTrainDB() {
        return trains;
    }

    public void setTrainDB(ArrayList<Train> trains) {
        this.trains = trains;
    }

    
}
