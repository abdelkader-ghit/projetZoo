package projetZoo;

import java.util.LinkedList;

public class Piscine {
	private LinkedList<Marin> marins = new LinkedList<Marin>();

	public LinkedList<Marin> getMarins() {
		return marins;
	}

	public void setMarins(LinkedList<Marin> marins) {
		this.marins = marins;
	}
}
