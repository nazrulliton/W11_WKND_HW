
public class FlightManager {
   private Flight flight;
   private Passenger passenger;

   public FlightManager(Flight flight){
       this.flight = flight;
   }

    public int getBagWeight() {
       return this.passenger.getWeightOfBags();
    }

}
