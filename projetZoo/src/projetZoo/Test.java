package projetZoo;

import java.io.IOException;


import junit.framework.TestCase;

public class Test extends TestCase {
	Zoo z = Zoo.getInstance();
	
	public Test() {
		super();
		}
	// test
	
	public void testAjoueranimal() throws IOException {
		
		Lion a = new Lion ("king",3) ;
		int collection = z.getAnimaux().size();
		z.ajouterAnimal(a);
		assertEquals (collection+1, z.getAnimaux().size());
	}

}

