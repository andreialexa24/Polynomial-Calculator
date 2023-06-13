package Model;

import java.util.ArrayList;
import java.util.List;

public class Polynomial {
    private int exp;
    private List<Monomial> list;

    public Polynomial(int exp) {
        this.exp = exp;
        this.list = new ArrayList<>();

    }

    //iau primul element , compar puterile si iau primul
    //element de care am nev

   public void addMonomial(Monomial m1){
        this.list.add(m1);
   }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public List<Monomial> getList() {
        return list;
    }

    public void setList(List<Monomial> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        list.forEach(monomial -> sb.append(monomial.toString()));
        return sb.toString();
    }
}

