import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class GameInProgress extends Game{

    public String isCompleteUser;

    public enum direction{

        north, east, south, west;

    }

    public GameInProgress(){

        isComplete=this.isComplete;

        progress = this.progress;

        level = this.level;

    }

    public String toString(int l, boolean complete, int d){

        l = level;

        complete = isComplete;

        d = distance;


        if(isComplete==false){
             isCompleteUser= "not complete";
        }

        return "You are on level "+level+" which means the game is "+isComplete+" distance to finish "+distance;

    }


    public boolean game() {
        boolean ishmEmpty = progress.isEmpty();

        if(ishmEmpty==true){

            progress.put(0, "You are ready to begin your adventure");

            start();

        }

        return ishmEmpty;
    }

    public void start(){

        boolean startGame = progress.containsKey(0);

        if(startGame==true){
            isComplete=false;
            System.out.println(progress.get(0));
            progress.put(1, "You awaken to find yourself in a barren moor. Try look");

            progress.put(2, "Grey foogy clouds float oppressively close to you, " +
                    "reflected in the murky water which reaches up your shins");

            progress.put(3, "Some black plants barely poke out of the shallow water" +
                    ". Try north, south, east or west");

            level = 1;

            level1();

        }else{
            System.out.println("Error");
        }

    }

    public void level1(){

        Scanner sc = new Scanner(System.in);

        System.out.println(progress.get(1));

        String look =sc.nextLine();

        if(look.equals("look") && !progress.isEmpty()){
            System.out.println(progress.get(2));
            System.out.println(progress.get(3));
            level2();

        } else if(look.equals("progress")){

            System.out.println(toString(this.level, this.isComplete, this.distance));
            level1();

        }
    }

    public void level2(){

        Scanner sc = new Scanner(System.in);

        String movement = sc.nextLine();

        level=2;

        if(movement.equals("north")){
            progress.put(4, "You have encountered a lake, which is black. What way shall you go");
            System.out.println(progress.get(4));
            distance=distance-10;
            level3();
        }else if (movement.equals("south")){
            wrongDirection1();
        }else if(movement.equals("progress")){
            System.out.println(toString());
            System.out.println(progress.get(2));
            System.out.println(progress.get(3));
            level2();
        } else if(movement.equals("east")){
//            encounter();
            wrongDirection1();
        }else{
            wrongDirection1();
        }

    }

    public void level3(){
        Scanner sc = new Scanner(System.in);

        String movement= sc.nextLine();

        level=3;

        if(movement.equals("west")){
            progress.put(5,"You have decided to walk along the shoreline of the lake");
            System.out.println(progress.get(5));
            distance=distance-10;
            level4();
        }else{
            System.out.println("Youre dead lad, soz");
        }

    }

    public void level4(){

        Scanner sc = new Scanner(System.in);

        String movement=sc.nextLine();

        level=4;

        if(movement.equals("north")){
            progress.put(6, "You pass some jaggy rocks and continue to walk along the shoreline, There however is a monster lurking. You can pass him quietly");
            System.out.println(progress.get(6)+distance);
            distance=distance-10;
            level5();
        }

    }

    public void level5(){
        Scanner sc = new Scanner(System.in);

        String movement=sc.nextLine();

        level=5;

        if(movement.equals("east")){
            progress.put(7, "You get past the monster and encounter, more rocks blocking the path");
            System.out.println(progress.get(7)+distance);
            distance=distance-10;
            level6();
        }

    }

    public void level6(){
        Scanner sc = new Scanner(System.in);

        String movement=sc.nextLine();

        level=6;

        if(movement.equals("south")){
            progress.put(8, "You have headed south, to get round the rocks. Clever");
            System.out.println(progress.get(8)+distance);
            distance=distance-10;
            level7();
        }

    }

    public void level7(){
        Scanner sc = new Scanner(System.in);

        String movement=sc.nextLine();

        level=7;

        if(movement.equals("east")){
            progress.put(9, "There is large trees, blocking the path");
            System.out.println(progress.get(9)+distance);
            distance=distance-10;
            level8();
        }

    }

    public void level8(){
        Scanner sc = new Scanner(System.in);

        String movement=sc.nextLine();

        level=6;

        if(movement.equals("east")){
            progress.put(10, "You have found the treasure");
            System.out.println(progress.get(10)+distance);
            distance=distance-10;

        }

    }

    public void wrongDirection1(){

        Scanner sc = new Scanner(System.in);

        System.out.println("You have entered into the swamp. You should go back");

        distance = 115;

        String movement = sc.nextLine();

        if(movement.equals("north")){
            level1();
        }else if (movement.equals("progress")){
            System.out.println(toString());
            wrongDirection1();
        }

    }

//    public void encounter(){
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("You encounter a swamp monster, there is no way around. To attack, type attack");
//
//        distance=110;
//
//        String attack = sc.nextLine();
//
//        for(int i=3; i > 0; i-- ){
//
//            if(attack.equals("attack")){
//                System.out.println("You have attacked the monster");
//            }
//
//        }

//        if(attack.equals("attack") && monsterHealth !=0){
//
//            System.out.println("You have attacked the monster, however it is still alive");
//            monsterHealth--;
//
//            encounter();
//
//        }else if(attack.equals("attack") && monsterHealth==0){
//
//            System.out.println("You have managed to kill the monster. You can now progress");
//        }

    }


