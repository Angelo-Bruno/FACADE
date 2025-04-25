package br.fastfood.facade;
 
import br.fastfood.model.*;
 
public class ComboFacade {
    private Combo combo;
 
    public void criarCombo(int codigo) {
        switch (codigo) {
            case 1:
                combo = new Combo(new Burger("Lanche 1", 25.0),
                                  new Bebida("Bebida 1", 6.0),
                                  new Sobremesa("Sobremesa 1", 12.0));
                break;
            case 2:
                combo = new Combo(new Burger("Lanche 2", 28.0),
                                  new Bebida("Bebida 2", 6.0),
                                  new Sobremesa("Sobremesa 2", 12.0));
                break;
            default:
                System.out.println("Código de combo inválido!");
        }
    }
 
    public void exibirItens() {
        if (combo != null) {
            System.out.println("Itens do Combo:");
            System.out.println(combo.getBurger());
            System.out.println(combo.getBebida());
            System.out.println(combo.getSobremesa());
        } else {
            System.out.println("Nenhum combo foi criado.");
        }
    }
 
    public double getPrecoTotal() {
        if (combo != null) {
            return combo.getBurger().getPreco()
                 + combo.getBebida().getPreco()
                 + combo.getSobremesa().getPreco();
        }
        return 0;
    }
}
