package creational;
import java.io.IOException;

public class JSONBookMetadataExporter extends BookMetadataExporter{
    @Override
    public BookMetadataFormatter allBookExporter(){
        return new JSONBookMetadataFormatter();
    }
}
