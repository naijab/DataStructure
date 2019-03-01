package map;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestWordFrequency {
    public static void main(String[] args) {
        FrequencyCounter fc = new FrequencyCounter();
        try {
            fc.process("data.txt");
            System.out.println(fc);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestCountWord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
