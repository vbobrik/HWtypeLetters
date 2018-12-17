
import com.sun.java_cup.internal.runtime.Scanner;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Runner {
    private int letter;
    public static void main(String[] args) throws FileNotFoundException {
        Reader mess = new FileReader();
        Reader mess1 = new ConsoleReader();
        mess.startMessage();
        mess.typeLetter();
        mess.findLetter();
        mess1.findLetter();
    }

    /*public void typeLetter() {
        letter = System.in.read();
    }*/
}
