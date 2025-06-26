package formatacao;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest2 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] numberFormat = new NumberFormat[4];
        numberFormat[0] = NumberFormat.getCurrencyInstance();
        numberFormat[1] = NumberFormat.getCurrencyInstance(localeJP);
        numberFormat[2] = NumberFormat.getCurrencyInstance(localeBR);
        numberFormat[3] = NumberFormat.getCurrencyInstance(localeIT);
        double value = 1000.32;
        for (NumberFormat format : numberFormat) {
            System.out.println(format.getMaximumFractionDigits());
            format.setMaximumFractionDigits(2);
            System.out.println(format.format(value));
        }

        String valorString = "1.000,32 €";
        try {
            numberFormat[3].parse(valorString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
