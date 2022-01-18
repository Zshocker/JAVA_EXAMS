package Test;
interface Exportable
{
    double drouitDouant();
    String paysDes();
}
public class Article implements Exportable{
    private static int count=0;
    protected final int code=++count;
    protected String nom;
    protected double prixHT;
    public Article(String nom, double prixHT) 
    {
        this.nom = nom;
        this.prixHT = prixHT;
    }
    public double prixTransport(){
        return prixHT*0.05;
    }
    @Override
    public String toString() {
        return this.code+" "+this.nom;
    }
    @Override
    public boolean equals(Object obj) {
        Article at=(Article)obj;
        return nom.equals(at.nom);
    }
    @Override
    public double drouitDouant() {
        return prixHT*0.10;
    }
    @Override
    public String paysDes() {
        return null;
    }
}
