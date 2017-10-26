package level2;

public class BlackJack {

    public static void main(String [] args){

        BlackJack bJ= new BlackJack();
        System.out.println("Task1: (x=18, y=21): " + bJ.blackJack(18,21));
        System.out.println("Task1: (x=20, y=18): " + bJ.blackJack(20,18));
        System.out.println("Task1: (x=22, y=22): " + bJ.blackJack(22,22));

        System.out.println("Task2: (1,2,3): "+ bJ.uniqueSum(1,2,3));
        System.out.println("Task2: (3,3,3): "+ bJ.uniqueSum(3,3,3));
        System.out.println("Task2: (1,1,2): "+ bJ.uniqueSum(1,1,2));

        System.out.println("Task3:(65, true): "+bJ.tooHot(65, true));
        System.out.println("Task3:(65, false): "+bJ.tooHot(65, false));
        System.out.println("Task3:(95, true): "+bJ.tooHot(95, true));
        System.out.println("Task3:(95, false): "+bJ.tooHot(95, false));

    }

    private int blackJack(int x, int y) {

        int value = 0;

        if (x > 21 || y > 21) {

            value = 0;

        } else if(x>y){
            value=x;
        }else{
            value=y;
        }

        return value;
    }

    private int uniqueSum(int x, int y, int z){

        int sum=0;

        if(x==y && y==z && x==z){
            sum=0;
        }else if(x==y){
            sum=z;
        }else if(y==z){
            sum=x;
        }else if(x==z){
            sum=y;
        }else{
            sum=x+y+z;
        }

        return sum;

    }

    private boolean tooHot(int temperature, boolean isSummer){

        boolean value;

        if((temperature >=60) && (temperature <=90) && isSummer==false){

            value=true;

        } else{
            value=false;

        }

        return value;

    }
}
