package dragon;

public class InfoDragon {

	public InfoDragon(int id, String nom, String sexe, int longueur, int nombre_ecailles, String crache_feu,
			String comportement_amoureux) {
		this.id = id;
		this.nom = nom;
		this.sexe = sexe;
		this.longueur = longueur;
		this.nombre_ecailles = nombre_ecailles;
		this.crache_feu = crache_feu;
		this.comportement_amoureux = comportement_amoureux;

		// Scanner scanner = new Scanner(System.in);
		// System.out.println("Entrez 5 valeurs :");

	}

	/**
	 * Ici on test
	 * 
	 * @param args the command line arguments
	 */

	// Action de lire les tous les ingrédients
	private int id;
	private String nom;
	private String sexe;
	private int longueur;
	private int nombre_ecailles;
	private String crache_feu;
	private String comportement_amoureux;

	public InfoDragon() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;

	}

	public void setNom(String nom) {
		this.nom = nom;

//		System.out.println("Le nom est: " + nom + ",");
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public int getNombre_ecailles() {
		return nombre_ecailles;
	}

	public void setNombre_ecailles(int nombre_ecailles) {
		this.nombre_ecailles = nombre_ecailles;
	}

	public String isCrache_feu() {
		return crache_feu;
	}

	public void setCrache_feu(String crache_feu) {
		this.crache_feu = crache_feu;
	}

	public String getComportement_amoureux() {
		return comportement_amoureux;
	}

	public void setComportement_amoureux(String comportement_amoureux) {
		this.comportement_amoureux = comportement_amoureux;
	}

//	@Override
//	public String toString() {
//		return "InfoDragon ["
//
//				+ "id=" + id + ", " + "nom =" + nom + ", " + "sexe =" + sexe + ", " + "longueur =" + longueur + ", "
//				+ "nombre_ecailles =" + nombre_ecailles + ", " + "crache_feu =" + crache_feu + ", "
//				+ "comportement_amoureux =" + comportement_amoureux + ", "
//
//				+ "getId()=" + getId() + ", " + "getNom()=" + getNom() + "," + "getSexe()=" + getSexe() + ", "
//				+ "getLongueur()=" + getLongueur() + ", " + "getNombre_ecailles()=" + getNombre_ecailles() + ", "
//				+ "isCrache_feu()=" + isCrache_feu() + ", " + "getComportement_amoureux()=" + getComportement_amoureux()
//				+ ", "
//
//				+ "getClass()=" + getClass() + ", " + "hashCode()=" + hashCode() + ", " + "toString()="
//				+ super.toString()
//
//				+ "]";
//	}
}
