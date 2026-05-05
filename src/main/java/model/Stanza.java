package model;

import java.util.ArrayList;
import java.util.List;

public class Stanza {
    private int numero;
    private List<Letto> letti;

    public Stanza(int numero) {
        this.numero = numero;
        this.letti = new ArrayList<>();
    }

    public void aggiungiLetto(Letto letto) {
        this.letti.add(letto);
    }

    public int getNumero() { return numero; }
    public List<Letto> getLetti() { return letti; }
}