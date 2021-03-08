package projetZoo;

public class Felin extends Animal {
	public Felin(String n, int age) {
		super(n, age);
		// TODO Auto-generated constructor stub
	}
	private Cage cage;

	@Override
	public void mange() {
		// TODO Auto-generated method stub
		System.out.print( "mange de la viande \n");
	}

	public Cage getCage() {
		return cage;
	}

	public void setCage(Cage cage) {
		this.cage = cage;
	}
	public String toString() {
		String chaine = super.toString();
		chaine = chaine + ". C'est un felin, habite dans le cage numero "+this.getCage().getNumeroCage();
		return chaine;
	} 

}
