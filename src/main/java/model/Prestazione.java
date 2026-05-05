package model;

import java.time.LocalDateTime;

public class Prestazione {
    private String descrizione;
    private String esito;
    private LocalDateTime dataOra;
    private Medico medicoEsecutore;
    private Ricovero ricoveroRiferimento;

    public Prestazione(String descrizione, LocalDateTime dataOra, Medico medico, Ricovero ricovero) {
        this.descrizione = descrizione;
        this.dataOra = dataOra;
        this.medicoEsecutore = medico;
        this.ricoveroRiferimento = ricovero;
    }

    public void setEsito(String esito) {
        this.esito = esito;
    }

    // Getters
    public String getDescrizione() { return descrizione; }
    public String getEsito() { return esito; }
    public LocalDateTime getDataOra() { return dataOra; }
    public Medico getMedicoEsecutore() { return medicoEsecutore; }
    public Ricovero getRicoveroRiferimento() { return ricoveroRiferimento; }
}