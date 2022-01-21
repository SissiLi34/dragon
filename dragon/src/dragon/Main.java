package dragon;

public class Main {

	public static void main(String[] args) {

		MyConnexion.openConnection();
//		MyConnexion.testConnection();
//		MyConnexion.closeConnection();
		CrudDragon.getAllDragons();
		// CrudDragon.createByNamePrepared(10, "lolo", "male", 145, 5000, "oui",
		// "sincere");
		// CrudDragon.deleteByNamePrepared(10);
		// CrudDragon.updateByNamePrepared(10, "Sissi", "femelle", 145, 5000, "oui",
		// "sincere");
		// "sincere");
	}
}