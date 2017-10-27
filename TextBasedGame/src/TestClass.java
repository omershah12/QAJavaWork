import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.HashMap;

public class TestClass {

    private GameInProgress gameInProgress;
    
    
    @Test
    public void testToString(){
        
        GameInProgress gp = new GameInProgress();

        gp.start();

        gp.level =1;

        String test1 =gp.toString(1,false,70);

        String test2 =gp.toString(1,true,0);

        assertNotNull(test1);

        assertEquals("You are on level 1 which means the game is false distance to finish 70", test1);

        assertEquals("You are on level 1 which means the game is false distance to finish 70", test2);

    }

    @Test
    public void testGame(){

        GameInProgress gp = new GameInProgress();



        boolean test1=gp.game();

        assertEquals(false, test1);


    }

}
