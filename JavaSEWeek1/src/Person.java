import java.util.ArrayList;

public class Person {

    private String name;
    private int age;
    private String jobTitle;



    private ArrayList<Person> al = new ArrayList<Person>();


    public Person(String name, int age, String jobTitle){

        this.name=name;

        this.age=age;

        this.jobTitle=jobTitle;

        al.add(this);

    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getJobTitle(){
        return jobTitle;
    }

    public void displayDetails(){

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Job Title: "+ jobTitle);
        System.out.println();

   }

   public String toString(){

       return "Name: "+this.name+ " Age: "+this.age+" Job Title: "+this.jobTitle;

   }

   public void list(){


       int i=0;

       while(al.size()>i)
       {
           System.out.println("While Loop: "+al.get(i).toString());
           i++;

       }

       for (Person temp : al){

           System.out.println("Advanced For: "+temp.toString());

       }

   }

   public void searchList(String searchString){

       ArrayList<Person> search = new ArrayList<Person>();

     for(Person string : al){
         if(string.getName() !=null && string.getName()==(searchString)){
             search.add(string);
         }
     }

     if(search.isEmpty()){
         System.out.println("No results");
     }else{

         System.out.println(search.toString());

     }
   }

   public static void main(String [] args){

       Person omer = new Person("Omer",22, "Trainee");

       omer.displayDetails();

       Person bob = new Person("Bob", 40, "Unemployed");

       bob.displayDetails();

       System.out.println(omer.toString());

       System.out.println(bob.toString());

       System.out.println();

//       System.out.println(al.toString());

       omer.list();

       System.out.println("Search Query: Omer");

       omer.searchList("Omer");

       System.out.println("Search Query: Bob");

       omer.searchList("Bob");

       System.out.println("Search Query: John");

       omer.searchList("John");
 }

}
