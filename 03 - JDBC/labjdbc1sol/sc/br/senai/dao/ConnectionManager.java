package sc.br.senai.dao;

import java.sql.Connection;
import java.util.ResourceBundle;

/**
 * @author senai
 */
public abstract class ConnectionManager {

	private static final String MY_SQL = "mysql";
	private static final String ORACLE = "oracle";
	private static final String SQL_SERVER = "mssql";

	private static ConnectionManager cm = null;
	
	public abstract Connection getConnection();
	public abstract void closeConnection(Connection connection);


	public static ConnectionManager getInstance() {
		if (cm == null) {
			ResourceBundle bundle = ResourceBundle.getBundle("propriedade");
			String tpBanco = bundle.getString("tpbanco");

			if (tpBanco.equals(MY_SQL)) {
				cm = new MySQLConnectionManeger();
			} else if (tpBanco.equals(ORACLE)) {
				cm = new OracleConnectionManeger();
			} else if (tpBanco.equals(SQL_SERVER)) {
				//
			} else {
				cm = new MySQLConnectionManeger();
			}
		}

		return cm;
	}
}
