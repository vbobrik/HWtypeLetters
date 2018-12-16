import java.util.Scanner;

public class ConsoleReader extends Reader{
private String text;

    public ConsoleReader() {

    }



@Override
    public void findLetter() {
        int q = 0;
        while (q == 0) {
            System.out.println("Enter one letter and I'll find it into the text");
            String x = a.nextLine();
            String[] savedText = text.split(" ");
            System.out.println("Finded words: ");

            for (int i = 0; i < savedText.length; i++) {
                if (savedText[i].contains(x)) {
                    System.out.println(savedText[i]);
                    q++;
                }

            }
            if (q == 0) {
                System.out.println("Whoops!\nMatches are absent!");
            }
        }

    }

}