package exceptions.error.teste;

public class StackOverFlow {
    public static void main(String[] args) {
        //deu um Error, que não pode ser tratado
        recursividade();
    }

    public static void recursividade() {
        recursividade();
    }
}
