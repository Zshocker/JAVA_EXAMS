package Test;

import java.util.*;

public class Magazin 
{
    List<Article> Ar=new ArrayList<Article>();
    public void add(Article ar)
    {
        Ar.add(ar);
    }
    public boolean contains(Article a)
    {
        return Ar.contains(a);
    }
}
