/**
 * Nom : Drabo Aboubac
 * Cours : 420-241-AH
 * Dernière modification : 12 mars 2026
 * Description : Classe parent représentant un polygone géométrique
 */

package tp1;

public class Polygone {

	// ATTRIBUTS
	private double val1;
	private double val2;

	// CONSTRUCTEUR
	public Polygone(double val1, double val2) {
		setVal1(val1);
		setVal2(val2);
	}

	// GETTER / SETTER

	public double getVal1() {
		return val1;
	}

	public void setVal1(double val1) {
			this.val1 = val1;
		}

	public double getVal2() {
		return val2;
	}

	public void setVal2(double val2) {	
			this.val2 = val2;
		}


	@Override
	public String toString() {
		return "Polygone [" + val1 + "]";
	}

	// METHODES
	public double aire() {
		return 0.0;
	}

	public double perimetre() {
		return 0.0;
	}
}
