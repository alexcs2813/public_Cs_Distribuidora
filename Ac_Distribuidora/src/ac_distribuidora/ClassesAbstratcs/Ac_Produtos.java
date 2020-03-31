package ac_distribuidora.ClassesAbstratcs;

public abstract class Ac_Produtos {

    protected String Ac_nome;
    protected double Ac_preco;
    protected String Ac_marca;
    protected boolean Ac_perecivel;
    protected String Ac_p;

    protected int Ac_Validade;

    public String getAc_p() {
        return Ac_p;
    }

    public void setAc_p(String Ac_p) {
        this.Ac_p = Ac_p;
    }

    public int getAc_Validade() {
        return Ac_Validade;
    }

    public void setAc_Validade(int Ac_Validade) {
        this.Ac_Validade = Ac_Validade;
    }

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

    public void Ac_vendido() {

    }

    public void Ac_saiDaVailidade() {

    }

}
