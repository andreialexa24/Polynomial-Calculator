package Model;

import java.util.Collections;

public class Model {

    public Polynomial adunare(Polynomial p1, Polynomial p2) {
        int maxExp = 0;
        Polynomial rez = new Polynomial(0);
        for(Monomial m1 : p1.getList()){
            for(Monomial m2 : p2.getList()){
                if(m1.getExp() == m2.getExp()){
                    rez.getList().add(Monomial.adunare(m1, m2));
                    m1.setSkip(true);   //cand trec prima data sunt true, iar dupa le dau skip
                    m2.setSkip(true);
                }
            }
        }
        for(Monomial m1 : p1.getList()){
            if(m1.isSkip() == false){
                rez.getList().add(m1);
            }

        }                                   //adauga elem care sunt singure, nu au exp egal cu alt monom
        for(Monomial m2 : p2.getList()){
            if(m2.isSkip() == false){
                rez.getList().add(m2);
            }

        }
        for (int i = 0; i < rez.getList().size(); i++) {   //trec prin lista si daca coef e 0, scot Monomul cu coef 0;
            Monomial monomial=rez.getList().get(i);
            if(monomial.getCoef()==0)
                rez.getList().remove(monomial);
        }
        for (int i = 0; i < rez.getList().size(); i++) {   //iau puterea maxima, gradul polinomului
            Monomial monomial=rez.getList().get(i);
            if(maxExp<monomial.getExp())
                maxExp=monomial.getExp();
        }
        Collections.sort(rez.getList());  //le sortez descrescator in fct de exp
        rez.setExp(maxExp);
        return rez;
    }


    public Polynomial scadere(Polynomial p1, Polynomial p2) {
        int maxExp = 0;
        Polynomial rez = new Polynomial(0);
        for(Monomial m1 : p1.getList()){
            for(Monomial m2 : p2.getList()){
                if(m1.getExp() == m2.getExp()){
                    rez.getList().add(Monomial.scadere(m1, m2));
                    m1.setSkip(true);   //cand trec prima data sunt true, iar dupa le dau skip
                    m2.setSkip(true);
                }
            }
        }
        for(Monomial m1 : p1.getList()){
            if(m1.isSkip() == false){
                rez.getList().add(m1);
            }

        }                                   //adauga elem care sunt singure, nu au exp egal cu alt monom si pune si minusul in fata
        for(Monomial m2 : p2.getList()){
            Monomial aux=new Monomial(m2.getExp(),-m2.getCoef());   //aux primeste val lui m2, unde coef va fi pe negativ
            if(m2.isSkip() == false){                               //e obiect nou
                rez.getList().add(aux);
            }

        }
        for (int i = 0; i < rez.getList().size(); i++) {   //trec prin lista si daca coef e 0, scot Monomul cu coef 0;
            Monomial monomial=rez.getList().get(i);
            if(monomial.getCoef()==0)
                rez.getList().remove(monomial);
        }
        for (int i = 0; i < rez.getList().size(); i++) {   //iau puterea maxima, gradul polinomului
            Monomial monomial=rez.getList().get(i);
            if(maxExp<monomial.getExp())
                maxExp=monomial.getExp();
        }
        Collections.sort(rez.getList());  //le sortez descrescator in fct de exp
        rez.setExp(maxExp);
        return rez;
    }


    public Polynomial derivare(Polynomial p1) {
        Polynomial rez = new Polynomial(0);
        int maxExp = 0;

        for (Monomial m1 : p1.getList()) {
            rez.addMonomial(Monomial.derivare(m1));
        }
        for (int i = 0; i < rez.getList().size(); i++) {   //trec prin lista si daca coef e 0, scot Monomul cu coef 0;
            Monomial monomial = rez.getList().get(i);
            if (monomial.getCoef() == 0)
                rez.getList().remove(monomial);
        }

        for (int i = 0; i < rez.getList().size(); i++) {   //iau puterea maxima, gradul polinomului
            Monomial monomial = rez.getList().get(i);
            if (maxExp < monomial.getExp())
                maxExp = monomial.getExp();
        }
        Collections.sort(rez.getList());  //le sortez descrescator in fct de exp
        rez.setExp(maxExp);
        return rez;
    }

        public Polynomial integrare(Polynomial p1) {
            Polynomial rez = new Polynomial(0);
            int maxExp  = 0;

            for(Monomial m1: p1.getList()){
                System.out.println(Monomial.integrare(m1).toString());
                rez.addMonomial(Monomial.integrare(m1));
            }
//            for (int i = 0; i < rez.getList().size(); i++) {   //trec prin lista si daca coef e 0, scot Monomul cu coef 0;
//                Monomial monomial=rez.getList().get(i);
//                if(monomial.getCoef()==0)
//                    rez.getList().remove(monomial);
//            }

            for (int i = 0; i < rez.getList().size(); i++) {   //iau puterea maxima, gradul polinomului
                Monomial monomial=rez.getList().get(i);
                if(maxExp<monomial.getExp())
                    maxExp=monomial.getExp();
            }
            Collections.sort(rez.getList());  //le sortez descrescator in fct de exp
            rez.setExp(maxExp);
            System.out.println(rez.toString());
            return rez;


    }



}
