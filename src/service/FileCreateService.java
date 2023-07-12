package service;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCreateService {

    public static String createFile(String strPath) {
        Path newFile;
        try {
            newFile = Files.createFile(Path.of(strPath));
        } catch (FileAlreadyExistsException e) {
            return "File already exists!";
        } catch (IOException e) {
            return "Something wrong " + e.getMessage();
        }
        return newFile + " created!";
    }
}
