package ac_distribuidora.Telas;

import Ac_classes.Ac_Alimentos;
import Ac_classes.Ac_Bebidas;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class JanelaProdutos extends JFrame {
        JFrame Janela_Produtos = new JFrame("Produtos");

    JButton button_salvar = new JButton("Salvar");
    JButton button_adicionar = new JButton("Adicionar");
    JButton button_cancelar = new JButton("Cancelar");
    JButton button_voltar = new JButton("Voltar");

    JRadioButton jRadioButton_perecivel = new JRadioButton("Sim");
    JRadioButton jRadioButton_naoperecivel = new JRadioButton("Não");

    Ac_Bebidas b1 = new Ac_Bebidas();
    Ac_Alimentos alim = new Ac_Alimentos();

    public void JanelaProdutos() {

        Janela_Produtos.setSize(700, 300);
        Janela_Produtos.setTitle("Produtos");
        Janela_Produtos.setLocationRelativeTo(null);
        Janela_Produtos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Janela_Produtos.setVisible(true);

        //painel oeste com label e textfild
        JPanel JPanel_entradas = new JPanel();
        JPanel_entradas.setLayout(new GridLayout(11, 1));
        Janela_Produtos.add(BorderLayout.WEST, JPanel_entradas);

        //painel west
        JPanel JPanel_tabela = new JPanel();
        JPanel_tabela.setLayout(new GridLayout(5, 1));
        Janela_Produtos.add(BorderLayout.CENTER, JPanel_tabela);

        //boatao north
        JButton b = new JButton();
        b.setEnabled(false);
        Janela_Produtos.add(BorderLayout.NORTH, b);

        //conteudos painel west
        JLabel jLabe_nome = new JLabel("Nome");
        JPanel_entradas.add(jLabe_nome);

        JTextField c_nome = new JTextField(10);
        c_nome.setEnabled(false);

        JPanel_entradas.add(c_nome);

        JLabel jLabe_preco = new JLabel("Preço");
        JPanel_entradas.add(jLabe_preco);

        JTextField c_preco = new JTextField(10);
        c_preco.setEnabled(false);
        JPanel_entradas.add(c_preco);

        JLabel jLabe_marca = new JLabel("Marca");
        JPanel_entradas.add(jLabe_marca);

        JTextField c_marca = new JTextField(10);
        c_marca.setEnabled(false);
        JPanel_entradas.add(c_marca);

        JLabel jLabe_perecivel = new JLabel("Perecivel");
        JPanel_entradas.add(jLabe_perecivel);

        //radio button SIM
        JPanel_entradas.add(jRadioButton_perecivel);

        jRadioButton_perecivel.setEnabled(false);
        jRadioButton_perecivel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                alim.setAc_perecivel(true);

            }
        });

        JPanel_entradas.add(jRadioButton_naoperecivel);

        //radio button NÃO
        jRadioButton_naoperecivel.setEnabled(false);
        jRadioButton_naoperecivel.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {

                alim.setAc_perecivel(false);
                System.out.println("");
            }
        });

        ButtonGroup simenao = new ButtonGroup();

        simenao.add(jRadioButton_perecivel);
        simenao.add(jRadioButton_naoperecivel);

        JLabel jLabe_validade = new JLabel("Validade");
        JPanel_entradas.add(jLabe_validade);

        JTextField c_validade = new JTextField(10);
        c_validade.setEnabled(false);
        JPanel_entradas.add(c_validade);

        //painel do centro com uma tabela somente
        JTable jTable_tabelaprodutos = new JTable();
        Janela_Produtos.add(BorderLayout.CENTER, jTable_tabelaprodutos);

        jTable_tabelaprodutos.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {"Nome", "Preço", "Marca", "Perecivel", "Validade"},},
                new String[]{
                    "Nome", "Preço", "Marca", "Perecivel", "Validade"

                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }

        });

        //painel sul e seus botoes
        JPanel jPanel_table = new JPanel();
        Janela_Produtos.add(BorderLayout.SOUTH, jPanel_table);
        jPanel_table.setLayout(new GridLayout(1, 4));

        //BOTOES
        //botao ADICIONAR
        button_adicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                button_salvar.setEnabled(true);
                button_cancelar.setEnabled(true);
                button_voltar.setEnabled(false);
                button_adicionar.setEnabled(false);

                c_nome.setEnabled(true);
                c_preco.setEnabled(true);
                c_marca.setEnabled(true);
                c_validade.setEnabled(true);
                jRadioButton_perecivel.setEnabled(true);
                jRadioButton_naoperecivel.setEnabled(true);
            }
        });

        jPanel_table.add(button_adicionar);

        //boatao SALVAR
        button_salvar.setEnabled(false);

        button_salvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                alim.setAc_nome(c_nome.getText());
                alim.setAc_preco(Integer.parseInt(c_preco.getText()));
                alim.setAc_marca(c_marca.getText());
                alim.setAc_Validade(Integer.parseInt(c_validade.getText()));

                if (alim.isAc_perecivel()) {
                    alim.setAc_p("sim");
                } else {
                    alim.setAc_p("não");

                }

                DefaultTableModel dtmProdutos = (DefaultTableModel) jTable_tabelaprodutos.getModel();
                Object[] dados = {alim.getAc_nome(), alim.getAc_preco(), alim.getAc_marca(), alim.getAc_p(), alim.getAc_Validade()};
                dtmProdutos.addRow(dados);

                c_nome.setText("");
                c_preco.setText("");
                c_marca.setText("");
                c_validade.setText("");
                button_salvar.setEnabled(false);
                button_cancelar.setEnabled(false);
                button_voltar.setEnabled(true);
                button_adicionar.setEnabled(true);

                c_nome.setEnabled(false);
                c_preco.setEnabled(false);
                c_marca.setEnabled(false);
                c_validade.setEnabled(false);
                jRadioButton_perecivel.setEnabled(false);
                jRadioButton_naoperecivel.setEnabled(false);
            }
        });

        jPanel_table.add(button_salvar);

        //BOTAO CANCELAR
        button_cancelar.setEnabled(false);
        button_cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                button_salvar.setEnabled(false);
                button_cancelar.setEnabled(false);
                button_voltar.setEnabled(true);
                button_adicionar.setEnabled(true);

                c_nome.setText("");
                c_preco.setText("");
                c_marca.setText("");
                c_validade.setText("");

                c_nome.setEnabled(false);
                c_preco.setEnabled(false);
                c_marca.setEnabled(false);
                c_validade.setEnabled(false);
                jRadioButton_perecivel.setEnabled(false);
                jRadioButton_naoperecivel.setEnabled(false);
            }
        });

        jPanel_table.add(button_cancelar);

        //BOTAO VOLTAR
        button_voltar.setEnabled(true);
        button_voltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Ac_Distribuidora tela1 = new Ac_Distribuidora();

                tela1.Ac_Distribuidora();
                Janela_Produtos.dispose();

            }
        });

        jPanel_table.add(button_voltar);
                
    }
}
