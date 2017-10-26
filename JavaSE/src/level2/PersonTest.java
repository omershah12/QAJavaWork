package level2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PersonTest {

    private Person person;

    @Test
    public void testSearch(){

        Person omer = new Person("Omer",22, "Trainee");

        Person omer1 = new Person("Omer",25, "Trainee");

        ArrayList search = omer.searchList("Omer");

        ArrayList searchBob = omer.searchList("Bob");

        search.add(omer1);

        assertNotNull(search);

        assertNotNull(searchBob);

        assertEquals(2, search.size());

        assertEquals(0, searchBob.size());


    }



}
