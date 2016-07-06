/**
 * Created by Tomasz on 06.07.2016.
 */


import com.cloudant.client.api.ClientBuilder;
import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;

import java.net.MalformedURLException;
import java.net.URL;


public class DBConnect {

    private CloudantClient cloudantClient = null;

    public CloudantClient connect() {
        //Tworzenie klienta
        try {
            //Trzeba tutaj wkleić informacje z forum
            cloudantClient = ClientBuilder.url(new URL("xxxxxxxxxxxxxxxxxxxxxxxxx.cloudant.com"))
                    .username("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx-bluemix")
                    .password("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxb7")
                    .build();
            System.out.println("Połączenie do serwera Cloudant - " + cloudantClient.getBaseUri());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


        return cloudantClient;
    }


    public Database getDb(String dbName) {

        // użycie bazy
        Database db = connect().database(dbName, true);

        System.out.println("Wybrana baza danych - " + db.getDBUri());

        return db;
    }

}