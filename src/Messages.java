import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.Arrays;
import java.io.File;

public class Messages {
    private String error;
    private String letter;
    private char[] hz;


    public String getError() {
        return error;
    }

    public void startMessage() {
        System.out.println("Hello! Let's start!\n" +
                "Select point from the list, please:\n" +
                "1. Read from file\n" +
                "2. Read from console");
    }


    public void typeLetter() {
        Scanner a = new Scanner(System.in);

        do {

            letter = a.nextLine();
            switch (letter) {
                case "1":
                    System.out.println("Please, input any English letter");
                    break;
                case "2":
                    System.out.println("Please, input text for next step");
                    break;
                default:
                    System.out.println("Whoooops!\nIt's not correct enter");
                    break;
            }
        } while (!letter.equals("1") && !letter.equals("2"));

        String text = a.nextLine();
        System.out.println("You entered " + text);

       /* File file = new File("D:\MY\HWtypeLetters\src\resources\words.txt");
        Scanner scan = new Scanner(file);
        while(scan.hasNextLine()) {
            System.out.println(scan.next());
        }*/


        String x = a.nextLine();
        String [] savedText = text.split( " ");
        for(int i = 0; i < savedText.length; i ++) {
            System.out.println(savedText[i]);
            if(savedText[i].contains(x)) {
                //System.out.println("Finded words " + savedText[i];
                System.out.println("Finded words " + Arrays.asList(savedText));
            }
        }


    }

    public void findLetter() {

    }

}

