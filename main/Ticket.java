package main;
public class Ticket {
    private String startLocation;
    private String endLocation;
    private double price;
    private double maxWeight;
    private String airline;

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
}
