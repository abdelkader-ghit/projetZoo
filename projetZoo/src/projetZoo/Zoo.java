package projetZoo;

import java.util.LinkedList;

import org.junit.Test;


public class Zoo {
	static Zoo e = new Zoo();
	Zoo() {
	}
	private LinkedList<Cage> cages = new LinkedList<Cage>();
	private LinkedList<Cabane> cabanes = new LinkedList<Cabane>();
	private LinkedList<Animal> animaux = new LinkedList<Animal>();
	private Piscine piscine ;
	
	public LinkedList<Cage> getCages() {
		return cages;
	}
	
	public LinkedList<Cabane> getCabanes() {
		return cabanes;
	}
	
	public LinkedList<Animal> getAnimaux() {
		return animaux;
	}
	//........................ajouter et supp........................
	public void ajouterAnimal(Animal a) {
		this.getAnimaux().add(a);
	}
	public void supprimer(Animal a) {
		this.getAnimaux().remove(a);
	}
	//...........................affiche des info...................... 
	public void listingAnimal() {
		System.out.print("Listing des animaux du zoo"+"\n");
		System.out.print("--------------------------"+"\n");
		for (Animal a : this.getAnimaux()) {
			a.afficherInfos();
		}
	}

	public Piscine getPiscine() {
		return piscine;
	}

	public void setPiscine(Piscine piscine) {
		this.piscine = piscine;
	}
	
	//...........................nbr d'animaux................
	public int nbAnimaux() {
		return this.getAnimaux().size();
	}
	
	public void afficherInfos() {
		System.out.print("zoo heberge  " + this.nbAnimaux() + "animaux." + "\n");
		
	}
	//design pattern
		public static Zoo getInstance() {
			return e;
		}
	}

