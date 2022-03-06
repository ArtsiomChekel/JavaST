package by.epam.chekel.app.exception;

import java.lang.Exception;

public class CustomException extends Exception {
    public CustomException() {
        super();
    }

    public CustomException(String massage) {
        super(massage);
    }

    public CustomException(String massage, Throwable cause) {
        super(massage, cause);
    }

    public CustomException(Throwable cause) {
        super(cause);
    }
}
