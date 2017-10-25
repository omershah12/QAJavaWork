public class HelloWordExample {

    static String a = "Hello World!";

    static int [] arrayInts= {3,4,5,6,7,8,9,11,12,13};

    static int [] newArray= new int [11];


    public static void main(String[] args) {

        HelloWordExample hW = new HelloWordExample();

        System.out.println("Hello World!");

        System.out.println("Variable: "+ a);

        System.out.println("Assignment: Hello World!");

        System.out.println(hW.paramters("Parameter: Hello Wolrd!"));

        System.out.println("Return Types: " + hW.returnTypes());

        System.out.println("Parameters/Operators (x=5, y=6): " + hW.operators(5, 6));

        System.out.println("Conditionals (x=5, y=6, true): " + hW.conditionals(5, 6, true));

        System.out.println("Conditionals (x=5, y=6, false): " + hW.conditionals(5, 6, false));

        System.out.println("Conditional 2 (x=1, y=0): " + hW.conditionalsTwo(1, 0));

        System.out.println("Conditional 2 (x=0, y=5): " + hW.conditionalsTwo(0, 5));

        System.out.println("Iteration (x=0, y=5)");
        System.out.println(hW.iteration(0, 5));

        System.out.println("Array ([0]=3, [1]=4): " + hW.conditionalsTwo(arrayInts[0],arrayInts[1]));

        hW.arrays();

        System.out.println();

        hW.arraysTwo();

    }

    private String paramters(String message) {

        return message;

    }

    private String returnTypes() {

        String text = "Hello World";

        return text;

    }

    private int operators(int x, int y) {

        int sum = 0;

        sum = x + y;

        return sum;

    }

    private int conditionals(int x, int y, boolean z) {

        int sum = 0;

        if (z == true) {

            sum = x + y;

        }

        if (z == false) {

            sum = x * y;

        }

        return sum;
    }


    private int conditionalsTwo(int x, int y) {

        int value = 0;

        if (x == 0 && y != 0) {

            value = y;

        } else if (x != 0 && y == 0) {

            value = x;

        }

        return value;
    }


    private int iteration(int x, int y) {

        int value=0;

        for(int i=0; i<9; i++){

            if (x == 0 && y != 0) {

                value = y;

            } else if (x != 0 && y == 0) {

                value = x;

            }

            System.out.print(value+", ");
        }

        return value;
    }


    private void arrays(){

        for(int i: arrayInts){
            System.out.print(i+ ", ");
        }

    }

    private void arraysTwo(){

        for (int i =0; i <=10; i++){
            newArray[i]=i;
        }

        for(int i: newArray){
            System.out.print(i+ ", ");
        }

        System.out.println();

        for(int i:  newArray){

            System.out.print(i*10+", ");

        }
    }
}







