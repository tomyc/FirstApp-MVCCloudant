package hotel;

/**
 * Created by Tomasz on 06.07.2016.
 */
public class Hotel {
    private String _id;
    private String _rev;
    private String nazwa;
    private String koszt;
    private String region;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_rev() {
        return _rev;
    }

    public void set_rev(String _rev) {
        this._rev = _rev;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getKoszt() {
        return koszt;
    }

    public void setKoszt(String koszt) {
        this.koszt = koszt;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String toString(){
        return "Nazwa: "+nazwa+", Koszt: "+koszt+", Region: "+region;
    }
}
