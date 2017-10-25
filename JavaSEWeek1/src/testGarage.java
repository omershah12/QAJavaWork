import org.junit.jupiter.api.Test;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class testGarage {

    private Garage garage;

    @Test

    public void testGarage(){

        garage = new Garage();

        garage.addVehicle();

        ArrayList cost = garage.fixVehicle();

        assertNotNull(cost);

        assertEquals(4, cost.size());
    }

    @Test
    public void testRemove(){

        garage = new Garage();

        garage.addVehicle();

        System.out.println("Filled");

        ArrayList remove = garage.removeVehicle();

        assertEquals(2, remove.size());


    }



}
