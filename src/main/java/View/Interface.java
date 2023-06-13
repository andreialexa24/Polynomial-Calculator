package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class Interface extends JFrame {

    private JPanel contentPane;
    private JTextField polinom1;
    private JTextField polinom2;
    private JTextField rez;
    private JLabel lblPrimulPolinom;
    private JLabel lblAlDoileaPolinom;
    private JButton badd;
    private JButton bderiv;
    private JButton bint;
    private JButton bsub;
    private int field;

    /**
     * Launch the application.
     */

     public static void main(String[] args) { EventQueue.invokeLater(new
     Runnable() { public void run() { try { Interface frame = new Interface();
     frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); } } });
     }

    /**
     * Create the frame.
     */
    public Interface() {

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 670, 503);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        polinom1 = new JTextField();
        polinom1.setBounds(50, 63, 208, 37);
        contentPane.add(polinom1);
        polinom1.setColumns(10);

        polinom2 = new JTextField();
        polinom2.setBounds(50, 150, 208, 37);
        contentPane.add(polinom2);
        polinom2.setColumns(10);

        rez = new JTextField();
        rez.setBounds(377, 99, 237, 63);
        contentPane.add(rez);
        rez.setColumns(10);

        JLabel lblNewLabel = new JLabel("Rezultat");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel.setBounds(458, 61, 113, 37);
        contentPane.add(lblNewLabel);

        lblPrimulPolinom = new JLabel("Primul polinom");
        lblPrimulPolinom.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblPrimulPolinom.setBounds(65, 24, 113, 37);
        contentPane.add(lblPrimulPolinom);

        lblAlDoileaPolinom = new JLabel("Al doilea polinom");
        lblAlDoileaPolinom.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblAlDoileaPolinom.setBounds(60, 110, 188, 37);
        contentPane.add(lblAlDoileaPolinom);

        JButton b1 = new JButton("1");
        b1.addActionListener(e -> text('1'));
        b1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        b1.setBounds(78, 262, 60, 47);
        contentPane.add(b1);

        JButton b4 = new JButton("4");
        b4.addActionListener(e -> text('4'));
        b4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        b4.setBounds(78, 326, 60, 47);
        contentPane.add(b4);

        JButton b7 = new JButton("7");
        b7.addActionListener(e -> text('7'));
        b7.setFont(new Font("Tahoma", Font.PLAIN, 14));
        b7.setBounds(78, 394, 60, 47);
        contentPane.add(b7);

        JButton b2 = new JButton("2");
        b2.addActionListener(e -> text('2'));
        b2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        b2.setBounds(164, 262, 60, 47);
        contentPane.add(b2);

        JButton b5 = new JButton("5");
        b5.addActionListener(e -> text('5'));
        b5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        b5.setBounds(164, 326, 60, 47);
        contentPane.add(b5);

        JButton b8 = new JButton("8");
        b8.addActionListener(e -> text('8'));
        b8.setFont(new Font("Tahoma", Font.PLAIN, 14));
        b8.setBounds(164, 394, 60, 47);
        contentPane.add(b8);

        JButton b3 = new JButton("3");
        b3.addActionListener(e -> text('3'));
        b3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        b3.setBounds(264, 262, 60, 47);
        contentPane.add(b3);

        JButton b6 = new JButton("6");
        b6.addActionListener(e -> text('6'));
        b6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        b6.setBounds(264, 326, 60, 47);
        contentPane.add(b6);

        JButton b9 = new JButton("9");
        b9.addActionListener(e -> text('9'));
        b9.setFont(new Font("Tahoma", Font.PLAIN, 14));
        b9.setBounds(264, 394, 60, 47);
        contentPane.add(b9);

        JButton bplus = new JButton("+");
        bplus.addActionListener(e -> text('+'));
        bplus.setFont(new Font("Tahoma", Font.PLAIN, 18));
        bplus.setBounds(264, 205, 60, 47);
        contentPane.add(bplus);

        JButton bminus = new JButton("-");
        bminus.addActionListener(e -> text('-'));
        bminus.setFont(new Font("Tahoma", Font.PLAIN, 18));
        bminus.setBounds(362, 205, 60, 47);
        contentPane.add(bminus);

        JButton bdel = new JButton("DEL");
        bdel.addActionListener(e -> del());
        bdel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        bdel.setBounds(362, 326, 60, 47);
        contentPane.add(bdel);

         bderiv = new JButton("DERIVARE");
        bderiv.setFont(new Font("Tahoma", Font.PLAIN, 14));
        bderiv.setBounds(458, 337, 124, 47);
        contentPane.add(bderiv);

         bint = new JButton("INTEGRARE");
        bint.setFont(new Font("Tahoma", Font.PLAIN, 14));
        bint.setBounds(458, 394, 125, 47);
        contentPane.add(bint);

        JButton b0 = new JButton("0");
        b0.addActionListener(e -> text('0'));
        b0.setFont(new Font("Tahoma", Font.PLAIN, 14));
        b0.setBounds(362, 394, 60, 47);
        contentPane.add(b0);

         bsub = new JButton("SCADERE");
        bsub.setFont(new Font("Tahoma", Font.PLAIN, 14));
        bsub.setBounds(458, 273, 124, 47);
        contentPane.add(bsub);

        badd = new JButton("ADUNARE");
        badd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        badd.setFont(new Font("Tahoma", Font.PLAIN, 14));
        badd.setBounds(458, 206, 124, 47);
        contentPane.add(badd);

        JButton bx = new JButton("x");
        bx.addActionListener(e -> text('X'));
        bx.setFont(new Font("Tahoma", Font.PLAIN, 18));
        bx.setBounds(78, 205, 60, 47);
        contentPane.add(bx);

        JButton bexp = new JButton("^");
        bexp.addActionListener(e -> text('^'));
        bexp.setFont(new Font("Tahoma", Font.PLAIN, 18));
        bexp.setBounds(164, 205, 60, 47);
        contentPane.add(bexp);
        polinom1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                field=0;
            }
        });
        polinom2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                field=1;
            }
        });
    }

    public void del()
    {
        if(field==0)
            polinom1.setText(polinom1.getText().substring(0,polinom1.getText().length()-1));
        else
            polinom2.setText(polinom2.getText().substring(0,polinom2.getText().length()-1));
    }

    public void text(char c)
    {
        if(field==0)
            polinom1.setText(polinom1.getText().toString()+c);
        else
            polinom2.setText(polinom2.getText().toString()+c);
    }

    public JTextField getPolinom1() {
        return polinom1;
    }

    public JTextField getPolinom2() {
        return polinom2;
    }

    public JTextField getRez() {
        return rez;
    }

    public JButton getBderiv() {
        return bderiv;
    }

    public void setBderiv(JButton bderiv) {
        this.bderiv = bderiv;
    }

    public JButton getBint() {
        return bint;
    }

    public void setBint(JButton bint) {
        this.bint = bint;
    }

    public JButton getBsub() {
        return bsub;
    }

    public void setBsub(JButton bsub) {
        this.bsub = bsub;
    }

    public void setBadd(JButton badd) {
        this.badd = badd;
    }

    public JButton getBadd() {
        return badd;
    }
}
