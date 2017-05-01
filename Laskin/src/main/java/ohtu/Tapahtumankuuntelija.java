package ohtu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JTextField;
 
public class Tapahtumankuuntelija implements ActionListener {
    private JButton plus;
    private JButton miinus;
    private JButton nollaa;
    private JButton undo;
    private JTextField tuloskentta;
    private JTextField syotekentta;
    private Sovelluslogiikka sovellus;
    private Map<JButton, Operaatio> operaatiot;
    private Operaatio edellinen;
 
    public Tapahtumankuuntelija(JButton plus, JButton miinus, JButton nollaa, JButton undo, JTextField tuloskentta, JTextField syotekentta) {
        this.plus = plus;
        this.miinus = miinus;
        this.nollaa = nollaa;
        this.undo = undo;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.sovellus = new Sovelluslogiikka();
        operaatiot = new HashMap<>();
        operaatiot.put(plus, new Plus(sovellus, syotekentta, tuloskentta));
        operaatiot.put(miinus, new Miinus(sovellus, syotekentta, tuloskentta));
        operaatiot.put(nollaa, new Nollaa(sovellus, syotekentta, tuloskentta));
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Operaatio op = operaatiot.get(ae.getSource());
        if(op!=null){
            op.suorita();
            edellinen = op;
        } else {
            edellinen.peru();
            edellinen = null;
        }
        nollaa.setEnabled(sovellus.tulos() != 0);
        undo.setEnabled(edellinen!=null);
    }
 
}