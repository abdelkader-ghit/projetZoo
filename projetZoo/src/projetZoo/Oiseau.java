package projetZoo;

public class Oiseau extends Animal {
	public Oiseau(String n, int age) {
		super(n, age);
		// TODO Auto-generated constructor stub
	}

	private  Cabane cabane ;

	@Override
	public void mange() {
		// TODO Auto-generated method stub
		System.out.print( "mange des graines  \n");
	}

	public Cabane getCabane() {
		return cabane;
	}

	public void setCabane(Cabane cabane) {
		this.cabane = cabane;
	}

	public String toString() {
		String chaine = super.toString();
		chaine = chaine + ". C'est un oiseu.";
		chaine = chaine + "habite dans le cabane numero"+ this.getCabane().getNumeroCabane();
		return chaine;
	} 

}
