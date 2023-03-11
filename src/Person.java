public abstract class Person {
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
}
