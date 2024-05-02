public class Sobremesa implements IProduto{
    public String descricao;
    public double preco;
    public String tamanho;

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
    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }
}