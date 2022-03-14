import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXParseException;

public class BankErrorHandler implements ErrorHandler {
    public void warning(SAXParseException e){
        System.out.println(getLineColumnNumber(e) + " - " + e.getLineNumber());
    }
    public void error(SAXParseException e){
        System.out.println(getLineColumnNumber(e) + " - " + e.getLineNumber());
    }

    public void fatalError(SAXParseException e){
        System.out.println(getLineColumnNumber(e) + " - " + e.getLineNumber());
    }

    private String getLineColumnNumber(SAXParseException e){
        return e.getLineNumber() + " : " + e.getLineNumber();
    }
}
