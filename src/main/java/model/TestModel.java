package model;

import java.time.LocalDateTime;

public class TestModel {
	public static void main(String[] args) {
		System.out.println("--- INIZIO TEST DEL DOMINIO OSPEDALIERO ---");

		// 1. Creazione della Struttura (Reparto -> Stanza -> Letto)
		Reparto chirurgia = new Reparto("Chirurgia Generale");
		Stanza stanza101 = new Stanza(101);
		Letto lettoA = new Letto("L-CH-101-A");
		Letto lettoB = new Letto("L-CH-101-B");

		chirurgia.aggiungiStanza(stanza101);
		stanza101.aggiungiLetto(lettoA);
		stanza101.aggiungiLetto(lettoB);

		System.out.println(" Struttura creata: " + chirurgia.getNome() +
				" | Stanza: " + stanza101.getNumero() +
				" | Numero Letti: " + stanza101.getLetti().size());

		// 2. Creazione degli Utenti
		Amministratore admin = new Amministratore("admin_mario", "passSicura123");
		Medico drHouse = new Medico("dr_house", "vicodin", "MED-001", chirurgia);

		System.out.println("Utenti creati: Admin (" + admin.getUsername() +
				"), Medico (" + drHouse.getUsername() + " - Matricola: " + drHouse.getMatricola() + ")");

		// 3. Creazione Paziente e Registrazione Ricovero
		Paziente paziente1 = new Paziente("RSSMRA80A01H501U", "Mario", "Rossi");
		LocalDateTime inizioRicovero = LocalDateTime.now();
		LocalDateTime finePrevista = inizioRicovero.plusDays(5);

		Ricovero ricoveroAttuale = new Ricovero(paziente1, lettoA, inizioRicovero, finePrevista);

		System.out.println(" Ricovero attivato per: " + ricoveroAttuale.getPaziente().getNome() + " " + ricoveroAttuale.getPaziente().getCognome() +
				" | Assegnato al Letto: " + ricoveroAttuale.getLetto().getCodiceUnivoco());
		System.out.println("   Stato ricovero (è attivo?): " + ricoveroAttuale.isAttivo());

		// 4. Creazione Prestazione Medica
		Prestazione visita = new Prestazione("Visita di controllo post-operatoria", LocalDateTime.now().plusHours(2), drHouse, ricoveroAttuale);
		visita.setEsito("Decorso regolare, parametri stabili. Nessuna criticità.");

		System.out.println(" Prestazione registrata: " + visita.getDescrizione());
		System.out.println(" Medico esecutore: " + visita.getMedicoEsecutore().getUsername());
		System.out.println(" Esito: " + visita.getEsito());

		System.out.println("--- TEST COMPLETATO CON SUCCESSO ---");
	}
}