import java.util.*;
import java.util.Scanner;

public class Main {

    public String name;

    public int age;


    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        Main main = new Main();

        System.out.println("Enter Name");

        main.name = sc.next();

        System.out.println("Enter Age");

        main.age = sc.nextInt();

        Player omer = new Player(main.name, main.age);

        omer.welcomeMessage();

        omer.welcome();

        sc.nextInt();

        GameInProgress gip= new GameInProgress();

        gip.game();

    }

}
