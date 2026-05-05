package model;

public class Paziente {
    private String codiceFiscale;
    private String nome;
    private String cognome;

    public Paziente(String cf, String nome, String cognome) {
        this.codiceFiscale = cf;
        this.nome = nome;
        this.cognome = cognome;
    }

    // Getters
    public String getCodiceFiscale() { return codiceFiscale; }
    public String getNome() { return nome; }
    public String getCognome() { return cognome; }
}