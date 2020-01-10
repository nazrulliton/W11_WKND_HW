
public class FlightManager {
   private Flight flight;
   private Passenger passenger;

   public FlightManager(Flight flight){
       this.flight = flight;
   }

    public int getBagWeight() {
        int numOfBags = this.passenger.getNumOfBags();
        int weight = 20;
        return numOfBags + weight;
    }

}
