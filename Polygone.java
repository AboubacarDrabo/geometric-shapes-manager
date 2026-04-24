/**
 * Nom : Drabo Aboubacar
 * Cours : 420-241-AH
 * Dernière modification : 12 mars 2026
 * Description : Classe enfant représentant un cercle
 */

package tp1;

public class Cercle extends Polygone {

	// MÉTHODE D'ACCÈS
	public double rayon() {
		return super.getVal1();
	}

	// CONSTRUCTEUR
	public Cercle(double rayon) {
		super(rayon, 0);
	}

	// METHODES

	@Override

	// AIRE
	public double aire() {
		return Math.PI * Math.pow(rayon(), 2);
	}

	@Override

	// PERIMETRE
	public double perimetre() {
		return 2 * Math.PI * rayon();
	}

	@Override
	public String toString() {
		return "Cercle [" + rayon() + "]";
	}
}
