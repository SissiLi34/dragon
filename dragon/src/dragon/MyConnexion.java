package dragon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyConnexion {

	static Connection accessDataBase = null;

	/**
	 * Testons le connexion
	 * 
	 * @param args
	 */

	// méthode qui permet de créer une connexion
	public static void openConnection() {
		/* Parametres de connexion */
		String url = "jdbc:mysql://127.0.0.1/dragons";
		// nesti = nom de ma bdd
		String utilisateur = "root";
		String motDePasse = "";
		try {
			System.out.println("try to connect");
			// on ajoute nos paramètres
			accessDataBase = DriverManager.getConnection(url, utilisateur, motDePasse);
		} catch (SQLException ex) {
			Logger.getLogger(MyConnexion.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	/**
	 * True si la connexion est OK
	 *
	 * @return
	 */

	// méthode qui permet de tester si la connexion est ouverte
	public static boolean testConnection() {
		boolean flag = false;
		try {
			if (accessDataBase != null) {
				if (!accessDataBase.isClosed()) {
					System.out.println("Connexion au serveur... OK");
					flag = true;
				}
			}
		} catch (SQLException ex) {
			Logger.getLogger(MyConnexion.class.getName()).log(Level.SEVERE, null, ex);
		}
		return flag;
	}

	// fermeture de la connexion qui est faite à la fin du script principal
	// eviter de faire des ouverture et fermeture pour de petites requetes

	public static void closeConnection() {
		if (accessDataBase != null) {
			try {
				accessDataBase.close();
				System.out.println("Close connection");
			} catch (SQLException e) {
				System.err.println("Erreur fermreture: " + e.getMessage());
			}
		}
	}
}
