package enumeracao;

import org.jetbrains.annotations.Nullable;

public enum PersonType {
    FISICA(1, "Pessoa FISICA") {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    },
    JURIDICA(2, "Pessoa JURIDICA") {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.2;
        }
    };

    private int valor;
    private String descricao;

    PersonType(int valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getValor() {
        return valor;
    }

    public abstract double calcularDesconto(double valor);

    @Nullable
    public static PersonType valueOfDescricao(String descricao) {
        for (PersonType tipoClient : values()) {
            if(tipoClient.getDescricao().equals(descricao)) {
                return tipoClient;
            }
        }
        return null;
    }
}
