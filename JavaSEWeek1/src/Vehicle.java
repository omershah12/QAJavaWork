public abstract class Vehicle {

    public int iD;

    public String vehicleType;

    public String registrationNumber;

    public int repairCost=5;


    Garage garage = new Garage();


    public int getId(){

        return iD;

    }

    public String getVehicleType(){

        return vehicleType;

    }

    public String getRegistrationNumber(){

        return registrationNumber;

    }

    public int getRepairCost(){

        return repairCost;

    }

}
