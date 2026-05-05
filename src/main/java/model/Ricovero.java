package model;

import java.time.LocalDateTime;

public class Ricovero {
    private Paziente paziente;
    private Letto letto;
    private LocalDateTime dataInizio;
    private LocalDateTime dataFinePrevista;
    private LocalDateTime dataFineEffettiva;

    public Ricovero(Paziente paziente, Letto letto, LocalDateTime inizio, LocalDateTime finePrevista) {
        this.paziente = paziente;
        this.letto = letto;
        this.dataInizio = inizio;
        this.dataFinePrevista = finePrevista;
    }

    public void dimettiPaziente(LocalDateTime dataEffettiva) {
        this.dataFineEffettiva = dataEffettiva;
    }

    public boolean isAttivo() {
        return this.dataFineEffettiva == null;
    }

    // Getters
    public Paziente getPaziente() { return paziente; }
    public Letto getLetto() { return letto; }
    public LocalDateTime getDataInizio() { return dataInizio; }
    public LocalDateTime getDataFinePrevista() { return dataFinePrevista; }
    public LocalDateTime getDataFineEffettiva() { return dataFineEffettiva; }
}