package fr.golem953.digicode.modele.salle;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



public class Salle_reunion implements Serializable {
	private int id;
	private String nom;
	private String libelle = "Salle de reunion";

	public String getLibelle() {
		return libelle;
	}

	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public Salle_reunion(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	public static List<Salle_reunion> getlisteSalle() {

		List<Salle_reunion> listeSalle = new ArrayList<Salle_reunion>();

		listeSalle.add(new Salle_reunion(1, "Daum"));
		listeSalle.add(new Salle_reunion(2, "Corbin"));
		listeSalle.add(new Salle_reunion(3, "Baccarat"));
		listeSalle.add(new Salle_reunion(4, "Longwy"));
		listeSalle.add(new Salle_avec_equipement(5, "Multimédia"));
		listeSalle.add(new Salle_amphitheatre(6, "Amphithéâtre"));
		listeSalle.add(new Salle_reunion(7, "Lamour"));
		listeSalle.add(new Salle_reunion(8, "Grüber"));
		listeSalle.add(new Salle_reunion(9, "Majorelle"));
		listeSalle.add(new Salle_avec_equipement(10, "Salle de restauration"));
		listeSalle.add(new Salle_reunion(11, "Galerie"));
		listeSalle.add(new Salle_avec_equipement(12, "Salle informatique"));
		listeSalle.add(new Salle_avec_equipement(13, "Hall d\'accueil"));
		listeSalle.add(new Salle_reunion(14, "Gallé"));

		return listeSalle;
	}

}

	

