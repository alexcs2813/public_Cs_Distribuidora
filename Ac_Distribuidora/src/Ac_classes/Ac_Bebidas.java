package Ac_classes;

import ac_distribuidora.ClassesAbstratcs.Ac_Produtos;

public class Ac_Bebidas extends Ac_Produtos {

    private int Ac_Litros;

    public String getAc_nome() {
        return Ac_nome;
    }

    public void setAc_nome(String Ac_nome) {
        this.Ac_nome = Ac_nome;
    }

    public double getAc_preco() {
        return Ac_preco;
    }

    public void setAc_preco(double Ac_preco) {
        this.Ac_preco = Ac_preco;
    }

    public String getAc_marca() {
        return Ac_marca;
    }

    public void setAc_marca(String Ac_marca) {
        this.Ac_marca = Ac_marca;
    }

    public boolean isAc_perecivel() {
        return Ac_perecivel;
    }

    public void setAc_perecivel(boolean Ac_perecivel) {
        this.Ac_perecivel = Ac_perecivel;
    }

    public int getAc_Validade() {
        return Ac_Validade;
    }

    public void setAc_Validade(int Ac_Validade) {
        this.Ac_Validade = Ac_Validade;
    }

   

    public int getAc_Litros() {
        return Ac_Litros;
    }

    public void setAc_Litros(int Ac_Litros) {
        this.Ac_Litros = Ac_Litros;
    }

    @Override
    public void Ac_vendido() {

    }

    @Override
    public void Ac_saiDaVailidade() {

    }
}
