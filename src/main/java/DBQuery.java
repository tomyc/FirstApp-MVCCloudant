import com.cloudant.client.api.Database;
import com.cloudant.client.api.model.IndexField;
import hotel.Hotel;

import java.util.List;

/**
 * Created by Tomasz on 06.07.2016.
 */
public class DBQuery {
    private void query() {

        Database db = getDb();

        // create Index
        db.createIndex("region","region","json",
                new IndexField[]{
                        new IndexField("region", IndexField.SortOrder.asc)
                }
        );

        System.out.println("Indeks został stworzony");

        List<Hotel> hotels = db.findByIndex("{\"region\" :\"morze\"}", Hotel.class);
        for (Hotel hotel : hotels) {
            System.out.println(hotel);
        }


    }

    private Database getDb()
    {
        return new DBConnect().getDb("hotel_db");
    }

    public static void main(String[] args)
    {
        new DBQuery().query();
    }



}
