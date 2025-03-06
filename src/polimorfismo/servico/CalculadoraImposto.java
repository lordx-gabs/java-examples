package polimorfismo.servico;

import polimorfismo.dominio.Produto;
import polimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Tomate tomate) {
            String dataValidade = tomate.getDataValidade();

            System.out.println(dataValidade);
        }
    }
}
