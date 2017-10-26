package level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestUTH {

    private BlackJack blackJack;

    @Test
    public void testUnique(){

        blackJack = new BlackJack();

        int unique1 = blackJack.uniqueSum(1,2,3);

        int unique2 = blackJack.uniqueSum(3,3,3);

        int unique3 = blackJack.uniqueSum(1,1,2);

        assertNotNull(unique1);

        assertNotNull(unique2);

        assertNotNull(unique3);

        assertEquals(6,unique1);

        assertEquals(0, unique2);

        assertEquals(2, unique3);

    }

    @Test
    public void testTooHot(){

        blackJack = new BlackJack();

        boolean hot1 = blackJack.tooHot(60, true);

        boolean hot2 = blackJack.tooHot(60, false);

        boolean hot3 = blackJack.tooHot(70, false);

        boolean hot4 = blackJack.tooHot(90, true);

        assertNotNull(hot1);

        assertNotNull(hot2);

        assertNotNull(hot3);

        assertNotNull(hot4);

        assertEquals(false, hot1);

        assertEquals(true, hot2);

        assertEquals(true, hot3);

        assertEquals(false, hot4);

    }




}
