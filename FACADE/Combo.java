public class Combo {
    Burguer burguer;
    Bebida bebida;
    Sobremesa sobremesa;
    
    public Combo(){
        this.burguer = new Burguer();
        this.bebida = new Bebida();
        this.sobremesa = new Sobremesa();
    }
    public void CriarCombo (int tipo){
        if (tipo ==1 )
        {
          burguer.setDescricao("X Picanha");
          burguer.setPreco(30.50);
          burguer.setGramas(300);
          sobremesa.setDescricao("Sorvete de morango");
          sobremesa.setPreco(12.50);
          sobremesa.setTamanho("Grande");
          bebida.setDescricao("Guarana Jesus");
          bebida.setPreco(7.00);
          bebida.setMl(500);        
        }
        if (tipo == 2)
        {
            burguer.setDescricao("X Frango");
            burguer.setPreco(42.3);
            burguer.setGramas(400);
            sobremesa.setDescricao("Tortinha de Banana");
            sobremesa.setPreco(15.00);
            sobremesa.setTamanho("Pequeno");
            bebida.setDescricao("Coca-cola");
            bebida.setPreco(4.50);
            bebida.setMl(300);        
        }
    }
    public void MostrarCombo()
    {
        double total = sobremesa.getPreco() + burguer.getPreco() + bebida.getPreco();
        System.out.println("-------------------------------");
        System.out.println("Burguer: " +burguer.getDescricao());
        System.out.println("Peso do burguer: " +burguer.getGramas()+ " gramas");
        System.out.println("Preço: " +burguer.getPreco());
        System.out.println("-------------------------------");
        System.out.println("Sobremesa: " +sobremesa.getDescricao());
        System.out.println("Tamanho: " +sobremesa.getTamanho());
        System.out.println("Preço: " +sobremesa.getPreco());
        System.out.println("-------------------------------");
        System.out.println("Bebida: " +bebida.getDescricao());
        System.out.println("Mililitros: " +bebida.getMl()+ "ml");
        System.out.println("Preço: " +bebida.getPreco());
        System.out.println("-------------------------------");
        System.out.println("Total: "+ total);
    }
}