import java.util.Iterator;
import java.util.List;

public class TrainRessource {
    

    // Create 
    public void createTrain(int numTrain, String vDep, String vArr, String hDep){
        BookTrainDB.getTrains().add(new Train(numTrain,vDep,vArr,hDep));
    }
    // Retrieve 
    
    // Update 
    // Delete
    
}
