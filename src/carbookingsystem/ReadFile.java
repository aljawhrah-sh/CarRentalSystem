package carbookingsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    private Scanner input;
    String a;

    //1-Open
    public void openFile(String fileName) {
        try {
            input = new Scanner(new File(fileName));
        } catch (FileNotFoundException ex) {
            System.err.println("Error");

        }
    }

    //2-Read
    public void ReadFromFile() {
        try {
            while (input.hasNextLine()) {
                a = input.nextLine();
                System.out.println(a);
            }

        } catch (Exception ex) {
            System.err.println("Error");

        }

    }

    //3-close
    public void closeFile() {
        if (input != null) {
            input.close();

        }
    }

}
