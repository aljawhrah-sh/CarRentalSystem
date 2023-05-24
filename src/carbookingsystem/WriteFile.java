package carbookingsystem;

import java.io.FileNotFoundException;
import java.util.Formatter;

public class WriteFile {

    private Formatter output;

    //1-open
    public void OpenFile(String fileName) {
        try {
            output = new Formatter(fileName);
        } catch (FileNotFoundException ex) {
            System.out.println("Error!");

        }
    }

    //2-Write
    public void WriteToFile(Car c) {
        try {
            output.format("%s%n", c.toString());
        } catch (Exception ex) {
            System.out.println("Error: can't Write to a File...");

        }
    }

    //3-Close
    public void CloseFile() {
        if (output != null) {
            output.close();

        }

    }

}
