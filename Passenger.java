public class Passenger extends Person {
    private Ticket ticket;
    
    public void setTicket(Ticket ticket) {
        //set ticket information, etc.
    }

    public Ticket getTicket() {
        //return ticket info, etc.
    }
    
    public void orderTicket(Ticket ticket) {
        //buys ticket
    }

    public void checkIn() {
        //check in for TSA
    }

    public void sit(Seat seat) {
        //eg. sitting on a seat to wait for the next plane
    }
}
