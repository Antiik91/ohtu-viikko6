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
    
    public Nollaa(Sovelluslogiikka sovellus, JTextField syotekentta, JTextField tuloskentta) {
        super(sovellus, syotekentta, tuloskentta);
        this.sovellus = sovellus;
        this.syotekentta = syotekentta;
        this.tuloskentta = tuloskentta;
        
    }

    @Override
    public void suorita() {
        sovellus.nollaa();
        syotekentta.setText("");
        tuloskentta.setText("0");
    }
    
}
