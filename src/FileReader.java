import jdk.management.resource.internal.inst.FileInputStreamRMHooks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReader extends Reader{
    private String word;
    private String text;
    private String p = "";

    public FileReader() {
        super();
        this.word = word;
    }

    @Override
   public void findLetter()   {
       // FileInputStream() fis = new FileInputStream("D:/MY/HWtypeLetters/src/resources/words.txt");
        //int c = fis.read;

        File s = new File("D:/MY/HWtypeLetters/src/resources/words.txt");
        try {
        Scanner scan = new Scanner(s);
        while(scan.hasNext()) {
            p += scan.next() + " ";
        }} catch(IOException exc) {
            System.out.println("error");
        }
        int q = 0;
        while (q == 0) {
            System.out.println("Enter one letter and I'll find it into the text");
            String x = a.nextLine();
            String[] savedText = p.split(" ");
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
        System.out.println("--------------*****---------");
        startMessage();

    }
}
