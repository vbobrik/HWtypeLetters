import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class Reader {
    private String error;
    private String letter;
    private String text;
    Scanner a = new Scanner(System.in);


     public abstract void findLetter();

    public void typeLetter() throws FileNotFoundException {
        //this.a.nextLine();
        do {

            letter = a.nextLine();
            switch (letter) {
                case "1":
                    System.out.println("Please, input any English letter");

                    //File file = new File("D:/MY/HWtypeLetters/src/resources/words.txt");
                    File file = new File("/Users/Valentina/IdeaProjects/HWtypeLetters/resources/class.txt");
                    Scanner scan = new Scanner(file);
                    while (scan.hasNext()) {
                        String words = scan.next();
                        System.out.println(scan.next());
                    }

                    break;

                case "2":
                    System.out.println("Please, input text for next step");
                    text = a.nextLine();
                    findLetter();
                    break;
                default:
                    System.out.println("Whoooops!\nIt's not correct enter");
                    break;
            }
        } while (!letter.equals("1") && !letter.equals("2"));

        //   FileReader f1 = new FileReader("/Users/Valentina/IdeaProjects/HWtypeLetters/resources/class.txt");
        //BufferedReader b = new BufferedReader(f1);
    }


    public String getError() {
        return error;
    }
}
