package Model;

public class Monomial implements Comparable {
    private int exp;
    private int coef;
    private boolean skip;

    public static Monomial adunare(Monomial m1, Monomial m2){
        Monomial rez = new Monomial(m1.getExp(), m1.getCoef() + m2.getCoef());
        return rez;
    }

    public static Monomial scadere(Monomial m1, Monomial m2){
        Monomial rez = new Monomial(m1.getExp(), m1.getCoef() - m2.getCoef());
        return rez;
    }

    public static Monomial derivare(Monomial m1){
        Monomial  rez = new Monomial(0,0);
        rez.setExp(m1.getExp() - 1);
        rez.setCoef(m1.getExp() * m1.getCoef()); ;
        return rez;
    }

    public static Monomial integrare(Monomial m1){
        Monomial  rez = new Monomial(0,0);
        rez.setExp(m1.getExp() + 1 );
        rez.setCoef(m1.getCoef()/(m1.getExp() + 1)); ;
        return rez;
    }

    public Monomial(int exp, int coef) {
        this.exp = exp;
        this.coef = coef;
    }

    public int getExp() {
        return exp;
    }

    public boolean isSkip() {
        return skip;
    }

    public void setSkip(boolean skip) {
        this.skip = skip;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getCoef() {
        return coef;
    }

    public void setCoef(int coef) {
        this.coef = coef;
    }

    @Override
    public int compareTo(Object o) {
        Monomial m1 = (Monomial)o;
        return m1.getExp()-this.getExp();
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        if(coef>=0)
        {
            sb.append('+');
            sb.append(coef);
        }
        else
        {
            sb.append(coef);
        }
        sb.append('X');
        sb.append('^');
        sb.append(exp);
        return sb.toString();
    }
}
