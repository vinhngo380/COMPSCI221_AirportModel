package main;
public class main {
    public static void main(String[] args) {
        Passenger p = new Passenger();
        Kisok k = new Kisok();
        Ticket t = k.generateTicket("London", "New York City", 123, 1234, "United Airlines");
        p.setTicket(t);
    }
}
