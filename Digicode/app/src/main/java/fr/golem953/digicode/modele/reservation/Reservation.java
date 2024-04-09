package fr.golem953.digicode.modele.reservation;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import fr.golem953.digicode.modele.client.Client;
import fr.golem953.digicode.modele.salle.Salle_reunion;


public class Reservation {
	// private int id_client;
	private Salle_reunion uneSalle;
	private String dateHeure;
	private int periode;
	private Client unClient;
	private int id_reserv;

	public int getId_reserv() {
		return id_reserv;
	}

	public String getDateHeure() {
		return dateHeure;
	}

	public int getPeriode() {
		return periode;
	}

	public Client getUnClient() {
		return unClient;
	}

	public Salle_reunion getUneSalle() {
		return uneSalle;
	}

	public Reservation(int id_reserv, Client unClient, Salle_reunion uneSalle, String dateHeure, int periode) {
		super();
		this.id_reserv = id_reserv;
		this.unClient = unClient;
		this.uneSalle = uneSalle;
		this.dateHeure = dateHeure;
		this.periode = periode;
	}



	@Override
	public String toString() {

		return "Reservation [uneSalle=" + uneSalle + ", dateHeure=" + dateHeure + ", periode=" + periode + ", unClient="
				+ unClient + "]";
	}

}
