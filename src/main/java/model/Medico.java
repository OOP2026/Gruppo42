package model;

import java.util.ArrayList;
import java.util.List;

public class Medico extends Utente {
    private String matricola;
    private Reparto repartoAfferenza;
    private List<Turno> turniSettimanali;

    public Medico(String username, String password, String matricola, Reparto reparto) {
        super(username, password);
        this.matricola = matricola;
        this.repartoAfferenza = reparto;
        this.turniSettimanali = new ArrayList<>();
    }

    public void aggiungiTurno(Turno turno) {
        this.turniSettimanali.add(turno);
    }

    // Getters
    public String getMatricola() { return matricola; }
    public Reparto getRepartoAfferenza() { return repartoAfferenza; }
    public List<Turno> getTurniSettimanali() { return turniSettimanali; }
}