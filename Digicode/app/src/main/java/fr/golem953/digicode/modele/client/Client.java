package fr.golem953.digicode.modele.client;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class Client implements Serializable {

	private String id;
	private String mdp;


	public Client(String id, String mdp) {
		super();
		this.id = id;
		this.mdp = mdp;
	}


	}


