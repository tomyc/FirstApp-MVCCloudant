public class Main {

    public static void main(String[] args) {
	// write your code here
        RekomendView theView = new RekomendView();
        RekomendModel theModel = new RekomendModel();

        RekomendControler theControler = new RekomendControler(theView, theModel);

        theView.setVisible(true);

    }
}
