package service;

import utils.Constants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriteService {

    public static void getWriteData(String fileName, String fileText) {
        String strPath = Constants.BASE_PATH_IN + fileName;
        FileWriteService.getOutput(FileCreateService.createFile(strPath));
        FileWriteService.getOutput(writeToFile(
                Paths.get(strPath),
                fileText
        ));
    }

    public static String writeToFile(Path path, String content) {
        try {
            Files.writeString(path, content);
        } catch (IOException e) {
            return e.getMessage();
        }
        return "Recorded in: " + path;
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}
