package main;
public class Ticket {
    private String startLocation;
    private String endLocation;
    private double price;
    private double maxWeight;
    private String airline;
    private Person person;
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
        /*
         * (what it would most likely do) check the max weight of the ticket and weight given 
         * if it exceeds increase the price of the ticket (true)
         * else return false
         */
        return false; //temporary code so it doesnt error
    }
    public void setPerson(Person person) {
        this.person = person;
    }
    public void setGate(String gate) {
        this.gate = gate;
    }


}
