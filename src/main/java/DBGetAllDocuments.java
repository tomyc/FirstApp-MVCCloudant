import com.cloudant.client.api.Database;
import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.views.AllDocsRequest;
import com.cloudant.client.api.views.AllDocsResponse;
import hotel.Hotel;

import java.io.IOException;
import java.util.List;

/**
 * Created by Tomasz on 06.07.2016.
 */
public class DBGetAllDocuments {

    private Hotel[] allHotels = null;
    public void get() throws IOException {
        //podłącz się do bazy
        Database db = getDb();

        //Pobierz wszystkie dokumenty
        try {
            List<Hotel> allHotels = db.getAllDocsRequestBuilder().includeDocs(true).build().getResponse().getDocsAs(Hotel.class);
            for (Hotel hotel : allHotels ) {
                System.out.println(hotel);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Database getDb()
    {
        return new DBConnect().getDb("hotel_db");
    }

    public static void main(String[] args)
    {
        try {
            new DBGetAllDocuments().get();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
