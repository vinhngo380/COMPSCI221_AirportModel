package main;
public class Ticket {
    private String startLocation;
    private String endLocation;
    private double price;
    private double maxWeight;
    private String airline;
    private Person owner;
    private String gate;

    public String getStartLocation() {
        return startLocation;
    }
    public String getEndLocation() {
        return endLocation;
    }
    public double getPrice() {
        return price;
    }
    public double getMaxWeight() {
        return maxWeight;
    }
    public String getAirline() {
        return airline;
    }
    public String getGate() {
        return gate;
    }

    

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public boolean isOverWeight(double weight) {
        //check if the luggage is overweight or not -- charge if it is
        return false; //temporary code so it doesnt error
    }

    public void setOwner(Person person) {
        this.owner = person;
    }
    public void setGate(String gate) {
        this.gate = gate;
    }
    public Person getOwner() {
        return owner;
    }

}
