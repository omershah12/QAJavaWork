public class Parameters {

    public static void main(String[] args){

       Parameters p = new Parameters();

       System.out.println(p.accept("Hello Wolrd"));
    }


    private String accept(String message){
        return message;
    }

}

