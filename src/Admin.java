import java.io.Serializable;

public class Admin extends Person {

    private static final long serialVersionUID = 1L;
    private Rechte rechte;

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

    @Override
    public String toString() {
        return "Admin Informationen{" +"\n"+
                "Vorname= " + this.getVornaame() +"\n"+
                "Nachname= " + this.getNachname() +"\n"+
                "Alter= " + this.getAlter()+"\n"+
                "Adresse= " + this.getAdresse() +"\n"+
                "Mail= " + this.getMail() +"\n"+
                "rechte= " + rechte +"\n"+
                '}';
    }
}
