/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

import java.awt.event.ActionEvent;
import javax.swing.JTextField;

/**
 *
 * @author janantik
 */
public abstract class Operaatio {

    private JTextField syote;
    private JTextField tulos;
    private Sovelluslogiikka sl;


    public Operaatio(Sovelluslogiikka sl,JTextField syote, JTextField tulos) {
        this.syote = syote;
        this.tulos = tulos;
        this.sl = sl;

    }

    public abstract void suorita();
    public abstract void peru();
}

