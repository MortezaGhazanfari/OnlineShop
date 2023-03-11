import java.util.List;

public class Kunde extends Person{
    private static int CurrentId = 1;
    private int id;
    private BezahlMethode bezahlMethode;
    private List<Produkt> gekaufteProdukte;


    public Kunde(String vornaame, String nachname, int alter, String adresse, String mail) {
        super(vornaame, nachname, alter, adresse, mail);
    }

    public void kaufen(){}
    public void zurücksenden(){}
    public void anmelden(){}
    public void abmelden(){}
    public void accountLöschen(){}
    public void accountBearbeiten(){}

}
