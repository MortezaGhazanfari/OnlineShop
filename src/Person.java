import java.io.Serializable;

public abstract class Person implements Serializable {
    private String vornaame;
    private String nachname;
    private int alter;
    private String adresse;
    private String mail;

    public Person(String vornaame, String nachname, int alter, String adresse, String mail) {
        this.vornaame = vornaame;
        this.nachname = nachname;
        this.alter = alter;
        this.adresse = adresse;
        this.mail = mail;
    }

    public String getVornaame() {
        return vornaame;
    }

    public String getNachname() {
        return nachname;
    }

    public int getAlter() {
        return alter;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getMail() {
        return mail;
    }
}
