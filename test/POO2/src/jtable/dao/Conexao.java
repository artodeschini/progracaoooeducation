package jtable.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static Connection getConexao() {
		try {
			// Carregando o JDBC Driver padrao
			String driverName = "com.mysql.jdbc.Driver";
			Class.forName(driverName);
			// Configurando a nossa conexão com um banco de dados//
			String serverName = "localhost"; // caminho do servidor do BD
			String mydatabase = "demojdbc"; // nome do seu banco de dados
			String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
			String username = "root"; // nome de um usuario de seu BD
			String password = ""; // sua senha de acesso
			Connection connection = DriverManager.getConnection(url, username, password);
			return connection;
			
		} catch (ClassNotFoundException e) { // Driver nao encontrado
			System.out.println("O driver expecificado nao foi encontrado.");
			return null;
			
		} catch (SQLException e) {
			// Não conseguindo se conectar ao banco
			System.out.println("Nao foi possivel conectar ao Banco de Dados.");
			return null;
		}

	} // fim do metodo Connection

}// fim da classe
