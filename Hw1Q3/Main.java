import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        PersonList personList = new PersonList();

        // Read from file
        Scanner fileScanner = new Scanner(new File("persons.txt"));
        personList.store(fileScanner);
        fileScanner.close();

        // Display all
        personList.display(System.out);

        // Test find()
        System.out.println("Index of ID '123': " + personList.find("123"));
        System.out.println("Index of ID '234': " + personList.find("234"));
    }
}
