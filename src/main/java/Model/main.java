package Model;

import Controller.Controller;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
//        Polynomial p1 = new Polynomial(0);
//        Polynomial p2 = new Polynomial(0);
//
//        Model m1 = new Model();
//        Monomial monom1 = new Monomial(3,-6);
//        Monomial monom2 = new Monomial(3,6);
//        Monomial monom3 = new Monomial(2,6);
//
//        p1.addMonomial(monom1);
//        p1.addMonomial(monom3);
//        p2.addMonomial(monom2);
//
//        Polynomial rez = m1.scadere(p2, p1 );
//        System.out.println(rez.getList());
//        System.out.println(rez.getExp());
//        rez =  m1.derivare(p1);
//        System.out.println(rez.getList());
//        System.out.println(rez.getExp());
//
//        rez = m1.integrare(p2);
//        System.out.println(rez.getList());
//        System.out.println(rez.getExp());
//
//        Parsing p = new Parsing();
//        rez.setList(p.parsePolynomial("2X^6+X^2-X+3"));
//        System.out.println(rez.toString());

        Controller c =new Controller();
        c.start();
    }


}
