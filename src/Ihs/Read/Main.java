package Ihs.Read;

public class Main {

    public static void main(String[] args) {

        ReadFile rd = new ReadFile();
        rd.openFile();
        rd.readFile();
        rd.closeFile();
    }
}
