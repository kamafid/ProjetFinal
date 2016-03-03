package com.sdz.connection;




public class SdzConnection{

	/**
	 * URL de connection
	 */
	private static String url = "jdbc:postgresql://localhost:5432/Ecole";
	/**
	 * Nom du user
	 */
	private static String user = "postgres";
	/**
	 * Mot de passe du user
	 */
	private static String passwd = "postgres";
	/**
	 * Objet Connection
	 */
	private static Connection connect;
	
/**
	 * M�thode qui va retourner notre instance
	 * et la cr�er si elle n'existe pas...
	 * @return
	 */
	public static Connection getInstance(){
		if(connect == null){
			try {
				connect = DriverManager.getConnection(url, user, passwd);
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "ERREUR DE CONNEXION ! ", JOptionPane.ERROR_MESSAGE);
			}
		}		
		return connect;	
	}
	
	
}