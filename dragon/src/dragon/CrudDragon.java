package dragon;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrudDragon {
	/*
	 * Ici on test
	 * 
	 * @param args the command line arguments
	 */

	static public List<InfoDragon> getAllDragons() {
		//

		// cr�ation du tableau
		List<InfoDragon> dragons = new ArrayList<>();

		try {

			Statement declaration = MyConnexion.accessDataBase.createStatement();
			// pr�paration de la requ�te de r�cup�ration des dragons
			// String query = "SELECT id, nom, sexe, longueur, nombre_ecailles, crache_feu,
			// comportement_amoureux FROM dragon;";
			String query = "SELECT * FROM dragons;";

			// pr�paration des r�sultats de la requ�te
			ResultSet resultat = declaration.executeQuery(query);

			// R�cup�ration des donn�es dans l'arraylist
			while (resultat.next()) {
				// cr�ation d'un dragon pour lui affecter les r�sultats dragon = new dragon()�;
				InfoDragon dragon = new InfoDragon();

				// dragon.setId_dragon(resultat.getInt(1));
				dragon.setId(resultat.getInt("id_dragon"));

				// les diff�rents �l�ments � set du dragon
				dragon.setNom(resultat.getString("dragon"));
				dragon.setSexe(resultat.getString("sexe"));
				dragon.setLongueur(resultat.getInt("longueur"));
				dragon.setNombre_ecailles(resultat.getInt("nombre_ecailles"));

				dragon.setCrache_feu(resultat.getString("crache_feu"));
				dragon.setComportement_amoureux(resultat.getString("comportement_amoureux"));

				// ajout du dragon cr�e � notre arraylist dragons

				dragons.add(dragon);
				// afficher le dragon cr�e et ajout� � l'arraylist�
				System.out.println(dragon.getNom());
			}
		} catch (Exception e) {
			// recuperer les exception et dire pourquoi cela n'a pas march�;
			System.err.println("Erreur d'affichage d'ing: " + e.getMessage());
			Scanner scanner = new Scanner(System.in);
			System.out.println("Choisissez un dragon � modifier:");
			String str = scanner.nextLine();
		}
		return dragons;

	}

	/**
	 * 
	 * @param ingredientdragon
	 * @return // true si insertion r�ussite
	 */

	// Cr�ation d'un nouveau dragon.
	public static boolean createByNamePrepared(int id_dragon, String dragon, String sexe, int longueur,
			int nombre_ecailles, String crache_feu, String comportement_amoureux) {
		boolean success = false;
		try {
			String query = "INSERT INTO `dragons`(`id_dragon`,`dragon`,`sexe`,`longueur`,`nombre_ecailles`,`crache_feu`,`comportement_amoureux`) VALUES (?, ?, ?, ?, ?, ?, ?)";

			PreparedStatement declaration = MyConnexion.accessDataBase.prepareStatement(query);
			declaration.setInt(1, id_dragon);
			declaration.setString(2, dragon);
			declaration.setString(3, sexe);
			declaration.setInt(4, longueur);
			declaration.setInt(5, nombre_ecailles);
			declaration.setString(6, crache_feu);
			declaration.setString(7, comportement_amoureux);

			boolean executeCreate = declaration.execute();
			success = (executeCreate);
		} catch (SQLException e) {
			System.err.println("Erreur ajout d'un dragon: " + e.getMessage());
		}
		return success;
	}

	public static boolean deleteByNamePrepared(int id_dragon) {
		boolean success = false;
		try {
			String query = "DELETE FROM `dragons` WHERE id_dragon = ?";
			PreparedStatement declaration = MyConnexion.accessDataBase.prepareStatement(query);
			declaration.setInt(1, id_dragon);
			int executeUpdate = declaration.executeUpdate();
			success = (executeUpdate == 1);
		} catch (SQLException e) {
			System.err.println("Erreur suppression de dragon: " + e.getMessage());
		}
		return success;
	}

	public static boolean updateByNamePrepared(int id_dragon, String dragons, String sexe, int longueur,
			int nombre_ecailles, String crache_feu, String comportement_amoureux) {
		boolean success = false;
		try {
//			String query = "UPDATE dragons SET  ? = ?  WHERE dragons.dragon = ?";
			String query = "UPDATE dragons SET id_dragon =?,dragon=?, sexe=?, longueur=?, nombre_ecailles=?, crache_feu=?, comportement_amoureux=? WHERE dragon = ?";
			PreparedStatement declaration = MyConnexion.accessDataBase.prepareStatement(query);
			// je pr�pare une requete
			declaration.setInt(1, id_dragon);
			declaration.setString(2, dragons);
			declaration.setString(3, sexe);
			declaration.setInt(4, longueur);
			declaration.setInt(5, nombre_ecailles);
			declaration.setString(6, crache_feu);
			declaration.setString(7, comportement_amoureux);
			declaration.setInt(8, id_dragon);
			int executeUpdate = declaration.executeUpdate();
			success = (executeUpdate == 1);
		} catch (SQLException e) {
			System.err.println("Erreur suppression dragon: " + e.getMessage());
		}
		return success;
	}

}
