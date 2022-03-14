import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;


public class ConsoleBankHandler extends DefaultHandler {
    public void startDocument() {
        System.out.println("Parsing started");
    }

    public void startElement(String uri, String localName, String qName, Attributes attrs) {
        String tagData = qName + " ";
        for (int i = 0; i < attrs.getLength(); i++) {
            tagData += " " + attrs.getQName(i) + "=" + attrs.getValue(i);
        }
        System.out.println(tagData);
    }

    public void characters(char[] ch, int start, int length) {
        System.out.println(new String(ch, start, length));
    }

    public void endElement(String uri, String localName, String qName) {
        System.out.println(" " + qName);
    }

    public void endDocument() {
        System.out.println("\nParsing ended");
    }
}
