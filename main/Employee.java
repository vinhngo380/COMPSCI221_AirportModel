package main;
public class Employee extends Person{
    private int employeeID; //only generated once for each employee

    public int getEmployeeID() {
        return employeeID;
    }

    public void help() {
        System.out.println("ask my advisor");
    }
    
}
