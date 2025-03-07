package exceptions.runtime.teste;

import java.util.Objects;

public class RuntimeExceptionTeste01 {
    //Checked E unchecked
    // se estender de Exception é checked, precisa tratar se não nem builda
    // se estender runtime exception é unchecked, não precisa tratar, culpa sua, melhora o código
    public static void main(String[] args) {
        Object object = null;
        System.out.println(object.toString());
    }

}
