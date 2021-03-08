package projetZoo;

import org.junit.Test;

public abstract class Animal {
	private String nom;
	private int age ;	
	public abstract void mange();
	
	public Animal (String n,int age) {
		this.setNom(n);
		this.setAge(age);	
	}
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
//..........................afiche info animal
	public String toString() {
		String str = "l'animal " + this.getNom();
		str = str + " a " + this.getAge() + " ans";
	
		return str;
	}
	@Test
	public void afficherInfos() {
		System.out.print(this.toString() + "\n");
	}

}
