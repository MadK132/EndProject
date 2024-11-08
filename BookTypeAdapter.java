import com.google.gson.*;

import java.lang.reflect.Type;

public class BookTypeAdapter implements JsonSerializer<Book>, JsonDeserializer<Book> {

    @Override
    public JsonElement serialize(Book book, Type type, JsonSerializationContext context) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("title", book.title);
        jsonObject.addProperty("author", book.author);
        jsonObject.addProperty("quantity", book.quantity);
        jsonObject.addProperty("type", book.getType());

        return jsonObject;
    }

    @Override
    public Book deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        String title = jsonObject.get("title").getAsString();
        String author = jsonObject.get("author").getAsString();
        int quantity = jsonObject.get("quantity").getAsInt();
        String bookType = jsonObject.get("type").getAsString();

        if ("Physical".equalsIgnoreCase(bookType)) {
            return new PhysicalBook(title, author, quantity);
        } else if ("EBook".equalsIgnoreCase(bookType)) {
            return new EBook(title, author, quantity);
        }

        throw new JsonParseException("Unknown book type: " + bookType);
    }
}
