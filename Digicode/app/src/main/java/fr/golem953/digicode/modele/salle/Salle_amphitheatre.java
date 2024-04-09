package fr.golem953.digicode.modele.salle;

import fr.golem953.digicode.modele.client.Client;

public class Salle_amphitheatre extends Salle_reunion {
	private static double tarif;
	private String libelle;

	public Salle_amphitheatre(int id, String nom) {
		super(id, nom);
		this.libelle= "Salle Amphitheatre";
	}

	@Override
	public String getLibelle() {
		return libelle;
	}

	/*@Override
	public String toString() {
		return "Salle_amphitheatre [tarif=" + tarif + ", getId()=" + getId() + ", getNom()=" + getNom() + "]";
	}*/

}
