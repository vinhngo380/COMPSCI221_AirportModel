package main;
abstract class Person {
    protected String firstName;
    protected String lastName;
    
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

    //   "actions"
    public void walk() {

    }
    public void stand() {
        
    }
    public abstract void converse(Person person);
}
