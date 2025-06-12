package Strings.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Lucas"; // String constant pool, são imutáveis
        String nome2 = "Lucas";
        nome.concat(" Oliveira");
        System.out.println(nome == nome2); // compara a referência do objeto, se apontam para o mesmo objeto na memória

        String nome3 = new String("Lucas"); // variavel de referencia, 2 objeto tipo string,
        // 3 uma string na pool de strings
        System.out.println(nome2 == nome3); // compara a referência
        System.out.println(nome2 == nome3.intern()); // compara a referência
    }
}
