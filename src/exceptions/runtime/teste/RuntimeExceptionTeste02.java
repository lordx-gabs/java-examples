package exceptions.runtime.teste;

public class RuntimeExceptionTeste02 {
    public static void main(String[] args) {
        try {
            System.out.println(divide(1, 0));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    private static int divide(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento inválido");
        }
        return a / b;
    }
}
