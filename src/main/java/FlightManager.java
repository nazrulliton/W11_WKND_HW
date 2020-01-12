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

}

