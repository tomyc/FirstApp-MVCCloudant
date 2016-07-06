import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Tomasz on 06.07.2016.
 */
public class RekomendControler {
    private RekomendModel model;
    private RekomendView view;

    public RekomendControler(RekomendView theView, RekomendModel theModel) {
        this.model = theModel;
        this.view = theView;

        this.view.addZnajdzListener(new ZnajdzListener());
    }

    private class ZnajdzListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String region = "";
            int wartosc = 0;
            try {


                region = view.getRegion();
                wartosc = view.getIndex();
                model.znajdzMiejsce(region);
            } catch (NumberFormatException ex) {
                view.displayErrorMessage("Zła wartość");
            }
            view.setWynikiWyszukiwaniaTP(model.podajMiejsce() + " "+wartosc);
            view.addItem("Nasza zmiana","4");
        }
    }
}
