import java.util.Scanner;

public class Player {

    public String playerName;

    public int age;

    public String welcome;

    public Player(String pn, int a){

        playerName = pn;

        age = a;

    }

    public String getPlayerName(){

        return playerName;

    }

    public int getAge(){

        return age;

    }

    public String welcomeMessage(){

        welcome = "Welcome "+playerName+" To Barren Moor. Press 1 to Begin";

        return welcome;

    }

    public void welcome(){

        System.out.println(welcome);

    }

}
