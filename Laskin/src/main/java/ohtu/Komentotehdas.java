/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

//import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.IO;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author janantik
 */
public class Komentotehdas {

    private ActionEvent ae;
    private JTextField syote;
    private JTextField tulos;
    private HashMap<String, Operaatio> komennot;

    public Komentotehdas(Sovelluslogiikka sl, JTextField syote, JTextField tulos, ActionEvent ae) {
        komennot = new HashMap<>();
        this.syote = syote;
        this.tulos = tulos;
        this.ae = ae;
        komennot.put("Plus", new Plus(sl, syote, tulos));
    }

    public Komento hae(String op) {
        if (op.equals("p")) {
        }
        return null;
    }
}
