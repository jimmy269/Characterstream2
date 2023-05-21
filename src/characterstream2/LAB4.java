
package characterstream2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class LAB4 {
    public static void main(String[] args) {
        InputStreamReader key = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(key);
        try {
            System.out.print("Enter your name: ");
            String name = input.readLine();
            System.out.println("Hello " + name);
            System.out.print("Enter your weight: ");
            String w = input.readLine();
            System.out.print("Enter your height: ");
            String h = input.readLine();
            System.out.println(Double.parseDouble(h) * Double.parseDouble(w));

        } catch (Exception e) {
            Logger.getLogger(LAB4.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }

    }
}
