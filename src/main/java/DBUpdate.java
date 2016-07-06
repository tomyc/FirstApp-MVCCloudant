import com.cloudant.client.api.Database;
import com.cloudant.client.api.model.Response;
import hotel.Hotel;

/**
 * Created by Tomasz on 06.07.2016.
 */
public class DBUpdate {
    public void update()
    {
        Database db = getDb();

        Hotel hotel = db.find(Hotel.class,"babuni13");

        hotel.setKoszt("80");

        Response r =db.update(hotel);

        System.out.println("Akrualizacja dokumentu Id: " + r.getId() + ", rev: " + r.getRev());
    }

    private Database getDb()
    {
        return new DBConnect().getDb("hotel_db");
    }

    public static void main(String[] args)
    {
        new DBUpdate().update();
    }


}
