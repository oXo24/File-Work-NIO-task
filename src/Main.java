
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

    public static String getExtension() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Choose desired extension of the file:
                1-txt;
                2-docx;
                3-doc;
                Enter a action number:""");
        int answer = scanner.nextInt();
        return switch (answer) {
            case 1 -> ".txt";
            case 2 -> ".docx";
            case 3 -> ".doc";
            default -> throw new IllegalStateException("Unexpected value: " + answer);
        };
    }

    public static String getFileName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file name without extension, e.g. ``notes``: ");
        return scanner.nextLine().trim() + getExtension();
    }

    public static String getFileText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you text: ");
        return scanner.nextLine().trim();
    }
}
