/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosaula07;

/**
 *
 * @author catia.silveira
 */
public class TestaCurso {
    public static void main(String[] args) {
        String nomeCurso = "Curso de croche";
        String descricaoCurso = "Neste curso voce ira aprender tudo sobre croche";
        String codigo = "ct1";
        int cargaHoraria = 40;
        //Chamada ao construtor com parametros de inicializacao da classe Curso
        Curso curso1 = new Curso();
        curso1.inicializaCurso(nomeCurso, descricaoCurso, codigo, cargaHoraria);
        curso1.imprime();
    }    
}
