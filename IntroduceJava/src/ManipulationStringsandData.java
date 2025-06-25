import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class ManipulationStringsandData {
    public static void main(String[] args) {


        String nome = "João";

        /*
        String nome2 = "joão";
        String nome3 = "Ana";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());

        System.out.println(nome.equals(nome2));
        System.out.println(nome.equalsIgnoreCase(nome2));
        */

        LocalDate dataHoje = LocalDate.now();
        Locale br = new Locale("pt", "BR");
        /*
        System.out.println(data.getDayOfWeek().getDisplayName(TextStyle.FULL, br));
        System.out.println(data.getDayOfWeek().getDisplayName(TextStyle.SHORT, br));;
        System.out.println("Em qual dia do ano estamos?: " + data.getDayOfYear());
        */
        LocalTime horaAgora = LocalTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm") ;
        String diaHoje = dataHoje.getDayOfWeek().getDisplayName(TextStyle.FULL, br);
        String saudacao;
        if (horaAgora.getHour() > 0 && horaAgora.getHour() < 12){
            saudacao = "bom dia";
        } else if (horaAgora.getHour() >= 12 && horaAgora.getHour() <= 18) {
            saudacao = "boa tarde";
        } else if (horaAgora.getHour() > 18 && horaAgora.getHour() <= 24) {
            saudacao = "boa noite";
        } else {
            saudacao = "Erro";
        }

       System.out.printf("Olá, %s. Hoje é %s e são %s. %s", nome, diaHoje, horaAgora.format(fmt), saudacao.toUpperCase());
        System.out.println("Olá, " + nome + ". " + "Hoje é " + diaHoje + " e são " + horaAgora.format(fmt) + ". " + saudacao.toUpperCase());
    }
}
