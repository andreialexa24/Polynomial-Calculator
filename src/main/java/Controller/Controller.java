package Controller;

import Model.Model;
import Model.Polynomial;
import Model.Parsing;
import View.Interface;

import java.io.IOException;

public class Controller {
    private Model model = new Model();
    private Interface interfata= new Interface();
    private Parsing parsing = new Parsing();

    public void start(){
        interfata.setVisible(true);
        interfata.getBadd().addActionListener(e -> {
            try {
                adunare();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        interfata.getBsub().addActionListener(e -> {
            try {
                scadere();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        interfata.getBderiv().addActionListener(e -> {
            try {
                derivare();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        interfata.getBint().addActionListener(e -> {
            try {
                integrare();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

    }

    public void adunare () throws IOException {
        Polynomial p1 = new Polynomial(0);
        Polynomial p2 = new Polynomial(0);
        p1.setList(parsing.parsePolynomial(interfata.getPolinom1().getText()));
        p2.setList(parsing.parsePolynomial(interfata.getPolinom2().getText()));
        Polynomial rez =  model.adunare(p1, p2);
        interfata.getRez().setText(rez.toString());       //calc rezul si afisez polinomul construit
    }
    public void scadere () throws IOException {
        Polynomial p1 = new Polynomial(0);
        Polynomial p2 = new Polynomial(0);
        p1.setList(parsing.parsePolynomial(interfata.getPolinom1().getText()));
        p2.setList(parsing.parsePolynomial(interfata.getPolinom2().getText()));
        Polynomial rez =  model.scadere(p1, p2);
        interfata.getRez().setText(rez.toString());       //calc rezul si afisez polinomul construit
    }

    public void derivare () throws IOException {
        Polynomial p1 = new Polynomial(0);
        p1.setList(parsing.parsePolynomial(interfata.getPolinom1().getText()));
        Polynomial rez =  model.derivare(p1);
        interfata.getRez().setText(rez.toString());       //calc rezul si afisez polinomul construit
    }


    public void integrare () throws IOException {
        Polynomial p1 = new Polynomial(0);
        p1.setList(parsing.parsePolynomial(interfata.getPolinom1().getText()));
        Polynomial rez =  model.integrare(p1);

        interfata.getRez().setText(rez.toString());       //calc rezul si afisez polinomul construit
    }


}
