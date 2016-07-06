import com.cloudant.client.api.Database;
import com.cloudant.client.api.model.Response;
import hotel.Hotel;

/**
 * Created by Tomasz on 06.07.2016.
 */
public class DBAddDocument {
    public void create() {

        Database db = getDb();

        Hotel hotel = new Hotel();
        hotel.set_id("brak19");
        hotel.setNazwa("Sorry, zostajesz na zajęciach z programowania");
        hotel.setKoszt("0");
        hotel.setRegion("brak");

        Response r = db.post(hotel);

        System.out.println("Hotel zapisany. Id: " + r.getId() + ", rev: " + r.getRev());

    }

    private Database getDb() {
        return new DBConnect().getDb("hotel_db");
    }

    public static void main(String[] args) {
        new DBAddDocument().create();
    }

}
