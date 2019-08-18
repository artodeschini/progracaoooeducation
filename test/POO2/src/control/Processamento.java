/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author daniel.s.oliveira
 */
public class Processamento {
    
    public static String concatenar(String texto1, String texto2) throws Exception{
        if (texto1 .equals( "daniel"))
            throw new Exception("texto 1 nao pode ser `daniel`");
        return texto1 + " " + texto2;
    }
    
    boolean login(String usuario, String senha){
        
        return false;
    }
    
}
