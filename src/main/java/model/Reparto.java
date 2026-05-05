package model;

import java.util.ArrayList;
import java.util.List;

public class Reparto {
    private String nome;
    private List<Stanza> stanze;

    public Reparto(String nome) {
        this.nome = nome;
        this.stanze = new ArrayList<>();
    }

    public void aggiungiStanza(Stanza stanza) {
        this.stanze.add(stanza);
    }

    public String getNome() { return nome; }
    public List<Stanza> getStanze() { return stanze; }
}