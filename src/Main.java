
import service.FileReadService;
import service.FileWriteService;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        chooser();
    }

    public static void chooser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                What do you want to do?
                1-Write new file;
                2-Read existing file;
                Enter a action number:""");
        int answer = scanner.nextInt();
        if (answer == 1) {
            FileWriteService.getWriteData(getFileName(), getFileText());
        } else if (answer == 2) {
            FileReadService.getReadData(getFileName());
        } else System.out.println("Error occured");
    }

    public static String getFileName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file name without extension, e.g. ``notes``: ");
        return scanner.nextLine().trim() + ".txt";
    }

    public static String getFileText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you text: ");
        return scanner.nextLine().trim();
    }
}
