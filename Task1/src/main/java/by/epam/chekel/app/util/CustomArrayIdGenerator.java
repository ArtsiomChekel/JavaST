package by.epam.chekel.app.util;

public class CustomArrayIdGenerator {
    private static int currentId = 0;

    private CustomArrayIdGenerator() {
    }

    public static int generate() {
        return ++currentId;
    }
}
