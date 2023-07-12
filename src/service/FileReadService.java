package service;

import utils.Constants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReadService {

    public static void getReadData(String fileName) {
        String strPath = Constants.BASE_PATH_IN + fileName;
        FileReadService.getOutput(readFromFile(strPath));

    }

    public static String readFromFile(String strPath) {
        try {
            return Files.readString(
                    Path.of(strPath
                    ));
        } catch (IOException e) {
            return "Something wrong " + e.getMessage();
        }
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}
