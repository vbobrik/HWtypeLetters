import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Messages {
    private String error;
    private char letter;
    private char[] hz;


    public String getError() {
        return error;
    }

    public void startMessage() {
        System.out.println("Hello! Let's start!\nSelect point from the list, please:\n1. Read from file\n2. Read from console");
    }


    public void typeLetter() {

//        do {
            try {
                letter = (char) System.in.read();
                System.out.println("Print " + letter);
            } catch (IOException e) {
                e.printStackTrace();
            }
//        } while (letter != 1 && letter != 2);
//        stri
//        int input;

//        Scanner in = new Scanner(System.in);
//        try {
//            input = in.nextInt();
//        } catch (Exception ex)
//        {
//            input = in.nextInt();
//        }

        if (letter == 1) {
            System.out.println("Write 1");
        } else if (letter == 2) {
            System.out.println("Write 2");
        }
//        Console console = null;
//        console = System.console();
//        if(console!=null)
//            String name = console.readLine("Name: ");
//        String input;
//        System.out.print("Please enter user name : ");
//        String username = null;
//        input = System.in.;
//        if (letter = 1)
//            System.out.println("Please, input text for next step");

    }






       /* try {
            if (letter >= "a" & letter <= "z") {
                System.out.println();
            } else System.out.println("Woooops!\nIt's doesn't look letter" + U + 2639);
        } catch (IOException ioe) {
            System.out.println();
        }*/


}