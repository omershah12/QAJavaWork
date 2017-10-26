package paint;

public class TotalCost {

    public int wallHeight;
    public int wallWidth;
    public int totalArea;

    public TotalCost(int wH, int wW){

        wallHeight=wH;
        wallWidth=wW;

    }

    public int calculateTotalArea(int height, int width){

        int totalArea;

        totalArea=height*width;

        return totalArea;
    }

    public void calculateCost(int area){

        int a = area;

        int cmVolume=20;
        int cmArea=10;
        double cmCost=19.99;

        int ajVolume=15;
        int ajArea=11;
        double ajCost=17.99;

        int dpVolume=10;
        int dpArea=20;
        double dpCost=25.00;

        int cmPaint= cmVolume * cmArea;
        double cmNumTins = (int)Math.ceil(a/cmPaint);
        cmCost=cmCost * cmNumTins;
        String toString;
        toString="To cover the given walls, it would require "+cmNumTins+" tins of Cheapo Max, costing £"+cmCost;
        System.out.println(toString);

        int ajPaint= ajVolume * ajArea;
        double ajNumTins = (int)Math.ceil(a/ajPaint);
        ajCost=ajCost * ajNumTins;
        toString="To cover the given walls, it would require "+ajNumTins+" tins of Average Joes, costing £"+ajCost;
        System.out.println(toString);

        int dpPaint= dpVolume * dpArea;
        double dpNumTins = (int)Math.ceil(a/dpPaint);
        dpCost=dpCost * dpNumTins;
        toString="To cover the given walls, it would require "+dpNumTins+" tins of Average Joes, costing £"+dpCost;
        System.out.println(toString);

        if(cmNumTins>ajNumTins && cmNumTins>dpNumTins){
            System.out.println("Cheapo Max uses the most amount of tin");
        }else if(ajNumTins>cmNumTins && ajNumTins>dpNumTins){
            System.out.println("Average Joe uses the most amount of tins");
        }else if(dpNumTins>ajNumTins && dpNumTins>cmNumTins){
            System.out.println("Duluxourous Paints uses the most amount of tins");
        }else{
            System.out.println("They all use the same amount of tins");
        }

        if(cmCost<ajCost && cmCost<dpCost){
            System.out.println("Cheapo Max is the cheapest");
        }else if(ajCost<cmCost && ajCost<dpCost){
            System.out.println("Average Joes is the cheapest");
        }else if(dpCost<cmCost && dpCost<ajCost){
            System.out.println("Duxulourous Paints is the cheapest");
        }

    }

}
