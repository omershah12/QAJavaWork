package garage;

import java.util.ArrayList;

public class Garage {

    public static ArrayList<Vehicle> aL= new ArrayList<Vehicle>();

    ArrayList<Integer> cost = new ArrayList<Integer>();

    public void addVehicle(){

        Vehicle truck= new Truck(1, "123abc", 50);

        Vehicle car = new Car(2,  "abc123");
//
        Vehicle car1 = new Car(3,  "abc123");
        Vehicle car2 = new Car(4, "abc123");
        Vehicle car3 = new Car(5, "abc123");

    }

    public ArrayList removeVehicle(){

        int i []= {1,2,3};

        for(int j=i.length-1; j>=0; j--){
            aL.remove(i[j]);
        }

        return aL;

    }

    public ArrayList fixVehicle() {

        int i = 0;


        while (aL.size() > i) {

            int iD=aL.get(i).iD;
            int repaircost=aL.get(i).repairCost;

            cost.add(iD);
            cost.add(repaircost);

//            System.out.println("Vehicle ID: " + id + " Cost: " + repaircost);
            i++;

        }
        return cost;

    }


    public ArrayList emptyGarage(){

        aL.clear();

//        System.out.println("Cleared");

        return aL;

    }


    public ArrayList displayArray(){

        if (aL.isEmpty()){
            System.out.println("Garage Empty");
        }else {
            for (Vehicle temp : aL) {

                System.out.println(temp.toString());
            }
        }

        return aL;
    }


    public static void main (String [] args){

        Garage garage = new Garage();

        garage.addVehicle();

        garage.displayArray();

        System.out.println(garage.emptyGarage().toString());

        garage.removeVehicle();

//        garage.displayArray();

//        System.out.println(garage.removeVehicle().toString());

//        System.out.println(garage.fixVehicle().toString());
//        garage.emptyGarage();
//
//        garage.displayArray();

    }

}
