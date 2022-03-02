package by.epam.chekel.app.reader;

import by.epam.chekel.app.exception.CustomException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class CustomTxtReader {
    static Logger LOGGER = LogManager.getLogger();

    public List<String> readStringsFromTxt(String path) throws CustomException {
        if (!Files.exists(Paths.get(path))) {
            LOGGER.error("File in path: {} is not found", path);
            throw new CustomException("File in path: " + path + " is not found");
        }

        if (!Files.isReadable(Paths.get(path))) {
            LOGGER.error("File in path {} is not readable", path);
            throw new CustomException("File in path: " + path + " is not readable");
        }

        List<String> result = new ArrayList<String>();
        try (FileReader fileReader = new FileReader(path);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String lineOfFile;
            while ((lineOfFile = bufferedReader.readLine()) != null) {
                result.add(lineOfFile);
            }
        } catch (IOException e) {
            LOGGER.error("File in path: " + path + " is not found or is not readable");
            throw new CustomException("File in path: " + path + " is not found or is not readable");
        }
        return result;
    }
}
