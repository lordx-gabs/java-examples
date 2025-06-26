package formatacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest1 {
    public static void main(String[] args) {
        String pattern = "'hoje é dia 'dd 'do mês de 'MMMM 'do ano de 'yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        System.out.println(simpleDateFormat.format(new Date()));
        try {
            System.out.println(
                    simpleDateFormat.parse("hoje é dia 25 do mês de junho do ano de 2025"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
