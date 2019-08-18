package sc.br.senai.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author senai
 */
class MySQLConnectionManeger extends ConnectionManager {
    
	//1 nome da sua base de dados
    private static final String NOME_BANCO = "trabalho1";
    //2 caminho para o driver
    private static final String PATH_DRIVER = "com.mysql.jdbc.Driver";
    //3 local onde o banco esta instalado
    private static final String IP_BANCO = "localhost";
    //4 usuario para o banco de dados
    private static final String USR_BANCO = "root";
    //5 senha para o usuario do bando de dados
    private static final String PASS_BANCO = "root";
    //6 url de conexao para o banco de dados
    private static final String CONN = "jdbc:mysql://" + IP_BANCO + "/" + NOME_BANCO;

    MySQLConnectionManeger() {}
    
    @Override
    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(PATH_DRIVER);
            connection = DriverManager.getConnection(CONN, USR_BANCO, PASS_BANCO);
            //7 verifique a msg para saber se esta conectado
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySQLConnectionManeger.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnectionManeger.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
    public void closeConnection(Connection connection) {
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnectionManeger.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
