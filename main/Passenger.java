package main;
public class Passenger extends Person {
    private Ticket ticket;
    private boolean hasPassport;
    

    @Override public void converse(Person person) {
        //talk to other passengers, ask for help from employees 
    }
    public void setTicket(Ticket ticket) {
        //set ticket information, etc.
    }

    public Ticket getTicket() {
        //return ticket info, etc.
        return this.ticket;
    }
    
    public void orderTicket(Ticket ticket, Kisok kisosk) {
        //buys ticket at a kiosk
    }

    public void checkIn() {
        //check in for TSA
    }

    public boolean getHasPassport() {
        return hasPassport;
    }

    public void setHasPassport(boolean hasPassport) {
        this.hasPassport = hasPassport;
    }

    public void board() {
       //boarding the plane/scanning  
    }
    
}
