
package characterstream2;

import java.io.*;
import java.util.logging.Logger;

public class LAB2 {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("data.txt");
            BufferedWriter output = new BufferedWriter(file);
            output.write("Hello World!");
            output.write("Welcome to Java");
            output.close();
        }catch (FileNotFoundException ex) {
            Logger.getLogger(LAB2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        try {
            FileReader file = new FileReader("data.txt");
            BufferedReader input = new BufferedReader(file);
            String ch;
            while ((ch = input.readLine()) != null){
                System.out.println(ch);
            }
            input.close();
        }catch (FileNotFoundException ex) {
            Logger.getLogger(LAB2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
