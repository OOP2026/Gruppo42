package model;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Turno {
    private DayOfWeek giorno;
    private LocalTime oraInizio;
    private LocalTime oraFine;

    public Turno(DayOfWeek giorno, LocalTime inizio, LocalTime fine) {
        this.giorno = giorno;
        this.oraInizio = inizio;
        this.oraFine = fine;
    }

    // Getters
    public DayOfWeek getGiorno() { return giorno; }
    public LocalTime getOraInizio() { return oraInizio; }
    public LocalTime getOraFine() { return oraFine; }
}