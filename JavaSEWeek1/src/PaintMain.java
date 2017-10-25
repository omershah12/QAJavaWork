import java.util.*;
import java.util.Scanner;

public class PaintMain {

    public static void main(String []args){

        int [] heightWall=new int[10];
        int [] widthWall=new int[10];
        int [] plane=new int[10];

        Scanner sc = new Scanner(System.in);
        int counter=0;
        int numOfWalls;
        int totalSurfaceArea=0;
        int counter2=1;

        TotalCost myWall = new TotalCost(0,0);
        Paint myPaint = new Paint("n",0,0,0);

        System.out.println("****Start Here****");

        System.out.println("Enter number of walls");
        numOfWalls=sc.nextInt();

        System.out.println();
        System.out.println("Enter Measurements(width/height)");
        for(int i=0; i< numOfWalls; i++){

            System.out.println("Wall " +counter2);
            System.out.println("Width: ");
            widthWall[i]=sc.nextInt();
            System.out.println("Height: ");
            heightWall[i]= sc.nextInt();
            counter2++;
            System.out.println();
        }

        for(int i=0; i <numOfWalls; i++){
            plane[i]=myWall.calculateTotalArea(heightWall[i], widthWall[i]);
            counter++;

            System.out.println("Surface area for wall "+counter+" is "+plane[i]+" square metres");
        }

        for (int i=0; i<plane.length; i++){
            totalSurfaceArea= totalSurfaceArea + plane[i];
        }

        System.out.println("Total Surface area is "+totalSurfaceArea+" square metres");
        System.out.println();

        myPaint.cheapoMax();
        myPaint.averageJoesPaint();
        myPaint.duxluourousPaints();

        myWall.calculateCost(totalSurfaceArea);

        System.out.println();
        System.out.println("****END****");

    }



}
