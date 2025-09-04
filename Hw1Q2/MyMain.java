import java.util.*;
import java.io.*;

public class MyMain{
    public static void store(Scanner inputs, LinkedList<Person> myList){
        while(inputs.hasNextLine()){
            String line =inputs.nextLine();
            String[] values = line.split(",");
            for(int i=0; i < values.length; i++){
                values[i] = values[i].trim();
            }
            Person personobj = new Person(values[0], values[1], values[2]);
            myList.add(personobj);
        } 
    }
    public static void display(PrintStream output, LinkedList<Person> mylist){
        for(Person personobj : mylist){
            output.println(personobj.toString());
        }
    }
    //find() method- return index of Person with given id, or -1 when not found.
    public static int find(String idToSearch, LinkedList<Person> myList){
        for(int i = 0; i < myList.size(); i++){
            if(myList.get(i).getId().equals(idToSearch)){
                return i;
            }
        }
        return -1; //when not found.
    }
    public static void main(String[] args) throws FileNotFoundException{
        LinkedList<Person> myList = new LinkedList<>();

        //Read data from the file
        Scanner fileScanner = new Scanner(new File("persons.txt"));
        store(fileScanner, myList);
        fileScanner.close();

        display(System.out, myList);

        System.out.println("Index of ID '123: " +find("123", myList));
        System.out.println("Index of ID '234: " +find("234", myList));
    }
}

