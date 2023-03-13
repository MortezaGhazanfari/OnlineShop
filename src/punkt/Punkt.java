package punkt;

public class Punkt {
    private String name;
    private int x;
    private int y;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Punkt addierePunkte(Punkt a, Punkt b){
        Punkt c = new Punkt();
        c.setX(a.getX()+b.getY());
        c.setY(a.getY()+b.getY());
        return c;
    }

    public Punkt subtrahierePunkte(Punkt a, Punkt b){
        Punkt c = new Punkt();
        c.setX(a.getX()-b.getY());
        c.setY(a.getY()-b.getY());
        return c;
    }
    public Punkt multipliziereEinPunkt(Punkt a, int b){
        Punkt c = new Punkt();
        c.setX(a.getX()*b);
        c.setY(a.getY()*b);
        return c;
    }
    public Punkt dividiereEinPunkt(Punkt a, int b){
        Punkt c = new Punkt();
        c.setX(a.getX()/b);
        c.setY(a.getY()/b);
        return c;
    }
    @Override
    public String toString() {
        return name+" ("+x+"|"+y+")";
    }
}
