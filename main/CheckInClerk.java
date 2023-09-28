package main;
public class CheckInClerk extends Employee {
    public void converse() {
        //help the passenger with whatever questions/problems they have specific 
    }

    public boolean checkInPass(Ticket t, Passenger p) {
        //check if the ticket and passenger pass through all requirements to be able to board
        return true;
    }

    public boolean isOverWeight(Luggage luggage, Ticket ticket) {
        //check if the luggage is overweight to the ticket's specified weight
        return false;
    }
}
