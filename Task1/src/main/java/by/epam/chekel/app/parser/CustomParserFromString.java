package by.epam.chekel.app.parser;

import by.epam.chekel.app.validator.ArrayStringsValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import by.epam.chekel.app.entity.CustomArray;
import by.epam.chekel.app.exception.CustomException;

public class CustomParserFromString {
    private static final Logger LOGGER = LogManager.getLogger();
    private String splitterRegex = "[-,\\s]+";

    public CustomParserFromString() {
        LOGGER.info("Creating new CustomParserFromString");
    }

    public CustomParserFromString(String splitterRegex) {
        LOGGER.info("creating new CustomArrayParser(" + splitterRegex + ")");
        this.splitterRegex = splitterRegex;
    }

    public CustomArray parse(String line) throws CustomException {
        LOGGER.info("parse");
        ArrayStringsValidator validator = new ArrayStringsValidator();
        if (!validator.isArrayStringsCorrect(line)) {
            throw new CustomException("Incorrect line: '" + line + "'");
        }
        if (line.isEmpty()) {
            return new CustomArray();
        }
        String[] lineParts = line.split(splitterRegex);
        System.out.print(lineParts);
        int[] arrayElements = parseIntArrayFromStringArray(lineParts);
        return new CustomArray(arrayElements);
    }

    private int[] parseIntArrayFromStringArray(String[] strings) {
        LOGGER.info("parse int[] from String[]");
        int[] intsValue = new int[strings.length];
        for (int i = 0; i < intsValue.length; i++) {
            intsValue[i] = Integer.parseInt(strings[i]);
        }
        return intsValue;
    }
}
