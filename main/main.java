package main;
public class Main {
    public static void main(String[] args) {
        Passenger p = new Passenger();
        Kiosk k = new Kiosk();
        Ticket t = k.generateTicket("London", "New York City", 123, 1234, "United Airlines");
        p.setTicket(t);
        t.setOwner(p);
    }
}
