/**
 * Nom : Drabo Aboubacar
 * Cours : 420-241-AH
 * Dernière modification : 12 mars 2026
 * Description : Classe enfant représentant un carre
 */

package tp1;

public class Carre extends Polygone {

	// MÉTHODE D'ACCÈS
	public double cote() {
		return super.getVal1();
	}

	// CONSTRUCTEUR
	public Carre(double val1) {
		super(val1, 0);
	}

	// METHODES

	@Override
	// AIRE
	public double aire() {
		return Math.pow(cote(), 2);
	}

	@Override
	// PERIMETRE
	public double perimetre() {
		return 4 * cote();
	}

	@Override
	public String toString() {
		return "Carre [" + cote() + "]";
	}

}
