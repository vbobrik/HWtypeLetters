import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

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
            System.out.println("Print " + letter);
            switch (letter) {
                case "1":
                    System.out.println("Please, input any English letter");
                    break;
                case "2":
                    System.out.println("Please, input text for next step");
                    break;
                default:
                    System.out.println("NOoo");
                    break;
            }
        } while (!letter.equals("1") && !letter.equals("2"));
    }

//        Scanner in = new Scanner(System.in);
//        try {
//            input = in.nextInt();
//        } catch (Exception ex)
//        {
//            input = in.nextInt();
//        }


//
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
            } else System.out.println("Woooops!\nIt's doesn't look letter" + 0x263A);
        } catch (IOException ioe) {
            System.out.println();
        }*/


