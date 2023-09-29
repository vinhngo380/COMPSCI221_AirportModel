package main;
public class Employee extends Person {
    private int employeeID; //only generated once for each employee

    public int getEmployeeID() {
        return employeeID;
    }

    @Override
    public void converse(Person person) {
        //help the passenger with questions, or any other kind of conversing with people
    }
}
