package Model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parsing {

    Pattern pattern = Pattern.compile("(?:\\h*)([-+]?\\d*)(?:\\h*)[x](\\^(\\d+))?|(?:\\h*)([-+]?\\d+)", Pattern.CASE_INSENSITIVE);

    public ArrayList<Monomial> parsePolynomial(String Polynomial) throws IOException {
        Polynomial = Polynomial.replaceAll("\\s", "");
        Matcher matcher = pattern.matcher(Polynomial);   //matcher te asigura ca inputul e valid
        ArrayList<Monomial> newPolynomial = new ArrayList<Monomial>();
        int coefficient = 0;
        int exponent = 0;
        while (matcher.find()) {
            if (matcher.group(4) != null) {
                coefficient = Integer.parseInt(matcher.group(4));
                exponent = 0;
            } else {
                if (matcher.group(2) != null) {
                    exponent = Integer.parseInt(matcher.group(3));
                } else {
                    exponent = 1;
                }
                if (!matcher.group(1).equals("") && matcher.group(1) != null) {
                    if (matcher.group(1).equals("-")) {
                        coefficient = -1;
                    } else if (matcher.group(1).equals("+")) {
                        coefficient = 1;
                    } else {
                        coefficient = Integer.parseInt(matcher.group(1));
                    }
                } else {
                    coefficient = 1;
                }
            }
            newPolynomial.add(new Monomial(exponent, coefficient));
            System.out.println(coefficient + " " + exponent);   //Just testing
        }
        return newPolynomial;
    }



}
