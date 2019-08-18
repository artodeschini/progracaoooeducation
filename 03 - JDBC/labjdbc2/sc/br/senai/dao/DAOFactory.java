package sc.br.senai.dao;

/**
 * @author senai
 */
public abstract class DAOFactory {

	private static CidadeDAO cidadeDAO;

	public static CidadeDAO getCidadeDAO() {
		if (cidadeDAO == null) {
			cidadeDAO = new ImplCidadeDAO();
		}

		if (cidadeDAO.isConnectionClose()) {
			cidadeDAO.openConnection();
		}

		return cidadeDAO;
	}
}
