package projetZoo;

public class Exemple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lion v1 = new Lion("simba",3);
		Zoo z=  Zoo.getInstance();
		Cage c1 = new Cage();
		v1.setCage(c1);
		v1.afficherInfos();
		v1.mange();
		z.ajouterAnimal(v1);
		z.afficherInfos();
		
	}

	

}
