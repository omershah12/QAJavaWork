package paint;

import java.util.*;

public class Paint {

    public String paintName;
    public int litres;
    public float cost;
    public int cover;

    public Paint(String name, int litre, float price, int coverage){

        paintName=name;
        litres=litre;
        cost=price;
        cover=coverage;

    }

    public void cheapoMax(){

        String name="Cheapo Max";
        int amount=20;
        double cost=19.99;
        int cover= amount*10;

        String toString;

        toString= "Name: "+name+" Amount: "+amount+" Cost: £"+cost+" Covers: "+cover;
        System.out.println();

        System.out.println(toString);

    }

    public void averageJoesPaint(){

        String name="Average Joes Paint";
        int amount=15;
        double cost=17.99;
        int cover= amount*11;

        String toString;

        toString= "Name: "+name+" Amount: "+amount+" Cost: £"+cost+" Covers: "+cover;
        System.out.println();

        System.out.println(toString);

    }

    public void duxluourousPaints(){

        String name="Duxluourous Paints";
        int amount=10;
        double cost=25.00;
        int cover= amount*20;

        String toString;

        toString= "Name: "+name+" Amount: "+amount+" Cost: £"+cost+" Covers: "+cover;
        System.out.println();

        System.out.println(toString);

    }
}
