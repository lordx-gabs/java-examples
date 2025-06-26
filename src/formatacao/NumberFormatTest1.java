package formatacao;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest1 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] numberFormat = new NumberFormat[4];
        numberFormat[0] = NumberFormat.getInstance();
        numberFormat[1] = NumberFormat.getInstance(localeJP);
        numberFormat[2] = NumberFormat.getInstance(localeBR);
        numberFormat[3] = NumberFormat.getInstance(localeIT);
        double value = 10_000.3245;
        for (NumberFormat format : numberFormat) {
            System.out.println(format.format(value));
        }
    }
}
