package oop.labor04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        readFilePrintItsLineNumbered("labor-04/src/oop/labor04/lab4_1_input.csv");
    }

    public static void readFilePrintItsLineNumbered(String lab4_1_input) {
        try (Scanner scanner = new Scanner(new File(lab4_1_input))) {
            int nr=1;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(nr + " " + line);
                nr++;
            }

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static ArrayList<Person> readFromCSVFile(String fileName) {
        ArrayList<Person> persons = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
// trim: eliminates leading and trailing spaces
                String firstName = items[0].trim();
                String lastName = items[1].trim();
// Convert String→int: Integer.parseInt( String)
                int birthYear = Integer.parseInt(items[2].trim());
                persons.add(new Person(firstName, lastName, birthYear));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return persons;
    }


}
