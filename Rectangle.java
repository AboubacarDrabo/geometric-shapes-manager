/**
 * Nom : Drabo Aboubacar
 * Cours : 420-241-AH
 * Dernière modification : 12 mars 2026
 * Description : Classe enfant représentant un Hexagone
 */

package tp1;

public class Hexagone extends Polygone {

	// ATTRIBUTS
	public double cote() {
		return super.getVal1();
	}

	// CONSTRUCTEUR
	public Hexagone(double val1) {
		super(val1, 0);
	}

	// METHODES
	@Override
	// AIRE
	public double aire() {
		return 3 * Math.sqrt(3.0) / 2 * Math.pow(cote(), 2);
	}

	@Override
	// PERIMETRE
	public double perimetre() {
		return 6 * cote();
	}

	@Override
	public String toString() {
		return "Hexagone [" + cote() + "]";
	}
}
