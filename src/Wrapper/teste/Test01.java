package Wrapper.teste;

public class Test01 {
    public static void main(String[] args) {
        byte b = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 1L;
        float floatP = 1.0f;
        double doubleP = 1.0;
        char charP = 'a';
        boolean booleanP = true;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; // Autoboxing
        Long longW = 1L;
        Float floatW = 1.0f;
        Double doubleW = 1.0;
        Character charW = 'a';
        Boolean booleanW = true;

        int i = intW; // Unboxing
        Integer intW2 = Integer.parseInt("1"); // Boxing
    }
}
