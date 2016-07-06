/**
 * Created by Tomasz on 06.07.2016.
 */
public class RekomendModel {

    private String miejsceWakacji;


    public RekomendModel() {
        new DBConnect().getDb("hotel_db");
    }

    public void znajdzMiejsce(String region) {

        switch (region) {
            case "wieś":
                miejsceWakacji = "Gospodarstwo agroturystyczne Balladyna";
                break;
            case "miasto":
                miejsceWakacji = "Kino Wesoły Hipseter";
                break;
            case "góry":
                miejsceWakacji = "Zajad Pod Banią";
                break;
            case "morze":
                miejsceWakacji = "Krypa Babuni";
                break;
            default:
                miejsceWakacji = "Sorry, zostajesz na zajęciach z programowania";
        }
    }

    public String podajMiejsce(){
        return miejsceWakacji;
    }
}

