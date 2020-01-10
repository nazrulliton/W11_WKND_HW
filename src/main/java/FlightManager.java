import java.util.ArrayList;

public class FlightManager {
   private Flight flight;

   public FlightManager(Flight flight){
       this.flight = flight;
   }

    public int getBagWeight() {
        int numOfBags = this.flight.getNumOfBag();
        int weight = 20;
        return (numOfBags * weight);
    }
}
