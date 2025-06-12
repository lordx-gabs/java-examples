package Strings.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        testStringConcatenation(100_000);
        stringBuilder(1_000_000);
        stringBuffer(1_000_000);
    }

    private static void testStringConcatenation(int iterations) {
        String text = "";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            text += i; // ineficiente, cria uma nova string no pool de strings a cada iteração
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String concatenation time: " + (endTime - startTime) + " ms");
    }

    private static void stringBuilder(int iterations) {
        StringBuilder text = new StringBuilder(iterations); // posso passar o tamanho inicial
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            text.append(i); // Eficiente devido à natureza mutável
        }
        long endTime = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (endTime - startTime) + " ms");
    }

    private static void stringBuffer(int iterations) {
        StringBuffer text = new StringBuffer(iterations);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            text.append(i); // Eficiente e thread-safe para quando se trabalha com multiplas threads
        }
        long endTime = System.currentTimeMillis();
        System.out.println("StringBuffer time: " + (endTime - startTime) + " ms");
    }
}
