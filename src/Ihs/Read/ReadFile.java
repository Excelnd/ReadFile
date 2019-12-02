package Ihs.Read;

import java.io.File;
import java.util.Scanner;

public class ReadFile {

    private Scanner x;

    public void openFile() {
        try {
            x = new Scanner(new File("chinese.txt"));
        } catch(Exception e) {
            System.out.println("Could not find file");
        }
    }

    public void readFile() {
        while(x.hasNext()) {
            String c = x.next();
            String d = x.next();
            String e = x.next();

            System.out.printf("%s %s %s", c, d, e);
        }
    }

    public void closeFile() {
        x.close();
    }
}
