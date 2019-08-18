import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

import sc.br.senai.dao.CidadeDAO;
import sc.br.senai.dao.DAOFactory;
import sc.br.senai.model.Cidade;

/**
 * @author senai
 */
public class TesteDAO extends JFrame {

	private static final String TODOS = "TODOS";

	private static final long serialVersionUID = -1085093155653336886L;

	private JComboBox jcCidade = null;
	private JPanel jp = null;
	private JTextField jtNameCidade = null;
	private JTextField jtIdCidade = null;
	private JButton jbCadastrar = null;
	private JButton jbEditar = null;
	private JButton jbProcurar = null;
	private JButton jbDeletar = null;
	private JButton jbLimpar = null;
	private JComboBox jcEstado = null;

	public TesteDAO() {
		this.setTitle("Teste DAO");
		this.setSize(200, 200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = this.getContentPane();

		CidadeDAO dao = DAOFactory.getCidadeDAO();

		jcCidade = new JComboBox( dao.findAll().toArray() );
		jcEstado = new JComboBox(new String[] {"SC", "RS", "PR", TODOS });

		c.add(BorderLayout.SOUTH, jcCidade);

		iniciComponents();

		c.add(BorderLayout.CENTER, jp);
	}

	private void iniciComponents() {
		jp = new JPanel();
		jp.setLayout(new GridLayout(5, 2));

		jtNameCidade = new JTextField();
		jtIdCidade = new JFormattedTextField();
		
		//Validacao para inserir somente numeros
		jtIdCidade.setDocument( new PlainDocument() {  
			private static final long serialVersionUID = 3154698405456811787L;

			@Override  
            public void insertString( int offs, String str, AttributeSet a ) throws BadLocationException {  
                //normalmente apenas uma letra é inserida por vez,  
                //mas fazendo assim também previne caso o usuário  
                //cole algum texto
                for( int i = 0; i < str.length(); i++ ) {
                	if( !Character.isDigit( str.charAt( i ) ) ) {
                		return;  
                	} 
                }
                super.insertString( offs, str, a );  
            }  
        });
		
		jbCadastrar = new JButton("Cadastrar");
		jbCadastrar.setMnemonic(KeyEvent.VK_C);
		jbCadastrar.setEnabled(false);
		
		jbEditar = new JButton("Alterar");
		jbEditar.setMnemonic(KeyEvent.VK_E);
		
		jbProcurar = new JButton("Buscar");
		jbProcurar.setMnemonic(KeyEvent.VK_B);
		
		jbDeletar = new JButton("Deletar");
		jbDeletar.setMnemonic(KeyEvent.VK_D);
		
		jbLimpar = new JButton("Limpar");
		jbLimpar.setMnemonic(KeyEvent.VK_L);
		
		enableJButtons(false);

		JLabel lid = new JLabel("ID", SwingConstants.CENTER);
		JLabel lnome = new JLabel("Nome", SwingConstants.CENTER);

		jbCadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				Cidade c = getCidade();
				
				if ( c != null ) {
					c = DAOFactory.getCidadeDAO().salvar(c);
					setCidade(c);
					jcEstado.addItem(c);
				}
			}
		});

		jbEditar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				Cidade c = getCidade();
				
				if ( c != null ) {
					DAOFactory.getCidadeDAO().alterar(c);
					atualizaComboCidade();
				}
			}
		});

		jbProcurar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Cidade c = new Cidade();
				c.setNmCidade(jtNameCidade.getText());
				List<Cidade> cidades = DAOFactory.getCidadeDAO().buscaCidadesPorNome(c);
				atualizaComboCidade( cidades );
			}
		});

		jbDeletar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Cidade c = getCidade();
				
				if ( c != null ) {
					DAOFactory.getCidadeDAO().deletar(c);
					atualizaComboCidade();
				} 
				
			}
		});

		jcCidade.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					Cidade c = (Cidade) jcCidade.getSelectedItem();
					setCidade(c);
				}
			}
		});

		jcEstado.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent ie) {
				if ( ie.getStateChange() == ItemEvent.SELECTED ) {
					String uf = (String) jcEstado.getSelectedItem();
					
					boolean allSelect = TODOS.equalsIgnoreCase( uf );
					
					if ( allSelect ){
						uf = null;
					} 
					
					jbCadastrar.setEnabled( !allSelect );
					jbEditar.setEnabled( !allSelect );
					
					Cidade c = new Cidade();
					c.setSgEstado(uf);

					List<Cidade> cidades = DAOFactory.getCidadeDAO().buscaCidadesPorUF(c);
					atualizaComboCidade(cidades);
				}
			}
		});
		
		jbLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jtIdCidade.setText("");
				jtNameCidade.setText("");
			}
		});
		
		/**
		 * Evento que verifica se ha algo em jtIdCidade
		 * habilitando e desabilitando os botoes editar e deletar
		 * que precisam do id
		 */
		jtIdCidade.getDocument().addDocumentListener( new DocumentListener() {
			
			
			@Override
			public void removeUpdate(DocumentEvent de) {
				boolean enabled = jtIdCidade != null && !"".equals( jtIdCidade.getText() );
				enableJButtons(enabled);
			}
			
			@Override
			public void insertUpdate(DocumentEvent de) {
				boolean enabled = jtIdCidade != null && !"".equals( jtIdCidade.getText() );
				enableJButtons(enabled);
			}
			
			@Override
			public void changedUpdate(DocumentEvent de) {}
		});
		
		/**
		 * Evento que verifica se ha algo em jtNameCidade
		 * habilitando e desabilitando o botao cadastrar
		 */
		jtNameCidade.getDocument().addDocumentListener( new DocumentListener() {
			
			
			@Override
			public void removeUpdate(DocumentEvent de) {
				boolean enabled = jtNameCidade != null && !"".equals( jtNameCidade.getText() );
				jbCadastrar.setEnabled(enabled);
			}
			
			@Override
			public void insertUpdate(DocumentEvent de) {
				boolean enabled = jtNameCidade != null && !"".equals( jtNameCidade.getText() );
				jbCadastrar.setEnabled(enabled);
			}
			
			@Override
			public void changedUpdate(DocumentEvent de) {}
		});


		jp.add(lid);
		jp.add(lnome);
		jp.add(jtIdCidade);
		jp.add(jtNameCidade);
		jp.add(jcEstado);
		jp.add(jbLimpar);
		jp.add(jbCadastrar);
		jp.add(jbEditar);
		jp.add(jbProcurar);
		jp.add(jbDeletar);

	}
	
	private void atualizaComboCidade(List<Cidade> cidades) {
		jcCidade.removeAllItems();
		
		if (cidades.isEmpty()) {
			jtIdCidade.setText("");
			jtNameCidade.setText("");
		}
		for (Cidade cidade : cidades) {
			jcCidade.addItem(cidade);
		}
	}
	
	public Cidade getCidade() {
		Cidade c = new Cidade();
		String uf = (String) jcEstado.getSelectedItem();
			
		boolean isNotNullOrBlack = jtIdCidade.getText() != null && !jtIdCidade.getText().equals("");
		
		if ( isNotNullOrBlack ) {
			c.setIdCidade( Integer.parseInt( jtIdCidade.getText() ) );
		}
		
		c.setNmCidade( jtNameCidade.getText() );
		c.setSgEstado( uf );
	
		return c;
	}
	
	public void enableJButtons(boolean enabled) {
		jbEditar.setEnabled(enabled);
		jbDeletar.setEnabled(enabled);
	}
	
	public void setCidade(Cidade c) {
		jtIdCidade.setText(String.valueOf(c.getIdCidade()));
		jtNameCidade.setText(c.getNmCidade());
		jcEstado.setSelectedItem(c.getSgEstado());
	}

	private void atualizaComboCidade() {
		atualizaComboCidade( DAOFactory.getCidadeDAO().findAll() );
	}

	public static void main(String[] args) {
		TesteDAO t = new TesteDAO();
		t.setVisible(true);
	}
}
