import java.util.*;
import java.io.*;

public class PersonList {
    private LinkedList<Person> myList;

    // constructor
    public PersonList() {
        myList = new LinkedList<>();
    }

    // store(): read persons from input and add to list
    public void store(Scanner inputs) {
        while (inputs.hasNextLine()) {
            String line = inputs.nextLine().trim();
            if (line.isEmpty()) continue; // skip blank lines

            String[] values = line.split(",");
            if (values.length < 3) {
                System.out.println("Skipping invalid line: " + line);
                continue;
            }

            for (int i = 0; i < values.length; i++) {
                values[i] = values[i].trim();
            }

            Person personObj = new Person(values[0], values[1], values[2]);
            myList.add(personObj);
        }
    }

    // display(): print all persons
    public void display(PrintStream output) {
        for (Person personObj : myList) {
            output.println(personObj.toString());
        }
    }

    // find(): return index by id
    public int find(String idToSearch) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getId().equals(idToSearch)) {
                return i;
            }
        }
        return -1; // not found
    }
}
