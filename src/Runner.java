
import java.io.FileNotFoundException;
import java.io.IOException;

public class Runner {
    private int letter;
    public static void main(String[] args) throws FileNotFoundException {
        Messages mess = new Messages();
        mess.startMessage();
        mess.typeLetter();
        //mess.findLetter();
    }

    /*public void typeLetter() {
        letter = System.in.read();
    }*/
}
