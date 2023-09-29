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

    public boolean getHasScanned() {
        return hasScanned;
    }

    public void setHasScanned(boolean hasScanned) {
        this.hasScanned = hasScanned;
    }

    public boolean hasPassedSecurity() {
        return passedSecurity;
    }

    public void setPassedSecurity(boolean passedSecurity) {
        this.passedSecurity = passedSecurity;
    }
    
    
}