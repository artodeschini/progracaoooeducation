/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entidades.Cliente;
import java.util.ArrayList;
import model.ClienteDAO;

/**
 *
 * @author daniel.s.oliveira
 */
public class TesteClienteDao {
    
    public static void main(String[] args) {
        
        String nome = "siqueira";
        //String telefone = "32222222222";
        
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        
        //cliente.setTelefone(telefone);
        
        ClienteDAO clienteDao = new ClienteDAO();
        
        //clienteDao.insert( cliente );
        
        ArrayList<Cliente> clientes = clienteDao.select();
        for(Cliente c : clientes){
            System.out.println(c);
        }
        
    }
    
}
