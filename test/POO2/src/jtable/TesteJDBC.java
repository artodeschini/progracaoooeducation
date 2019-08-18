package jtable;

import java.util.List;
import java.util.Scanner;
import jtable.dao.CidadeDAO;
import jtable.model.Cidade;


/**
 *
 * @author artur
 */
public class TesteJDBC {

    public static void main(String[] args) {
        String menu =
                "1 - adicinar cidade"
                + "\n2 - alterar cidade"
                + "\n3 - excluir cidade"
                + "\n4 - consultar cidades por nome"
                + "\n5 - consultar cidades por esgado"
                + "\n6 - sair";

        System.out.println(menu);
        Scanner leia = new Scanner(System.in);

        CidadeDAO dao = new CidadeDAO();
        Cidade cidade = new Cidade();

        int op = valida( leia.next() );
        
        List<Cidade> cidades = null;

        while ( op != 6 ) {
            switch ( op ) {
                case 1:
                    System.out.println("Digite o nome da cidade");
                    cidade.setNmCidade( leia.next() );

                    System.out.println("digite a sigla do estado");
                    cidade.setSgEstado( leia.next() );

                    dao.insert( cidade );

                    break;
                case 2:
                    System.out.println("Digite o nome da cidade a alterar");
                    cidade.setNmCidade( leia.next() );

                    System.out.println("digite a sigla do estado a alterar");
                    cidade.setSgEstado( leia.next() );

                    System.out.println("digite o id da cidade a aletar");
                    cidade.setIdCidade( valida( leia.next() ) );

                    dao.update(cidade);

                    break;
                case 3:

                    System.out.println("Qual cidade deseja deletar");
                    cidade.setIdCidade( valida( leia.next() ) );

                    dao.delete(cidade);

                    break;
                case 4:

                    System.out.println("Digite o nome da cidade");
                    cidade.setNmCidade( leia.next() );
                    cidade.setSgEstado(null);

                    cidades = dao.buscarCidadePorNome(cidade);

                    for (Cidade c : cidades) {
                        System.out.println(c);
                    }

                    break;
                    
                case 5:

                    System.out.println("Digite a sigla nome do estado");
                    cidade.setNmCidade( null );
                    cidade.setSgEstado( leia.next() );

                    cidades = dao.buscarCidadePorEstado(cidade);

                    for (Cidade c : cidades) {
                        System.out.println(c);
                    }

                    break;
                default:
                    System.out.println("Opcao invalida");

            }

            System.out.println(menu);
            op = valida( leia.next() );

        }
        
        leia.close();
    }

    /**
     * @autor artur
     * @param valor 
     * @return int
     */
    public static int valida(String valor) {
        if ( valor != null ) {
          valor = valor.replaceAll(" ", "");  
        }
        if (  ! valor.equals("") ) {
            if ( valor.length() == 1 ) {
                return valor.charAt(0) - 48;
            } else {
                boolean onlyDigit = true;
                
                for (int i = 0; i < valor.length(); i++) {
                    if ( ! Character.isDigit( valor.charAt(i) ) ) {
                        onlyDigit = false;
                        break;
                    }
                    
                    if ( onlyDigit ) {
                        return Integer.parseInt( valor );
                    }
                }
            }
        }
        return 666;
    }
}
