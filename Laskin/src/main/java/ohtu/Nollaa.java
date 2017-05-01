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
class Nollaa extends Operaatio {

    private Sovelluslogiikka sovellus;
    private JTextField syotekentta;
    private JTextField tuloskentta;
    private String edIn;
    private String edOut;

    public Nollaa(Sovelluslogiikka sovellus, JTextField syotekentta, JTextField tuloskentta) {
        super(sovellus, syotekentta, tuloskentta);
        this.sovellus = sovellus;
        this.syotekentta = syotekentta;
        this.tuloskentta = tuloskentta;
        edIn = syotekentta.getText();
        edOut = tuloskentta.getText();

    }

    @Override
    public void suorita() {
        edIn = syotekentta.getText();
        edOut = tuloskentta.getText();
        sovellus.nollaa();
        syotekentta.setText("");
        tuloskentta.setText("0");
    }

    @Override
    public void peru() {
        this.syotekentta.setText(edIn);
        this.tuloskentta.setText(edOut);
    }

}
