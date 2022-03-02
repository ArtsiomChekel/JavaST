package by.epam.chekel.app.validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Pattern;

public class ArrayStringsValidator {
    private static final Logger LOGGER = LogManager.getLogger();
    private final String ARRAY_STRING_REGEX = "\\s*((0|-?[1-9]\\d*)\\s+)*(0|-?[1-9]\\d*)\\s*";

    public void ArrayStringsValidator() {
        LOGGER.info("ArrayStringsValidator");
    }

    public boolean isArrayStringsCorrect(String line) {
        LOGGER.info("Is line correct");
        if (line != null && !line.isEmpty()) {
            return Pattern.matches(ARRAY_STRING_REGEX, line);
        }
        return (false);
    }
}
