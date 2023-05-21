
package characterstream2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class LAB1 {
    public static void main(String[] args) {
        try {
            FileWriter output = new FileWriter("data.txt");
            output.write("Hello World!");
            output.write("Welcome to Java");
            output.close();
        }catch (Exception e){
            throw new RuntimeException(e);
        }

        try {
            FileReader input = new FileReader("data.txt");
            int ch;
            while ((ch = input.read()) != -1){
                System.out.print((char) ch);
            }
            input.close();
        }catch (FileNotFoundException ex) {
            Logger.getLogger(LAB1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }
}