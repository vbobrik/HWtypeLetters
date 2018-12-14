
import java.io.IOException;

public class Runner {
    private int letter;
    public static void main(String[] args) {
        Messages mess = new Messages();
        mess.startMessage();
        mess.typeLetter();
        mess.findLetter();
    }

    /*public void typeLetter() {
        letter = System.in.read();
    }*/
}
