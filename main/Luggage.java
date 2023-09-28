package main;
public class Luggage {
    private double weight;
    private boolean hasScanned;
    private boolean passedSecurity;

    public void setWeight(double newWeight) {
        this.weight = newWeight;
    }

    public double getWeight() {
        return this.weight;
    }    

    public void scan() {
        //this scans the Luggage object to see if it has passed
        hasScanned = true;
        passedSecurity = true;
    }

}