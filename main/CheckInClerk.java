package main;
public class CheckInClerk extends Employee {
    @Override
    public void converse() {
        //help the passenger with whatever questions/problems they have specific 
    }

    public boolean checkInPass(Ticket t, Passenger p) {
        //check if the ticket and passenger pass through all requirements to be able to board
        return true; //temporary code so it doesnt error
    }

    public boolean isOverWeight(Luggage luggage, Ticket ticket) {
        //check if the luggage is overweight to the ticket's specified weight
        return false; //temporary code so it doesnt error
    }
}
