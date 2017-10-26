package garage;

public class Car extends Vehicle {

    public Car(int iD, String registrationNumber){

        this.iD=iD;
        this.vehicleType="Car";

        this.registrationNumber = registrationNumber;

        this.repairCost=repairCost;

        garage.aL.add(this);

    }

    public String toString(){

        return "ID: "+this.iD+ " Type: "+this.vehicleType+" Registration Number: "+ this.registrationNumber
                + " Repair Cost: " +repairCost;

    }

}
