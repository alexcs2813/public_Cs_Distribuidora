package ac_distribuidora.Telas;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.*;
import javax.swing.JPanel;

public class Ac_Distribuidora {

    public void Ac_Distribuidora() {
        telaInicial();
    }

    public void telaInicial() {

        //janela principal
        JFrame janela1 = new JFrame();
        janela1.setSize(350, 250);
        janela1.setLocationRelativeTo(null);
        janela1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela1.setVisible(true);

        //PAINEIS
        JPanel JPanel_1 = new JPanel();
        JPanel_1.setLayout(new GridLayout(3, 2));

        JButton JButton_ok = new JButton("Clientes");
        JButton_ok.addActionListener((ActionEvent ae) -> {
            Ac_JanelaClientes jc1 = new Ac_JanelaClientes();

            janela1.dispose();
            jc1.Ac_JanelaClientes();

        });
        JPanel_1.add(JButton_ok);

        JButton JButton_produtos = new JButton("Produtos");
        JButton_produtos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JanelaProdutos jp1 = new JanelaProdutos();

                janela1.dispose();
                jp1.JanelaProdutos();
            }
        });

        JPanel_1.add(JButton_produtos);

        JButton JButton_pedidos = new JButton("Pedidos");
        JButton_pedidos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JanelaPedidos jp1 = new JanelaPedidos();
                janela1.dispose();
                jp1.JanelaPedidos();
            }

        });

        JPanel_1.add(JButton_pedidos);

        JButton JButton_Fornecedores = new JButton("Fornecedores");
        JButton_Fornecedores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JanelaFornecedores jf1 = new JanelaFornecedores();
                janela1.dispose();
                jf1.JanelaFornecedores();

            }
        });
        JPanel_1.add(JButton_Fornecedores);

        JButton JButton_entradaSaida = new JButton("E/S");
        JButton_entradaSaida.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JanelaEntradaSaida je1 = new JanelaEntradaSaida();

                janela1.dispose();
                je1.JanelaEntradaSaida();
            }
        });

        JPanel_1.add(JButton_entradaSaida);

        JButton JButton_sn = new JButton("Exit");
        JButton_sn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        JPanel_1.add(JButton_sn);

        janela1.add(JPanel_1);
        janela1.setVisible(true);//janela fica visivel se tiver verdadeiro

    }

    public static void main(String[] args) {
        Ac_Distribuidora t1 = new Ac_Distribuidora();
        t1.telaInicial();

    }
}
