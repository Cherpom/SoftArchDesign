package creational;

import org.junit.experimental.theories.internal.ParameterizedAssertionError;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection{

    public void export(PrintStream out) throws IOException, ParserConfigurationException {
        // Please implement this method. You may create additional methods as you see fit.
        BookMetadataFormatter formatter = allBookExporter();
        for (Book book : books){
            formatter.append(book);
        }
        out.print(formatter.getMetadataString());
    }

    public abstract BookMetadataFormatter allBookExporter() throws IOException, ParserConfigurationException;
}
