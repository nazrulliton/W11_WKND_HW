public enum PlaneType {
    BOEINGSMALL(100, 400),
    BOEINGLARGE(200,800);

    private final int capacity;
    private final int totalWeight;
    private PlaneType( int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
