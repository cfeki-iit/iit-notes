import java.util.List;
import java.util.ArrayList;

public class BookTrainDB {
    
    private static List<Train> trains = new ArrayList<Train>();

    static {
        trains.add(new Train(2021,"sf","Tun","8h00"));
        trains.add(new Train(2022,"gb","sf","10h15"));
        trains.add(new Train(2023,"sf","Ss","12h25"));
        trains.add(new Train(2021,"Ss","Tun","8h450"));
    }

    public static List<Train> getTrains(){
        return trains;
    }
    
}
 