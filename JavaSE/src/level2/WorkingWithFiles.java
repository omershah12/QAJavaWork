package level2;

import java.io.*;
import java.util.ArrayList;


public class WorkingWithFiles {

    private String name;
    private int age;
    private String jobTitle;

    private String contentTemp;




    private static final String FILENAME = "C:\\Users\\Admin\\Desktop\\test.txt";
    private static ArrayList<WorkingWithFiles> al = new ArrayList<WorkingWithFiles>();
    private static ArrayList<WorkingWithFiles> wff = new ArrayList<WorkingWithFiles>();


    public WorkingWithFiles(String name, int age, String jobTitle){

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

    public String format(){
        return this.name + "," + this.age + "," + this.jobTitle;
    }

    public void list(){


        int i=0;

        while(al.size()>i)
        {
            System.out.println("While Loop: "+al.get(i).toString());
            i++;

        }

        for (WorkingWithFiles temp : al){

            System.out.println("Advanced For: "+temp.toString());

        }

    }

    public void searchList(String searchString){

        ArrayList<WorkingWithFiles> search = new ArrayList<WorkingWithFiles>();

        for(WorkingWithFiles string : al){
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

    public void bufferedWriter(){

        BufferedWriter bw = null;
        FileWriter fw = null;


        try {
        fw = new FileWriter(FILENAME);
        bw = new BufferedWriter(fw);




            for (WorkingWithFiles temp : al) {

//                wff.add(temp);
//
//                contentTemp = wff.toString();

                String temp1=temp.format();

                bw.write(temp1);
                bw.newLine();

                System.out.println("Advanced For: " + temp.toString());

            }
            System.out.println("Done");

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (bw != null)
                    bw.close();

                if (fw != null)
                    fw.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }

    }

    public void bufferedReader(){


        BufferedReader br = null;
        FileReader fr = null;

        try {

            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);

            String sCurrentLine;



            while ((sCurrentLine = br.readLine()) != null) {

                String temp = sCurrentLine.toString();

                String reslut [] = sCurrentLine.split(",");
                System.out.println(temp);
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }

    }

    public static void main(String [] args){

        WorkingWithFiles omer = new WorkingWithFiles("Omer",22, "Trainee");

//        omer.displayDetails();

        WorkingWithFiles bob = new WorkingWithFiles("Bob", 40, "Unemployed");

        WorkingWithFiles bob2 = new WorkingWithFiles("Bob", 40, "Unemployed");
        WorkingWithFiles bob3 = new WorkingWithFiles("Bob", 40, "Unemployed");
        WorkingWithFiles bob4 = new WorkingWithFiles("Bob", 40, "Unemployed");




//        bob.displayDetails();
//
//        System.out.println(omer.toString());
//
//        System.out.println(bob.toString());
//
//        System.out.println();

       System.out.println(al.toString());

//        omer.list();
//
//        System.out.println("Search Query: Omer");
//
//        omer.searchList("Omer");
//
//        System.out.println("Search Query: Bob");
//
//        omer.searchList("Bob");
//
//        System.out.println("Search Query: John");
//
//        omer.searchList("John");

        bob.bufferedWriter();

        bob.bufferedReader();

    }

}
