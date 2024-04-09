package fr.golem953.digicode.modele.salle;

import fr.golem953.digicode.modele.client.Client;

public class Salle_avec_equipement extends Salle_reunion {
	private String libelle;

	@Override
	public String getLibelle() {
		return libelle;
	}

	public Salle_avec_equipement(int id, String nom) {
		super(id, nom);
		this.libelle = "Salle avec equipement";

	}

	/*
	@Override
	public String toString() {
		return "Salle_avec_equipement [tarif=" + tarif + ", getId()=" + getId() + ", getNom()=" + getNom() + "]";
	}*/

}
