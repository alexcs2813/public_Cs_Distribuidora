package ac_distribuidora.Telas;

import Ac_classes.Ac_Clientes;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Ac_JanelaClientes extends JFrame {

    JButton button_salvar = new JButton("Salvar");
    JButton button_adicionar = new JButton("Adicionar");
    JButton button_cancelar = new JButton("Cancelar");
    JButton button_voltar = new JButton("Voltar");
    
    Ac_Clientes c1 = new Ac_Clientes();

    public void Ac_JanelaClientes() {

        JFrame Ac_JanelaClientes = new JFrame("Produtos");
        Ac_JanelaClientes.setSize(800, 300);
        Ac_JanelaClientes.setLocationRelativeTo(null);
        Ac_JanelaClientes.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Ac_JanelaClientes.setVisible(true);

        JPanel jPanel_Entradas = new JPanel();
        jPanel_Entradas.setLayout(new GridLayout(10, 1));
        Ac_JanelaClientes.add(BorderLayout.WEST, jPanel_Entradas);

        JPanel jPanel_Tabela = new JPanel();
        Ac_JanelaClientes.add(BorderLayout.CENTER, jPanel_Tabela);

        JPanel jPanel_botoes = new JPanel();
        jPanel_botoes.setLayout(new GridLayout(1, 4));
        Ac_JanelaClientes.add(BorderLayout.SOUTH, jPanel_botoes);

        //minhas entradas labeles e textsfilds
        JLabel jLabel_Nome = new JLabel("Nome");
        jPanel_Entradas.add(jLabel_Nome);

        JTextField field_Nome = new JTextField(30);
        jPanel_Entradas.add(field_Nome);
        field_Nome.setEnabled(false);

        JLabel jLabel_Endereco = new JLabel("Endereço");
        jPanel_Entradas.add(jLabel_Endereco);

        JTextField field_Endereco = new JTextField(30);
        jPanel_Entradas.add(field_Endereco);
        field_Endereco.setEnabled(false);

        JLabel jLabel_Contato = new JLabel("Contato");
        jPanel_Entradas.add(jLabel_Contato);

        JTextField field_Contato = new JTextField(30);
        jPanel_Entradas.add(field_Contato);
        field_Contato.setEnabled(false);

        JLabel jLabel_Email = new JLabel("Email");
        jPanel_Entradas.add(jLabel_Email);

        JTextField field_Email = new JTextField(30);
        jPanel_Entradas.add(field_Email);
        field_Email.setEnabled(false);

        JLabel jLabel_WhatsApp = new JLabel("WhatsApp");
        jPanel_Entradas.add(jLabel_WhatsApp);

        JTextField field_WhatsApp = new JTextField(30);
        jPanel_Entradas.add(field_WhatsApp);
        field_WhatsApp.setEnabled(false);

        //declaração da tabela
        JTable jTable_TabelaClientes = new JTable();
        jPanel_Tabela.add(jTable_TabelaClientes);

        jTable_TabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {"Nome", "Endereço", "Contato", "Email", "WhatsApp"},},
                new String[]{
                    "Nome", "Endereço", "Contato", "Email", "WhatsApp"

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

//BOTOES
        jPanel_botoes.add(button_adicionar);
        button_adicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                field_Nome.setEnabled(true);
                field_Endereco.setEnabled(true);
                field_Contato.setEnabled(true);
                field_Email.setEnabled(true);
                field_WhatsApp.setEnabled(true);

                button_salvar.setEnabled(true);
                button_cancelar.setEnabled(true);
                button_adicionar.setEnabled(false);
                button_voltar.setEnabled(false);
            }
        });

        jPanel_botoes.add(button_salvar);
        button_salvar.setEnabled(false);
        button_salvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                c1.setAc_Nome(field_Nome.getText());
                c1.setAc_Endereco(field_Endereco.getText());
                c1.setAc_Contato(Integer.parseInt(field_Contato.getText()));
                c1.setAc_Email(field_Email.getText());
                c1.setAc_WhatsApp(Integer.parseInt(field_WhatsApp.getText()));
                
                
                DefaultTableModel dtmClientes = (DefaultTableModel) jTable_TabelaClientes.getModel();
                Object[] dados = {c1.getAc_Nome(), c1.getAc_Endereco(), c1.getAc_Contato(), c1.getAc_Email(), c1.getAc_WhatsApp()};
                dtmClientes.addRow(dados);

                field_Nome.setText("");
                field_Endereco.setText("");
                field_Contato.setText("");
                field_Email.setText("");
                field_WhatsApp.setText("");

                button_salvar.setEnabled(false);
                button_cancelar.setEnabled(false);
                button_adicionar.setEnabled(true);
                button_voltar.setEnabled(true);
            }
        });

        jPanel_botoes.add(button_cancelar);
        button_cancelar.setEnabled(false);
        button_cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                field_Nome.setText("");
                field_Endereco.setText("");
                field_Contato.setText("");
                field_Email.setText("");
                field_WhatsApp.setText("");

                button_salvar.setEnabled(false);
                button_cancelar.setEnabled(false);
                button_adicionar.setEnabled(true);
                button_voltar.setEnabled(true);

            }
        });

        jPanel_botoes.add(button_voltar);
        button_voltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Ac_Distribuidora tela1 = new Ac_Distribuidora();

                tela1.Ac_Distribuidora();
                Ac_JanelaClientes.dispose();

            }
        });

    }

}
