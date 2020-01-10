public class Passenger {
    private String name;
    private int numOfBags;
    private int weightOfBags;

    public Passenger(String name, int numOfBags){
        this.name = name;
        this.numOfBags = numOfBags;
        this.weightOfBags = weightOfBags;
    }

    public String getName() {
        return name;
    }

    public int getNumOfBags() {
        return numOfBags;
    }

    public int getWeightOfBags() {
        return numOfBags * 20;
    }
}


