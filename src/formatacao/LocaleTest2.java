package formatacao;

import java.util.Locale;

public class LocaleTest2 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] countries = Locale.getISOCountries();
        String[] languages = Locale.getISOLanguages();
        for (String language : languages) {
            System.out.print(language + " ");
        }
        System.out.println();
        for (String country : countries) {
            System.out.print(country + " ");
        }
    }
}
