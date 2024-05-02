public class Bebida implements IProduto{
    public String descricao;
    public double preco;
    public int ml;

    @Override
    public String getDescricao() {
        return descricao;
    }
    @Override
    public void setDescricao(String descricao) {
     this.descricao = descricao;
    }
    @Override
    public double getPreco() {
        return preco;
    }
    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getMl() {
        return ml;
    }
    public void setMl(int ml){
        this.ml = ml;
    }
}