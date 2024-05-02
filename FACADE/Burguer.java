public class Burguer implements IProduto{
    public String descricao;
    public double preco;
    public int gramas;

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
    public int getGramas() {
        return gramas;
    }
    public void setGramas(int gramas){
        this.gramas = gramas;
    }
}