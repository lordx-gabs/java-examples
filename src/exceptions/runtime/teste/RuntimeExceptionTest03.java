package exceptions.runtime.teste;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abrirConexao();
    }

    private static String abrirConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo no arquivo");
            return "Conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando o arquivo");
        }
        return null;
    }

    private static void abrirConexa2() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo no arquivo");
        } finally {
            System.out.println("Fechando o arquivo");
        }
    }
}
