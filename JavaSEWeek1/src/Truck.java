public class Truck extends Vehicle {


    public int loadSize;

    public Truck(int iD, String registrationNumber, int loadSize){

        this.iD=iD;
        this.vehicleType="Truck";
        this.registrationNumber = registrationNumber;
        this.loadSize = loadSize;

        this.repairCost=repairCost*2;

        garage.aL.add(this);

    }

    public String toString(){

        return "ID: "+this.iD+ " Type: "+this.vehicleType+" Registration Number: "+ this.registrationNumber
                +"Load Size: " +this.loadSize+ " Repair Cost: "+this.repairCost;

    }

}
