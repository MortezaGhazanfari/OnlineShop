public class Admin extends Person {

    public Rechte rechte;

    public Admin(String vornaame, String nachname, int alter, String adresse, String mail, Rechte rechte) {
        super(vornaame, nachname, alter, adresse, mail);
        this.rechte=rechte;
    }

    public void produktHinzufügen(){}
    public void produktLöschen(){}
    public void produktBearbeiten(){}
    public void produktVersenden(){}
    public void kundeBearbeiten(){}
    public void kundeLöschen(){}
    public void KundeHinzufügen(){}




}
