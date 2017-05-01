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
public class Miinus extends Operaatio {

    private Sovelluslogiikka sl;
    JTextField syote;
    JTextField tulos;
    private String edIn;
    private String edOut;

    public Miinus(Sovelluslogiikka sl, JTextField syote, JTextField tulos) {
        super(sl, syote, tulos);
        this.sl = sl;
        this.syote = syote;
        this.tulos = tulos;
        edIn = syote.getText();
        edOut = tulos.getText();
    }

    @Override
    public void suorita() {
        edIn = syote.getText();
        edOut = tulos.getText();
        int syoteInt = Integer.parseInt(syote.getText());
        sl.miinus(syoteInt);
        tulos.setText(Integer.toString(sl.tulos()));
    }

    @Override
    public void peru() {
        this.syote.setText(edIn);
        this.tulos.setText(edOut);
    }

}
