package projetZoo;

public class Marin extends Animal {
	public Marin(String n, int age) {
		super(n, age);
		// TODO Auto-generated constructor stub
	}
	private Piscine piscine;
	@Override
	public void mange() {
		
		System.out.print( " mange du poisson  \n");
	}
	public Piscine getPiscine() {
		return piscine;
	}
	public void setPicine(Piscine piscine) {
		this.piscine = piscine;
	}
	public String toString() {
		String chaine = super.toString();
		chaine = chaine + ". C'est un marin.";
		chaine = chaine + "habite dans la piscine";
		return chaine;
	} 
}
