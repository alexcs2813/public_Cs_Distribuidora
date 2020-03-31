package Ac_classes;

import ac_distribuidora.ClassesAbstratcs.Ac_Produtos;

public class Ac_Alimentos extends Ac_Produtos {

    protected double Ac_peso;

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

    public String getAc_p() {
        return Ac_p;
    }

    public void setAc_p(String Ac_p) {
        this.Ac_p = Ac_p;
    }

    
    
    
    public double getAc_peso() {
        return Ac_peso;
    }

    public void setAc_peso(double Ac_peso) {
        this.Ac_peso = Ac_peso;
    }
    
        
    
    @Override
    public void Ac_vendido() {

        System.out.println("Vendido");

    }

    public void setAc_Validade(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
