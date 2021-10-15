package creational;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    //Variable
    JSONObject book;
    JSONArray bookList;

    public JSONBookMetadataFormatter() {
        reset();
    }

    @Override
    public JSONBookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see fit.
        book = new JSONObject();
        bookList = new JSONArray();
        book.put("Books", bookList);
        return this;
    }

    @Override
    public JSONBookMetadataFormatter append(Book b) {
        // Please implement this method. You may create additional methods as you see fit.
        JSONObject tempBook = new JSONObject();
        JSONArray tempBookList = new JSONArray();
        for(String author : b.getAuthors()){
            tempBookList.add(author);
        }

        tempBook.put(Book.Metadata.ISBN.value, b.getISBN());
        tempBook.put(Book.Metadata.AUTHORS.value, tempBookList);
        tempBook.put(Book.Metadata.TITLE.value, b.getTitle());
        tempBook.put(Book.Metadata.PUBLISHER.value, b.getPublisher());

        bookList.add(tempBook);

        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see fit.
        return book.toString();
    }
}
