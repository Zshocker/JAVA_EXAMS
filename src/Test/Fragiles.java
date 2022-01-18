package Test;

public class Fragiles extends Article {

    String emballage=null;
    public Fragiles(String nom, double prixHT)
    {
        super(nom, prixHT);
    }
    public Fragiles(String emb, String nom, double prixHT)
    {
        super(nom, prixHT);
        emballage=emb;
    }
    @Override
    public double prixTransport() {
        return super.prixTransport()*2;
    }
}
