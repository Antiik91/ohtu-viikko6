/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

import javax.swing.JTextField;

/**
 *
 * @author janantik
 */
public class Plus extends Operaatio {

    private JTextField tulos;
    private JTextField syote;
    private Sovelluslogiikka sovelluslogiikka;

    private String edIn;
    private String edOut;

    public Plus(Sovelluslogiikka sl, JTextField syote, JTextField tulos) {
        super(sl, syote, tulos);
        this.sovelluslogiikka = sl;
        this.tulos = tulos;
        this.syote = syote;
        edIn = syote.getText();
        edOut = tulos.getText();
    }

    @Override
    public void suorita() {
        edIn = syote.getText();
        edOut = tulos.getText();
        int syoteInt = Integer.parseInt(syote.getText());
        sovelluslogiikka.plus(syoteInt);
        tulos.setText(Integer.toString(sovelluslogiikka.tulos()));

    }

    @Override
    public void peru() {
        this.syote.setText(edIn);
        this.tulos.setText(edOut);
    }

}
