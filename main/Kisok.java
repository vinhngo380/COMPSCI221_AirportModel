package main;
public class Kisok {
    private Ticket ticket;
    private String startLocation;
    private String endLocation;
    private double price;
    private double maxWeight;
    private String airline;

    public Ticket generateTicket(String startLocation, String endLocation, double maxWeight, double price, String airline) {
        //create a new ticket but doesnt mean it physically prints
        Ticket ticket = new Ticket();
        return ticket;
    }

    public void printTicket() {
        //physically print ticket to Passengers
    }

}
