public class Passenger {
    private String firstName;
    private String lastName;
    private Ticket ticket;
    
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }
    public void setTicket(Ticket ticket) {
        //set ticket information, etc.
    }

    public Ticket getTicket() {
        //return ticket info, etc.
    }
    
    public void orderTicket(Ticket ticket) {
        //buys ticket
    }
}
