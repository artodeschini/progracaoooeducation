package jtable;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class Tela extends JFrame {

	private static final long serialVersionUID = -1061558588378809487L;
	
	public JPanel jpCampos, jpBotoes;
    public JTextField jtIdCidade, jtNmCidade;
    public JLabel jlIdCidade, jlNmCidade, jlSgEstado;
    public JComboBox<String> jcbEstado;
    public JButton jbAdicionar, jbRemover, jbEditar, jbBuscar, jbLimpar;
    public JTable jtDados;
    public DefaultTableModel dtmDados;

    public Tela() {
        //altera o titulo do JFrame
        this.setTitle("Cadastro Demo JDBC");
        //ao clicar no botao fechar ... ira fechar o Frame e matar o processo
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setLocationRelativeTo( null );

        //paineis
        jpCampos = new JPanel(new GridLayout(3, 2));
        jpBotoes = new JPanel();

        //campos de texto
        jtNmCidade = new JTextField();
        
        jtIdCidade = new JTextField();
        jtIdCidade.setDocument(new PlainDocument() {
            
			private static final long serialVersionUID = -1937762675165162574L;

			//evita se sejam digitados qualquer valor que nao seja numerico
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                for (int i = 0; i < str.length(); i++) {
                    if ( !Character.isDigit( str.charAt(i) ) ) {
                        return;
                    }
                }
                super.insertString(offs, str, a);
            }
        });


        //combobox
        jcbEstado = new JComboBox<String>(new String[]{"SC", "RS", "PR"});

        //criacao dos rotulos /  JLabel
        jlIdCidade = new JLabel("id:* ", SwingConstants.RIGHT);
        jlNmCidade = new JLabel("Cidade: ", SwingConstants.RIGHT);
        jlSgEstado = new JLabel("Estado: ", SwingConstants.RIGHT);

        //adicionando os campos ao paneil
        jpCampos.add(jlIdCidade);
        jpCampos.add(jtIdCidade);
        jpCampos.add(jlNmCidade);
        jpCampos.add(jtNmCidade);
        jpCampos.add(jlSgEstado);
        jpCampos.add(jcbEstado);

        //criacao dos botoes
        jbAdicionar = new JButton("Adicionar");
        jbAdicionar.setMnemonic(KeyEvent.VK_A);

        jbRemover = new JButton("Remover");
        jbRemover.setMnemonic(KeyEvent.VK_R);

        jbEditar = new JButton("Editar");
        jbEditar.setMnemonic(KeyEvent.VK_E);

        jbBuscar = new JButton("Buscar");
        jbBuscar.setMnemonic(KeyEvent.VK_B);

        jbLimpar = new JButton("Limpar");
        jbLimpar.setMnemonic(KeyEvent.VK_L);

        //adicionar os botoes ao paneil de botoes
        jpBotoes.add(jbAdicionar);
        jpBotoes.add(jbRemover);
        jpBotoes.add(jbEditar);
        jpBotoes.add(jbBuscar);
        jpBotoes.add(jbLimpar);

        //dados da tabela
        dtmDados = new DefaultTableModel(
                new Object[][]{},
                new String[]{"Codigo", "Nome", "Estado"}) {
            
            //inner class
            private static final long serialVersionUID = 8194555421684351570L;
             
            //faz com que as celulas da tabela nao sejam editaveis
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        //criar a tabela com os seu dados;
        jtDados = new JTable( dtmDados ) {
            //inner class
            private static final long serialVersionUID = 8194555421684351570L;

            //este método torna possivel zebrar a Jtable
            @Override
            public Component prepareRenderer(TableCellRenderer renderer, int rowIndex, int vColIndex) {
                Component c = super.prepareRenderer(renderer, rowIndex, vColIndex);
                if (rowIndex % 2 == 0 && !isCellSelected(rowIndex, vColIndex)) {
                    c.setBackground(Color.WHITE);
                } else {
                    c.setBackground(Color.LIGHT_GRAY);
                }
                return c;
            }
        };


        //centraliza os dados na coluna
        jtDados.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            //inner class
            private static final long serialVersionUID = -7460277028688076984L;

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                this.setHorizontalAlignment(CENTER);

                return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            }
        });

        //faz so ser selecionado uma linha na tabela
        jtDados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        Container c = this.getContentPane();

        //adicionar os componentes ao frame
        c.add(BorderLayout.NORTH, jpCampos);
        c.add(BorderLayout.CENTER, new JScrollPane(jtDados));
        c.add(BorderLayout.SOUTH, jpBotoes);

        //calcula o tamanho do frame
        this.pack();
        this.setMinimumSize(this.getPreferredSize());

        /* 
         * O código abaixo é para centralizar o frame no centro da tela
         */
        //dimensao da tela
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        //dimensao do frame
        Dimension frame = this.getPreferredSize();

        //coloca a o frame no centro da tela
        setLocation((screen.width / 2) - (frame.width / 2), (screen.height / 2) - (frame.height / 2));
    }
}
