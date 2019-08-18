package jtable;



import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import jtable.dao.CidadeDAO;
import jtable.model.Cidade;


public class DemoViewComJDBC {

    private Tela t;
    private CidadeDAO dao;

    public DemoViewComJDBC() {
        dao = new CidadeDAO();

        t = new Tela();

        //adicionar comportamento ao botao adicionar
        t.jbAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( validacao() ) {

                    //cria uma cidade com os valores do formulario
                    Cidade c = new Cidade(0, t.jtNmCidade.getText(), (String) t.jcbEstado.getSelectedItem());
                    
                    //tenta inserir a cidade no banco
                    c = dao.insert(c);

                    t.dtmDados.addRow(
                            new Object[]{c.getIdCidade(),
                                c.getNmCidade(),
                                c.getSgEstado()
                            });

                    //atualiza a tabela
                    t.jtDados.repaint();

                    //limpa os campos 
                    t.jtIdCidade.setText("");
                    t.jtNmCidade.setText("");

                } else {
                    JOptionPane.showMessageDialog(t,
                            "O campo nome deve estar preenchido",
                            "Atencao", JOptionPane.WARNING_MESSAGE);
                    t.jtNmCidade.requestFocus();
                }
            }
        });

        t.jbRemover.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = t.dtmDados.getRowCount();
                int row = t.jtDados.getSelectedRow();

                if (i > 0 && row > -1) {

                    Cidade c = new Cidade();
                    
                    c.setIdCidade((Integer) t.dtmDados.getValueAt(row, 0));

                    if (dao.delete(c)) {
                        t.dtmDados.removeRow(row);
                        t.jtDados.repaint();
                    } else {
                        JOptionPane.showMessageDialog(t,
                                "Nao foi possivel excluir no banco",
                                "Atencao", JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(t,
                            "Selecione uma linha para remover", "Atencao",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        t.jbEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = t.jtDados.getSelectedRow();

                if (row > -1) {
                    if ( validacao() && !t.jtIdCidade.getText().replaceAll(" ", "").equals("") ) {
                        Cidade c = new Cidade();
                        c.setIdCidade(Integer.parseInt(t.jtIdCidade.getText()));
                        c.setNmCidade(t.jtNmCidade.getText());
                        c.setSgEstado((String) t.jcbEstado.getSelectedItem());

                        dao.update(c);

                        t.dtmDados.setValueAt(t.jtIdCidade.getText(), row, 0);
                        t.dtmDados.setValueAt(t.jtNmCidade.getText(), row, 1);
                        t.dtmDados.setValueAt((String) t.jcbEstado.getSelectedItem(), row, 2);
                    } else {
                        
                        if ( ! validacao() ) {
                            JOptionPane.showMessageDialog(t,
                                "O campo nome deve estar preenchido",
                                "Atencao", JOptionPane.WARNING_MESSAGE);
                            t.jtNmCidade.requestFocus();
                        } else if ( t.jtIdCidade.getText().replaceAll(" ", "").equals("") ) {
                            JOptionPane.showMessageDialog(t,
                                "O id nome deve estar preenchido",
                                "Atencao", JOptionPane.WARNING_MESSAGE);
                            t.jtIdCidade.requestFocus();
                        }
                        
         
                    }
                } else {
                    JOptionPane.showMessageDialog(t,
                            "Para editar selecione uma linha",
                            "Atencao", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        t.jbBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.dtmDados.setRowCount(0);
                Cidade c = new Cidade();
                c.setNmCidade(t.jtNmCidade.getText());

                List<Cidade> cidades = dao.buscarCidadePorNome(c);

                for (Cidade cidade : cidades) {
                    t.dtmDados.addRow(new Object[]{cidade.getIdCidade(), cidade.getNmCidade(), cidade.getSgEstado()});
                }
            }
        });

        t.jbLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.dtmDados.setRowCount(0);

                t.jtIdCidade.setText("");
                t.jtNmCidade.setText("");

            }
        });

        t.jtDados.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = t.jtDados.getSelectedRow();

                t.jtIdCidade.setText(((Integer) t.dtmDados.getValueAt(row, 0)).toString());
                t.jtNmCidade.setText((String) t.dtmDados.getValueAt(row, 1));
                t.jcbEstado.setSelectedItem(t.dtmDados.getValueAt(row, 2));
            }
        });

        t.jtDados.getTableHeader().addMouseListener(new MouseAdapter() { //adiciono o listener nao a um botao, mas ao header
        	
            @SuppressWarnings({"unchecked", "rawtypes"})
            @Override
            public void mouseClicked(MouseEvent e) {
                final int colIndex = t.jtDados.getTableHeader().columnAtPoint(new Point(e.getX(), e.getY()));
                Collections.sort(t.dtmDados.getDataVector(), new Comparator() {
                    @Override
                    public int compare(Object o1, Object o2) {
                        Vector<?> v1 = (Vector<?>) o1;
                        Vector<?> v2 = (Vector<?>) o2;
                        Comparable i1 = (Comparable) v1.get(colIndex); //ao inves do indice fixo, uso o indice da coluna  
                        Comparable i2 = (Comparable) v2.get(colIndex);
                        return i1.compareTo(i2);
                    }
                });
                t.jtDados.repaint();
            }
        });
    }

    private boolean validacao() {
        String nome = t.jtNmCidade.getText();
        nome = nome.trim();

        return !"".equals(nome);
    }

    public void executar() {
        t.setVisible(true);
    }

    public static void main(String[] args) {
        DemoViewComJDBC c = new DemoViewComJDBC();
        c.executar();
    }


}
