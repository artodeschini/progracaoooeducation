package sc.br.senai.dao;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * @author senai
 */
public class TesteConnection {
	
	public static void main(String[] args) throws SQLException {
		//1 Obtenha uma instancia de ConnectionManager
		ConnectionManager cm = ConnectionManager.getInstance();
		
		//2 Obtenha uma conexao por meio de ConnectionManager
		Connection connection = cm.getConnection();
		
		//3 Obtenha uma instancia de DatabaseMetaData por meio da conexao
		DatabaseMetaData dm = connection.getMetaData();
		
		//4 verifique a versao do driver que você está utilizando
		System.out.println("Versao do driver: ");
		System.out.print( dm.getDriverVersion() );
		
		//5 verifique a versao do bando de dados que voce esta utilizando
		System.out.println("\nVersao do bando de dados: ");
		System.out.print( dm.getDatabaseProductVersion() );
		
		//6 verifique se o o banco de dados tem suporte a transacoes
		System.out.println("\nSuporte a transacoes? ");
		System.out.print( dm.supportsTransactions() ? "Sim" : "Nao");
		
		//7 veririque se o banco tem suporte a select for update (bloqueios).
		System.out.println("\nSuporte a select for update (bloqueios) ? ");
		System.out.print( dm.supportsSelectForUpdate() ? "Sim" : "Nao");

		//8 listando as tabelas do banco 
		String catalog = null;
		String schemaPattern = null;
		String tableNamePattern = null;
		String[] types = null;

		ResultSet result = dm.getTables( catalog, schemaPattern, tableNamePattern, types );

		System.out.println("\nlistando as tabelas do banco com suas chaves primarias ");
		
		while ( result.next() ) {
		    String tableName = result.getString(3);
		    System.out.println( tableName );
		    
		    ResultSet resultpk = dm.getPrimaryKeys( catalog, schemaPattern, tableName);

		    while ( resultpk.next() ){
		        String pk = resultpk.getString(4);
		        System.out.println("PK da tabela " + pk );
		    }
		}
		
		//9 verificando se o banco suporta geracoes de chaves
		System.out.println("Suporte a geracao de chaves ");
		System.out.print( dm.supportsGetGeneratedKeys() ? "Sim" : "Nao");

		//10 verifique se o banco tem suporte a group by
		System.out.println("\nSuporte a group by ");
		System.out.print( dm.supportsGroupBy() ? "Sim" : "Nao");

		//11 vrifique se o banco tem supote a outer joins
		System.out.println("\nSuporte a outer joins ");
		System.out.print( dm.supportsOuterJoins() ? "Sim" : "Nao");


		//3 feche a conexao com o banco de dados utilizando ConnectionManager
		cm.closeConnection(connection);
	}
}
