package fatec.introdutorio.ex2;

public class Invoice {
    private int numero;
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public Invoice(int numero, String descricao, int quantidade, double precoUnitario) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = (quantidade > 0) ? quantidade : 0;
        this.precoUnitario = (precoUnitario > 0) ? precoUnitario : 0.0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = (quantidade > 0) ? quantidade : 0;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = (precoUnitario > 0) ? precoUnitario : 0.0;
    }

    public double getInvoiceAmount() {
        return quantidade * precoUnitario;
    }
}
