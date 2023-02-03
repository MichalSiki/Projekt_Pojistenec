import java.util.ArrayList;
public class Zaznam {
    private ArrayList<Zaznam> zaznamy;
    public Zaznam() {
        zaznamy = new ArrayList<Zaznam>();
    }
    public void pridejZaznam(String jmeno,String prijmeni,int vek,int telCislo){
        zaznamy.add(new Zaznam());
    }
}
