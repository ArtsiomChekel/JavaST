package by.epam.chekel.app;

import by.epam.chekel.app.entity.CustomArray;
import by.epam.chekel.app.exception.CustomException;
import by.epam.chekel.app.parser.CustomParserFromString;
import by.epam.chekel.app.reader.CustomTxtReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Main {

    public static final Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) throws CustomException {
        LOGGER.trace("Writing string");
        System.out.println("Hello World!");
        CustomArray array = new CustomArray(5, 6, 8, 2, 3, 7, 9);
        LOGGER.trace("Array was created");
        System.out.println(array);
        String path = "C:/Users/achek/IdeaProjects/EPAM JavaST/Task1/src/main/resources/Data.txt";

        CustomTxtReader txtReader = new CustomTxtReader();
        List<String> listOfStrings = txtReader.readStringsFromTxt(path);
        LOGGER.info("ReadString");
        System.out.println(listOfStrings);
        CustomParserFromString parserFromString = new CustomParserFromString();
    }
}
