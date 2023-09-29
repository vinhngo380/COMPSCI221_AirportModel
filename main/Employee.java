package main;
public class Employee extends Person {
    private int employeeID; //only generated once for each employee

    public int getEmployeeID() {
        return employeeID;
    }

    @Override
    public void converse() {
        //help the passenger with questions
    }
}
