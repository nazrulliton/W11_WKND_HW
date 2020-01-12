import java.util.ArrayList;

public class FlightManager {
   private Flight flight;

   public FlightManager(Flight flight){
       this.flight = flight;
   }

    public int weightToReserveForPassenger(){
       int unitBagWeight = 20;
       int unitOfBags = flight.getNumOfBag();
       return unitBagWeight * unitOfBags;
    }
    public int weightToReserveForAllPassengers(){
        ArrayList<Passenger> passengerList = this.flight.returnListOfPassenger();
        int total = 0;
        for (Passenger passenger: passengerList){
            total += passenger.getWeightOfBags();
        }
        return total;
    }
    public int overallWeightReservedForBaggageRemaining(){
       return flight.getPlaneBaggageWeightAllowance() - weightToReserveForAllPassengers();
    }

}

