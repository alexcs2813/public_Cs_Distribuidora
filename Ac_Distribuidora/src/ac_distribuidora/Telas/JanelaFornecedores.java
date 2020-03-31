package ac_distribuidora.Telas;

import Ac_classes.Ac_Fornecedores;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class JanelaFornecedores extends JFrame {
        JFrame Janela_Fornecedores = new JFrame("Fornecedores");

    JButton button_salvar = new JButton("Salvar");
    JButton button_adicionar = new JButton("Adicionar");
    JButton button_cancelar = new JButton("Cancelar");
    JButton button_voltar = new JButton("Voltar");

    public void JanelaFornecedores() {
        Janela_Fornecedores.setSize(700, 300);
        Janela_Fornecedores.setTitle("Fornecedores");
        Janela_Fornecedores.setLocationRelativeTo(null);
        Janela_Fornecedores.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Janela_Fornecedores.setVisible(true);

        //PAINEL DE ENTRADAS LABELS TEXTFIELS
        JPanel jPanel_Entradas = new JPanel();
        jPanel_Entradas.setLayout(new GridLayout(10, 1));
        Janela_Fornecedores.add(BorderLayout.WEST, jPanel_Entradas);

        JLabel jLabel_Nome = new JLabel("Nome");
        jPanel_Entradas.add(jLabel_Nome);
        JTextField field_Nome = new JTextField(15);
        field_Nome.setEnabled(false);
        jPanel_Entradas.add(field_Nome);

        JLabel jLabel_Contato = new JLabel("Contato");
        jPanel_Entradas.add(jLabel_Contato);
        JTextField field_Contato = new JTextField(15);
        field_Contato.setEnabled(false);
        jPanel_Entradas.add(field_Contato);

        JLabel jLabel_Email = new JLabel("Email");
        jPanel_Entradas.add(jLabel_Email);
        JTextField field_Email = new JTextField(10);
        field_Email.setEnabled(false);
        jPanel_Entradas.add(field_Email);

        JLabel jLabel_Cnpj = new JLabel("Cnpj");
        jPanel_Entradas.add(jLabel_Cnpj);
        JTextField field_Cnpj = new JTextField(15);
        field_Cnpj.setEnabled(false);
        jPanel_Entradas.add(field_Cnpj);

        JLabel jLabel_WhatsApp = new JLabel("WhatsApp");
        jPanel_Entradas.add(jLabel_WhatsApp);
        JTextField field_WhatsApp = new JTextField(15);
        field_WhatsApp.setEnabled(false);
        jPanel_Entradas.add(field_WhatsApp);
        
        //minha tabela
        JPanel jPanel_Tabela = new JPanel();
        Janela_Fornecedores.add(BorderLayout.CENTER, jPanel_Tabela);
        //
        JTable jTable_TabelaFornecedores = new JTable();
        jPanel_Tabela.add(BorderLayout.CENTER, jTable_TabelaFornecedores);

        jTable_TabelaFornecedores.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {"Nome", "Contato", "Email", "CNPJ", "WhatsApp"},},
                new String[]{
                    "Nome", "Contato", "Email", "CNPJ", "WhatsApp"

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

        JPanel jPanel_Botoes = new JPanel();
        Janela_Fornecedores.add(BorderLayout.SOUTH, jPanel_Botoes);
        jPanel_Botoes.setLayout(new GridLayout(1, 4));

        jPanel_Botoes.add(button_adicionar);
        button_adicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                field_Nome.setEnabled(true);
                field_Contato.setEnabled(true);
                field_Email.setEnabled(true);
                field_Cnpj.setEnabled(true);
                field_WhatsApp.setEnabled(true);

                button_salvar.setEnabled(true);
                button_cancelar.setEnabled(true);
                button_adicionar.setEnabled(false);
                button_voltar.setEnabled(false);
            }
        });

        jPanel_Botoes.add(button_salvar);
        button_salvar.setEnabled(false);
        button_salvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Ac_Fornecedores f1 = new Ac_Fornecedores();

                f1.setAc_nome(field_Nome.getText());
                f1.setAc_contato(Integer.parseInt(field_Contato.getText()));
                f1.setAc_email(field_Email.getText());
                f1.setAc_cnpj(Integer.parseInt(field_Cnpj.getText()));
                f1.setAc_whatsap(Integer.parseInt(field_WhatsApp.getText()));

                DefaultTableModel dtmClientes = (DefaultTableModel) jTable_TabelaFornecedores.getModel();
                Object[] dados = {f1.getAc_nome(), f1.getAc_contato(), f1.getAc_email(), f1.getAc_cnpj(), f1.getAc_whatsap()};
                dtmClientes.addRow(dados);

                field_Nome.setText("");
                field_Contato.setText("");
                field_Email.setText("");
                field_Cnpj.setText("");
                field_WhatsApp.setText("");

                button_salvar.setEnabled(false);
                button_cancelar.setEnabled(false);
                button_adicionar.setEnabled(true);
                button_voltar.setEnabled(true);
            }
        });

        jPanel_Botoes.add(button_cancelar);
        button_cancelar.setEnabled(false);
        button_cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                field_Nome.setText("");
                field_Contato.setText("");
                field_Email.setText("");
                field_Cnpj.setText("");
                field_WhatsApp.setText("");

                button_salvar.setEnabled(false);
                button_cancelar.setEnabled(false);
                button_adicionar.setEnabled(true);
                button_voltar.setEnabled(true);

            }
        });

        jPanel_Botoes.add(button_voltar);
        button_voltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Ac_Distribuidora tela1 = new Ac_Distribuidora();

                tela1.Ac_Distribuidora();
                Janela_Fornecedores.dispose();

            }
        });
    }
}
