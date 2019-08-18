package sc.br.senai.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

class OracleConnectionManeger extends ConnectionManager {
	
	private static final String NOME_BANCO = "trabalho1";
	private static final String PATH_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String IP_BANCO = "localhost";
	private static final String USR_BANCO = "root";
	private static final String PASS_BANCO = "root";
	private static final String CONN = "jdbc:oracle:thin:@" + IP_BANCO + "/"+ NOME_BANCO;

	OracleConnectionManeger() {}

	@Override
	public Connection getConnection() {
		return getConnection(true);
	}

	public Connection getConnection(boolean useTransaction) {
		Connection connection = null;
		try {
			Class.forName(PATH_DRIVER);
			connection = DriverManager.getConnection(CONN, USR_BANCO,PASS_BANCO);
			connection.setAutoCommit(useTransaction);
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(OracleConnectionManeger.class.getName()).log(Level.SEVERE, null, ex);
		} catch (SQLException ex) {
			Logger.getLogger(OracleConnectionManeger.class.getName()).log(Level.SEVERE, null, ex);
		}
		return connection;
	}

	public void closeConnection(Connection connection) {
		closeConnection(connection, false);
	}

	public void closeConnection(Connection connection, boolean useTranscation) {
		try {
			if (useTranscation) {
				connection.commit();
			}

			connection.close();
		} catch (SQLException ex) {
			Logger.getLogger(OracleConnectionManeger.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
