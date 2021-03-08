package projetZoo;

import java.util.LinkedList;

public class Cabane {
	private LinkedList<Oiseau> oiseuax = new LinkedList<Oiseau>();
	private int numeroCabane;
	public LinkedList<Oiseau> getOiseuax() {
		return oiseuax;
	}

	public void setOiseuax(LinkedList<Oiseau> oiseuax) {
		this.oiseuax = oiseuax;
	}

	public int getNumeroCabane() {
		return numeroCabane;
	}

	public void setNumeroCabane(int numeroCabane) {
		this.numeroCabane = numeroCabane;
	}
	
}
