/**
 * 
 */
package sn.nicolpress.urbain;

import junit.framework.TestCase;
import sn.nicolpress.urbain.service.UrbainMetier;

/**
 * @author ahoad
 *
 */
public class UrbainMetierTest extends TestCase {
	// Instance de la classe à tester
	private UrbainMetier urbain;

	protected void setUp() throws Exception {
		super.setUp();
		urbain = new UrbainMetier(); 
	}
	
	// Test de la fonction somme de a & b
	
	public void testSomme() {
		assertTrue(urbain.somme(6, 9) == 15);
	}
	
	// Test de la methode produit de deux nombres a & b
	
	public void testProduit() {
		assertTrue(urbain.produit(2, 3) == 6);
	}
}
