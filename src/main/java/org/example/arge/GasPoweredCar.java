package org.example.arge;


public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLiter, int cylinders){
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLiter;
    }

    public void setAvgKmPerLitre(double avgKmPerLiter) {
        this.avgKmPerLiter = avgKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println( getName() +" is Starting");
    }

    @Override
    public void drive() {
        System.out.println( getName() + " is Driving");
    }
}
