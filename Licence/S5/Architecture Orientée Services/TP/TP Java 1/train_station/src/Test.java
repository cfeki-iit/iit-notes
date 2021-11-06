import java.util.Iterator;
import java.util.List;

public class Test {
    
    public static void main(String[] args) {

        List<Train> trains = BookTrainDB.getTrains();
        TrainRessource.createTrain(123, "sf", "tun", "22h00");
        Iterator<Train> i = trains.iterator();
        while (i.hasNext()){
            System.out.println(i.next().toString());
        }
    }
}
