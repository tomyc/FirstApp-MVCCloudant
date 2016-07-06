import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by Tomasz on 06.07.2016.
 */
public class RekomendView extends JFrame {
    private JTextField regionTF;
    private JTextField wartoscTF;
    private JButton znajdzButton;
    private JTextPane wynikiWyszukiwaniaTP;
    private JPanel rekomendPanel;
    private JComboBox comboBox1;

    RekomendView(){
        comboBox1.addItem(new ComboItem("Visible String 1", "1"));
        comboBox1.addItem(new ComboItem("Visible String 2", "2"));
        comboBox1.addItem(new ComboItem("Visible String 3", "3"));
        this.add(rekomendPanel);
        this.setSize(600,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public String getRegion(){
        return regionTF.getText();
    }

    public int getWartosc(){
        return Integer.parseInt(wartoscTF.getText());
    }

    public int getIndex(){
        Object item = comboBox1.getSelectedItem();
        String value = ((ComboItem)item).getValue();
        return Integer.parseInt(value);
    }

    public void setWynikiWyszukiwaniaTP(String miejsce){
        wynikiWyszukiwaniaTP.setText(miejsce);
    }

    public void addItem(String item,String keyItem){
        comboBox1.addItem(new RekomendView.ComboItem(item, keyItem));
    }

    void addZnajdzListener(ActionListener listenerForZnajdzBtn){
        znajdzButton.addActionListener(listenerForZnajdzBtn);
    }

    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this,errorMessage);
    }

    class ComboItem
    {
        private String key;
        private String value;

        public ComboItem(String key, String value)
        {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString()
        {
            return key;
        }

        public String getKey()
        {
            return key;
        }

        public String getValue()
        {
            return value;
        }
    }



}
